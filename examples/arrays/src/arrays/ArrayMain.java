package arrays;

import java.util.*;

public class ArrayMain {

	public static void main(String[] args) {

		
		//int[] is the type of the array, note that an array of its is different than
		// an int
		// all the elements of the array are created at the same time and set to the type's
		//default value (0 for numbers, false for booleans, null for objects)
		
		int[] intArray = new int[5];
		// an array of one is basically a primitive variable with a complicated access
//		intArray = new int[1];
		// we can make any size array we want, but java has some practical limits 
		// (around 4 billion elements)
//		intArray = new int[100000000000000000];
		
		// we can get the length of the array with the .length field
		System.out.println(intArray.length);
		// notice this is the size we passed in, it doesn't care if we have used
		// any of the elements
		
		// we can access arrays by putting the index we want in the array operator 
		// (that's the square brackets thingy)
		// we can also store values that way.
		
		System.out.println(intArray[0]);
		intArray[3] = 17;
		System.out.println(intArray[3]);
		System.out.println();

		// java will throw an exception if you try to access an element that's 
		// not in the array
		// remember indices go from 0 to the size - 1
		//System.out.println(intArray[-1]);
		//System.out.println(intArray[50]);
		//System.out.println(intArray[500]);
		
		// we will usually process arrays using loops, the for loop before
		// is pretty normal
		for (int i = 0; i < intArray.length; i++) {
			// always use array.length to ensure that you don't
			// write past the end of the array
			intArray[i] = i * 5;
		}
		
		// you can also use a for each loop
		for (int x : intArray) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		// you can also pass arrays to methods to use
		printIntArray(intArray);
		
		// you can re-initalize arrays if you want to change the array
		// you're referencing
		intArray = new int[10];
		printIntArray(intArray);
		
		// if you want to copy data between arrays you have to 
		// do a manual copy
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i * 2;
		}
		
		System.out.println("intArray:");
		printIntArray(intArray);
		
		int[] biggerArray = new int[20];
		// we only need to copy as many elements as were in the original array.
		for (int i = 0; i < intArray.length; i++) {
			biggerArray[i] = intArray[i];
		}
		System.out.println("Copy:");
		printIntArray(biggerArray);
				
		
		// arrays work with both primitive types and objects 
		String[] stringArray = new String[5];
		stringArray[0] = "Hello";
		stringArray[1] = "World";
		System.out.println(stringArray[1]);
	
		// initalizer
		int[] initalizedArray = {1, 2};
		// no new, java does that for you
		// can only do this on first initalization
		System.out.println(initalizedArray.length);
		// as always, arrays have no toString so don't print useful 
		// information
		System.out.println(initalizedArray);
		// so you will often want a utility method to make it easier
		printIntArray(initalizedArray);
		System.out.println();


		// jump to the 2d arrays part
		twoDArrays();
		System.out.println();

	}
	
	/**
	 * Convenient method to print out an array of integers 
	 * @param array
	 */
	public static void printIntArray(int[] array) {
		// notice that the type matters, we can't use this method to print
		// an array of booleans or chars or strings
		
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	/**
	 * Just to keep the 2d stuff together
	 */
	public static void twoDArrays() {
		// we can make 2 dimensional arrays
		// these are effectively arrays of arrays of a type
		// but we can also thinking of them as grids of the type
		// in this case a grid with 3 rows and 10 columns
		int[][] twod = new int[3][10];
		// you initialize 2d arrays the same as 1d, but adding how many you want in
		// the new call
		
		// you access the elements of the array by putting in two coordinates
		twod[1][2] = 10;
		System.out.println(twod[0][0]);
		System.out.println(twod[1][2]);
		System.out.println();
		// you can think of this as the row,column pair you need to find them
		// or as the yth element of the xth array (for array[x][y]).
		
		
		int[][] times = new int[7][7];
		
		// processing will usually be done with 2 loops and inner and an outer
		for (int i = 0; i < times.length; i++) {
			// outer is usually indexed i and is for rows
			for (int j = 0; j < times[i].length; j++) {
				// inner is usually indexed j and is for columns
				times[i][j] = i * j;
			}
		}
		
		
		// keep in mind that this *is* an array of arrays, so if we 
		// use our method that prints one array out we can pass it each array
		// from the 2d array
		System.out.println(times[5]);
		System.out.println();
		// and we can use for each on these as well
		for (int[] row : times) {
			printIntArray(row);
		}
		System.out.println();
		
		// we can also do everything we can do with 2d arrays
		// with 2d array lists (even if it's messier)
		ArrayList<ArrayList<Integer>> twodal = new ArrayList<>();
		// here we create a new arraylist of arraylists
		// then we have to make an array list to put in the array list of array lists
		twodal.add(new ArrayList<>());
		// then we can get the first array and add some values to it
		twodal.get(0).add(10);
		twodal.get(0).add(20);
		// repeat for a second array (remember indices start at 0, so 1 is the 2nd)
		twodal.add(new ArrayList<>());
		twodal.get(1).add(15);
		twodal.get(1).add(25);
		// if we want to get a particular value, we must first get the array list it's in
		// then get the value from that array list
		System.out.println(twodal.get(0).get(0));
		// and java is smart enough to print array lists nicely for us
		System.out.println(twodal);
		System.out.println();
		
	}

}
