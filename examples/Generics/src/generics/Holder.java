package generics;

public class Holder <T>{
	// has the generic type T
	
	private T content;
	// cant use the internal type to make instance vars
	
	public Holder (T content) {
		// can use it in arguments 
		this.content = content;
		// treat its variables like normal variables
		
	}
	
	public T getContent() {
		// can use it in return values
		return content;
	}
	
}
