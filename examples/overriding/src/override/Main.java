package override;

public class Main {

	public static void main(String[] args) {

		SuperClass s1 = new SuperClass(1);
		
		s1.act();
		
		System.out.println();
		
		SubClass1 c1 = new SubClass1(2, "I'm alive!");
		
		c1.act();
		System.out.println("Message: " + c1.getMessage());

		System.out.println();
		
		SubClass2 c2 = new SubClass2(3);
		
		c2.act();
		
		System.out.println();
		
		SuperClass s2 = new SubClass2(4);
		
		s2.act();
		
		System.out.println();
		
		SubSubClass1a x1 = new SubSubClass1a(5, "I'm a sub sub class (1)");
		
		x1.act();
		
		System.out.println();
		
		SubSubClass2a y1 = new SubSubClass2a(6);
		
		y1.act();
		
		System.out.println();
		
		SubSubClass2b y2 = new SubSubClass2b(7);
		
		y2.act();
		
		System.out.println();
		
	}

}
