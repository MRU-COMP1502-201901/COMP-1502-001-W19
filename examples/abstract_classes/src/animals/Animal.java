package animals;

public abstract class Animal {
	
	public abstract String speak();

	public String move(int x) {
		return "This animal moved " + x;
	}
	
}
