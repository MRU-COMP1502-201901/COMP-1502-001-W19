package override;

public class SubClass2 extends SuperClass {

	public SubClass2(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	public void act() {
		System.out.println("I am the subclass (2)");
		System.out.println("I have the number: " + getNumber());
	}
	
	
}
