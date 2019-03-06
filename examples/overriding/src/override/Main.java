package override;

public class Main {

	public static void main(String[] args) {

		Thing t = new Thing();
		t.doStuff();
		
		System.out.println();
		SubThing s = new SubThing();
		s.doStuff();
		s.doOtherStuff();
		
		
		System.out.println();
		// can always reference a sub class as the super class
		Thing t2 = s;
		SubThing s2 = (SubThing) t2;
		t2.doStuff();
		s2.doOtherStuff();
		t2.yell();
		
		
		SuperClass s1 = new SuperClass(1);
		
		s1.act();
		
		System.out.println();
		
		SubClass1 c1 = new SubClass1(2, "I'm alive!");
		
		System.out.println(c1 instanceof SubClass1);
		System.out.println(c1 instanceof SuperClass);
		
		
		c1.act();
		System.out.println("Message: " + c1.getMessage());

		System.out.println();
		
		SubClass2 c2 = new SubClass2(3);
		SuperClass f2 = c2;
		System.out.println(f2 instanceof SuperClass);
		System.out.println(f2 instanceof SubClass1);
		System.out.println(f2 instanceof SubClass2);
		c2.act();
		
		System.out.println();
		
//		SuperClass s2 = new SubClass2(4);
//		
//		s2.act();
//		
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
