
public class Main {

	public static void main(String[] args) {
		// interfaces give polymorphism
		Sedan car = new Sedan();
		car.addFuel(4);
		car.getFuelLevel();
		car.lowerWindow();
		car.raiseWindow();
		
		Motorized motorized = car;
		System.out.println(car instanceof Motorized);
		motorized.addFuel(2);
		motorized.getFuelLevel();
		//motorized.lowerWindow();
		// don't have access to methods from different interfaces
		
		PowerWindows pw = car;
		pw.lowerWindow();
		pw.raiseWindow();
		//pw.getFuelLevel();
		// again can't see, wrong interface
		
		Diesel d = car;
		d.getFuelLevel();
		
		// can treat as superinterface or subinterface 
		GearBox gb = car;
		gb.gearUp();
		
		

	}

}
