package generics;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		// vectors are weird arraylists
		
		// bad old days
		Vector stuff = new Vector();
		
		// not as bad old days
		Vector<String> stuff2 = new Vector<String>();
		
		// the fairly ok now days
		Vector<String> stuff3 = new Vector<>();
		
		
		String a = "Hello";
		String b = "World";
		Integer notString = new Integer(4);
		stuff.add(a);
		stuff.add(b);
		stuff.add(notString);
		
		System.out.println(stuff.size());
		String w = (String) stuff.get(0);
		// have to cast because the return is object
		
		//String c = (String) stuff.get(2);
		// get will always give back an object
		// so we have to cast it
		
		System.out.println(w);
		
		// safer
		stuff2.add(a);
		stuff2.add(b);
		//stuff2.add(notString);
		// can't add the int because the 
		// vector only takes strings
		String x = stuff2.get(0);

		Holder<String> stringHolder = new Holder<>("Hi");
		Holder<Integer> intHolder = new Holder<>(42);
		System.out.println(stringHolder.getContent());
		System.out.println(intHolder.getContent());
		String s2 = stringHolder.getContent();
		//Integer i2 = stringHolder.getContent();
		
	}

}
