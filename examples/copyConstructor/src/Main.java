
public class Main {

	public static void main(String[] args) {
		
		Box a = new Box(10);
		System.out.println(a.getSize());
		
		Box b = a;
		System.out.println(b.getSize());
		
		Box c = new Box(a);
		System.out.println(c.getSize());
		
		a.setSize(5);
		System.out.println(a.getSize());
		System.out.println(b.getSize());
		System.out.println(c.getSize());
		
	}
	
}
