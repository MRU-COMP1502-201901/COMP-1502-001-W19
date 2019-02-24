package override;

public class SubClass1 extends SuperClass{

	String message;
	
	// over riding constructor
	public SubClass1(int number) {
		super(number); // required call to the super constructor
		message = "No message.";
	}
	
	// overloaded constructor
	public SubClass1(int number, String message) {
		super(number);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
