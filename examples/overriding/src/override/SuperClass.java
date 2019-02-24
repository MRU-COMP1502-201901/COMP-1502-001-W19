package override;

public class SuperClass {
	
	private int number;
	
	public SuperClass(int number) {
		this.number = number;
	}
	
	public void act() {
		
		System.out.println("I am the super class!");
		System.out.println("I store the number " + number);
		
	}
	
	public int getNumber() {
		return number;
	}

}
