
//public interface, what operations do we provide to the outside world

// it's a counter, that keeps track of a number (an integer)
// we can increment the counter and we can reset it to zero

public class Clicker {

    // instance variables
    // what information do we need to provide our public interface
    private int count;


    // constructors
    // what information do we need to start a clicker
    public Clicker() {
	this.count = 0;
    }

    public Clicker(int count) {
	this.count = count;
    }


    // accessors
    // what information do we need to provide to the outside
    public int getCount() {
	return count;
    }


    // mutators
    // what changes do we allow the outside world to make on our state
    public void click() {
	count++;
    }

    public void reset() {
	count = 0;
    }


    public static void main(String[] args) {

	// instances each represets a seperate STATE
	Clicker a = new Clicker();
	Clicker b = new Clicker();
	Clicker c = new Clicker(147);
	
	System.out.println("a:" + a.getCount());
	System.out.println("b:" + b.getCount());
	System.out.println("c:" + c.getCount());

	a.click();

	System.out.println("a:" + a.getCount());

	for (int i = 0; i < 17; i++) {
	    b.click();
	}
	c.reset();

	System.out.println("a:" + a.getCount());
	System.out.println("b:" + b.getCount());
	System.out.println("c:" + c.getCount());

    }
   


}