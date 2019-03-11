
public abstract class Car implements Motorized, PowerWindows, Diesel, FourWheelDrive{
	// implements is the key word to implement an interface
	
	private int fuel = 0;
	
	@Override
	public void addFuel(int addedFuel) {
		fuel += addedFuel;
		
	}

	@Override
	public int getFuelLevel() {
		return fuel;
	}

	@Override
	public void raiseWindow() {
		System.out.println("Window up");
		
	}

	@Override
	public void lowerWindow() {
		System.out.println("Window down");
		
	}

	
}
