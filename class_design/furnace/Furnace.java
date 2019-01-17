
import java.util.Scanner;

//public interface, what operations do we provide to the outside world

// modeling a furnace
// state -> is it heating or not, what temperature does it heat at

// is it heating?
// current temperature


public class Furnace {

    // instance variables
    // what information do we need to provide our public interface
    private boolean on;
    private float targetTemperature;



    // constructors
    // what information do we need to start a furnace
    public Furnace(float targetTemperature) {
	on = false;
	this.targetTemperature = targetTemperature;
	
    }

    // accessors
    // what information do we need to provide to the outside
    public boolean isOn() {
	return on;
    }


    // mutators
    // what changes do we allow the outside world to make on our state
    public void setTargetTemperature(float targetTemperature) {
	this.targetTemperature = targetTemperature;
    }

    public void run(float currentTemperature) {

	if (currentTemperature < this.targetTemperature) {
	    on = true;
	} else {
	    on = false;
	}
    }

    public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);

	float c = 1;

	Furnace f = new Furnace(17);

	System.out.println("a \n b");

	while (c > 0) {
	    System.out.println("Enter current temp:");
	    c = keyboard.nextFloat();
	    f.run(c);
	    System.out.println("Furnace running: " + f.isOn()); 
	    
	    
	}

    }


}