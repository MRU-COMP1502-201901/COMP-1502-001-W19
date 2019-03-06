
public class Main {

	public static void main(String[] args) {

		Thing a = new Thing(1, 'a', "Hello");
		Thing b = new Thing(1, 'a', "Hello");
		Thing c = new Thing(2, 'z', "World");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
	/*	Thing a = new Thing(1, 'a', "Hello");
		System.out.println(a);
		// this is a "shallow copy"
		// both refer to the 
		// *same object* in memory
		Thing b = new Thing(a);
		System.out.println(b);
		a.setX(10);
		System.out.println(a);
		System.out.println(b);
		
		ThingHolder holder1 = new ThingHolder(a);
		System.out.println(holder1);
		a.setY('z');
		System.out.println(a);
		System.out.println(holder1);
		
		Thing z = holder1.getThing();
		z.setZ("World");
		System.out.println(holder1);*/
		
	}

}
