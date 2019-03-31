package badidea2;

public class Bad2 {
	
	enum Colour{RED, YELLOW, GREEN};

	private Colour colour;
	private int errors;
	
	//logical cohesion and command coupling
	public static void main(String[] args) {
		
		Bad2 bad = new Bad2(Colour.YELLOW, 14);
		Object o = bad.status(true);
		System.out.println((Colour) o);
		
		Object o2 = bad.status(false);
		System.out.println((Integer) o2);
		
	}
	
	public Bad2(Colour c, int errors) {
		this.colour = c;
		this.errors = errors;
	}
	
	public Object status(boolean color) {
		if (color) {
			return colour;
		} else {
			return new Integer(errors);
		}
	}
	
}
