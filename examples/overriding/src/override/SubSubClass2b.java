package override;

public class SubSubClass2b extends SubClass2 {

	public SubSubClass2b(int number) {
		super(number);
	}
	
	public void act() {
		super.act();
		System.out.println("But I am also the subclass (2b)");
		System.out.println("and I still have the number: " + getNumber());
	}

}
