
public interface Motorized {
	// this is a contract for what a "motorized" object
	// needs to be able to do
	
	public void addFuel(int addedFuel);
	// methods are always abstract (without the keyword)
	// every implementor must implement them
	public int getFuelLevel();

}
