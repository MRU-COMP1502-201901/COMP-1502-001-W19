package arrays;


public class ArrayMain {

	public static void main(String[] args) {
		 
		int[] intArray;
		intArray = new int[50];
//		intArray = new int[1];
//		intArray = new int[10000];
		
		System.out.println(intArray[0]);
		intArray[3] = 17;
		System.out.println(intArray[3]);

		//System.out.println(intArray[-1]);
		
		for (int i = 0; i < intArray.length; i++) {
			// always use array.length to ensure that you don't
			// write past the end of the array
			intArray[i] = i * 5;
		}
		
		intArray = new int[25];
		for (int i = 0; i < intArray.length; i++) {

			System.out.println(intArray[i]);
		}
		int[] biggerArray = new int[20];
		for (int i = 0; i < biggerArray.length; i++) {
			System.out.println(biggerArray[i]);
		}
		
		for (int i = 0; i < intArray.length; i++) {
			biggerArray[i] = intArray[i];
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		for (int i = 0; i < biggerArray.length; i++) {
			System.out.println(biggerArray[i]);
		}

		
		
//		String[] stringArray = new String[5];
//		System.out.println(stringArray[1]);
//		System.out.println(stringArray);
		

	}

}
