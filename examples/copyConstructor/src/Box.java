
public class Box {

	private int size;
	
	public Box (int size) {
		this.size = size;
	}
	
	public Box (Box other) {
		this.size = other.size;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int newSize) {
		this.size = newSize;
	}
	
}
