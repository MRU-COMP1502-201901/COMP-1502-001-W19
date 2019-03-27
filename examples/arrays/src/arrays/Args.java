package arrays;

public class Args {
	
	// Java can start running any code with a main with *this* signature 
	public static void main(String[] args) {
		// the args are all values taken from the operating system 
		// and passed in to our program here
		
		
		// they are all strings are we can handle them as any other array
		for (String s : args) {
			System.out.println(s);
		}
		
		// to get more complex behaviour, like using flags to change behaviours
		// there are libraries, but for the most part we can look through the args 
		// and see if what we need is there
		
		// we can check the number of args
		if (args.length != 2) {
			System.err.println("Usage: Args <arg1> <arg2>");
			// usually if we get the wrong args we print a usage message
		}
		
		// when using the arguments we should probably copy them into 
		// meaningful variable names
		String originalFileName = args[0];
		String copyFileName = args[1];
	
			// then they can be used as useful 
	//	copyFile(originalFileName, copyFileName);
		
	}
	
	

}
