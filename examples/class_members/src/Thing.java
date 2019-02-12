
public class Thing {

	public static final double G = 9.81;
	
	private static int baseID = 0;
	
	private int id;
	
	public Thing() {
		this.id = baseID++;
	}
	
	public String toString() {
		return "Thing " + id + " current baseID is" + baseID;
	}
	
}
