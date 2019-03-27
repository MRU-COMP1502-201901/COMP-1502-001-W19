
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ExceptionMain {

	// since the code was broken up so much in class I'm reorganizing it
	// into several methods

	public static void main(String[] args) throws IOException {

		// bonus material for today, System.err is like System.out
		// but for errors
		System.err.println("I'm not ok!");
		// java has some quirks about how it prints these to the console
		// so things printed to one or the other may arrive in a different
		// order (take COMP 2531 for more details)

		// eclipse is polite and colours err red so we can see its not out

		// java uses this by default for any exception that bubbles up to the top.

		example1();

		System.out.println();

		example2();

		System.out.println();

		example3();

		System.out.println();

		example4();

		System.out.println();

		example5();

		System.out.println("Done");
	}

	public static void example1() {
		// read through both throwUnchecked and throwChecked first
		try {
			throwUnchecked();
		} catch (RuntimeException e) {
			System.err.println("There was an unchecked problem, but I caught it.");
		}

		try {
			throwChecked();
		} catch (Exception e) {
			System.err.println("There was a checked problem, but I caught it.");
		}
		// the try catch blocks let us handle the code
		// with unchecked exceptions java will automatically throw them up to the
		// method that called this one if they're not handled and if they're never
		// caught the JVM will crash and print an error message, including the exception
		// with checked exceptions you must explicitly tell java (and other programmers)
		// that the exception will be thrown.

	}

	public static void example2() {
		// here we'll call doSomething 3 times with different
		// arguments and it will throw different exceptions
		// we can catch those different arguments and handle them
		// differently (if you can recover from an exception great
		// but you might just be able to provide some information)
		try {
			doSomething(-12);
		} catch (IllegalArgumentException e) {
			System.err.println("Wrong Argument: " + e.getMessage());
			// note that we can get information from the exception object
			// (that's the thing that's created when we throw new...
			// it should at a minimum have a message for you to look at
		} catch (IllegalStateException e) {
			System.err.println("Wrong State: " + e.getMessage());
		}

		try {
			doSomething(11);
		} catch (IllegalArgumentException e) {
			System.err.println("Wrong Argument: " + e.getMessage());
		} catch (IllegalStateException e) {
			System.err.println("Wrong State: " + e.getMessage());
		}

		try {
			doSomething(12);
		} catch (IllegalArgumentException e) {
			System.err.println("Wrong Argument: " + e.getMessage());
		} catch (IllegalStateException e) {
			System.err.println("Wrong State: " + e.getMessage());
		}

		// if you're going to do the same thing for 2 unrelated exceptions
		// (like IllegalArgumentException and IllegalStateException) you can
		// use the "multi-catch"

		try {
			doSomething(-11);
		} catch (IllegalArgumentException | IllegalStateException e) {
			System.err.println("Wrong Something: " + e.getMessage());
		}

	}

	public static void example3() {
		// all io exceptions have to be checked so readFile1 needs them
		// to be in the method header (but they're not part of the signature)
		try {
			readFile();
		} catch (FileNotFoundException e) {
			System.err.println("Not able to find file " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Well something is wrong.");
			e.printStackTrace();
		}
		// note that FileNoteFoundException extends IOException,
		// as such it has to be put first so that it can be seen otherwise
		// java will handle it as an IO Exception and skip the FileNotFoundException
		// if you don't care about the subclass you can also leave it out and it
		// will be handled by the superclass
	}

	public static void throwUnchecked() {
		// when something goes wrong in a method we need to handle it
		System.out.println("I'm working right now");
		// the throw keyword tells java to stop its normal work flow and attend
		// to this problem right now
		// the actual exception object provides information about what happened,
		// but the throw keyword stop java running
		// we didn't have to tell java that anything was going to happen because
		// we're throwing a RuntimeException (which is *unchecked*)
		throw new RuntimeException();
		// this line is unreachable because java has stopped running the method
		// at this point and passed it back to where it was called from to handle
		// System.out.println("This should happen next");
	}

	public static void throwChecked() throws Exception {
		System.out.println("I'm working right now");
		// we have to tell java that this method will throw an exception if
		// it's not a runtime exception
		throw new Exception();
		// notice that we can instantiate both classes, generally you want to
		// use one of the subclasses so that you can provide more detail about
		// what's going wrong
	}

	public static void doSomething(int x) {
		// usually we'll be trying to do something in a method and then discover that
		// we can't actually do the thing we want to do

		System.out.println("Working...");

		// you'll do a test where something won't be right, in this case we
		// need x to be non-negative if when the method was called a negative number
		// was passed in we can't proceed, so we can throw an IllegalArgumentException
		// to let the caller know
		if (x < 0) {
			throw new IllegalArgumentException("x must be non-negative");
		}

		// you might also encounter an error where in the instance variables
		// of your object are wrong in those cases you might use an
		// IllegalStateException, we'll use that here so that we can throw a different
		// kind of exception, but we'll cheat and just look if the arg was negative
		// since
		// we don't have a real object
		if (x % 10 == 1) {
			throw new IllegalStateException("x must not be odd");
		}

		System.out.println("Done Working");

	}

	public static void readFile() throws FileNotFoundException, IOException {

		Scanner s = new Scanner(new File("bob"));
		int x = s.nextInt();
		s.close();
	}

	public static void example4() {

		// finally lets us clean up after we've either finished or had
		// an error

		// also note that we can nest try catch blocks
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("bob")));
			try {
				String x = reader.readLine();
			} catch (IOException e) {
				// the reader can be created but things can still go wrong
				System.err.println("I can't read it!");
			} finally {
				// here the reader has been created and opened
				// and we have to close it
				try {
					reader.close();
				} catch (IOException e) {
					// but it can fail so there's another try catch needed
					// (try with resources is so much nicer)
					System.err.println("I can't read it!");
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("Not able to find the file bob");
		} finally {
			// nothing to do here because the reader was never created
		}
	}

	public static void example5() {

		// try with resources allows java to handle closing our
		// reader afterwards, s will be available throughout
		// the try block and we don't have to close it at the end
		try (Scanner s = new Scanner(new File("bob"))) {
			int x = s.nextInt();
		} catch (IOException e) {
			System.err.println("I can't read it!");
		}
	}

	public static void doThing1() throws IOException {
		System.out.println("1");
		doThing2(2);
		System.out.println("2");
		doThing2(-2);
		System.out.println("3");
	}

	public static void doThing2(int arg) throws IOException {
		// Scanner s = new Scanner(new File("bob"));

		if (arg < 0) {
			throw new IllegalArgumentException("argument < 0");
		}
		System.out.println("I'm ok");
	}

}
