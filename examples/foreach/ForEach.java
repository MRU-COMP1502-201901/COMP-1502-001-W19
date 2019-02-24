import java.util.ArrayList;

public class ForEach {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		for (Integer i : numbers)
		{
			System.out.println(i);
		}
		
		String bob = "Bob";
		System.out.println(bob);
		bob += " is awesome";
		System.out.println(bob);
	}
	
}
