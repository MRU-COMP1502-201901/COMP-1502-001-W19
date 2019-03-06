package override;

public class SubThing extends Thing{

	public void doOtherStuff() {
		System.out.println("I do other stuff");
	}
	
	@Override
	public void doStuff() {
		super.doStuff();
		System.out.println("I am the SubThing and I do Stuff!");
	}
}
