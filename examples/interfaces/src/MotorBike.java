
public class MotorBike implements Motorized {
	// implementations can vary
	
	private int regularFuel;
	private int emergencyFuel;
	private static int eflevel = 10;
	
	@Override
	public void addFuel(int addedFuel) {
		if (emergencyFuel < eflevel) {
			emergencyFuel += addedFuel;
		} else {
			regularFuel +=addedFuel;
		}

	}

	@Override
	public int getFuelLevel() {
		return regularFuel + emergencyFuel;
	}

}
