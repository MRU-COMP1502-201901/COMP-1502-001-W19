
public class Dog {
	
	//enum is a light weight class
	
	// enums are especially useful for design time variables
	// only a few values, and we know what they are when we're desiging
	
	// name is like a class
	// values are in all caps, like constants
	enum Action {EATING, SLEEPING, BARKING, POOPING, RUNNING};
	
	// create a variable of the enum type
	Action currentAction;
	
	public Dog() {
		// refer to each value of the enum, with the enum.value
		// assign as any value in the enum
		currentAction = Action.SLEEPING;
	}
	
	public void setAction(Action newAction) {
		this.currentAction = newAction;
	}
	
	public void printAction() {
		System.out.println(currentAction);
	}
	
	public void act() {
		switch(currentAction) {
			case BARKING: System.out.println("Bark!"); break;
			case SLEEPING: System.out.println("zzz"); break;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Dog Simulator 3000"   );
		Dog d = new Dog();
		d.printAction();
		d.act();
		
		// can set an enum from a string if the string matches a value
		Action a = Action.valueOf("SLEEPING");
		System.out.println(a);
	}

}
