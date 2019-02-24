import java.util.ArrayList;

public class ClassMemberExample {

	public static void main(String[] args) {
		
		System.out.println(Thing.G);
		ArrayList<Thing> things = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			things.add(new Thing());
		}
		
		for (Thing t : things) {
			System.out.println(t);
		}
		
	}
	
	
}
