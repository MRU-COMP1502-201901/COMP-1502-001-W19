
public class Thing {
	
	private double w;
	private int x;
	private char y;
	private String z;
	public Thing(int x, char y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Thing(Thing other) {
		this.x = other.getX();
		this.y = other.getY();
		this.z = other.getZ();
	
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public char getY() {
		return y;
	}
	public void setY(char y) {
		this.y = y;
	}
	public String getZ() {
		return z;
	}
	public void setZ(String z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Thing [x=" + x + ", y=" + y + ", z=" + z + "]";
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(w);
		result = (int) (temp ^ (temp >>> 32));
		result = prime * result + x;
		result = prime * result + y;
		result = prime * result + ((z == null) ? 0 : z.hashCode());
		return result;
	//	return 0;
	}
	
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thing other = (Thing) obj;
		if (Double.doubleToLongBits(w) != Double.doubleToLongBits(other.w))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if (z == null) {
			if (other.z != null)
				return false;
		} else if (!z.equals(other.z))
			return false;
		return true;
	}
	
	/*@Override
	 // manual version of equals
	public boolean equals(Object o) {
		// must take object
		if (o != null) {
			// check it's a real object
			if (o instanceof Thing) {
				// check if it's really a thing
				Thing other = (Thing) o;
				if ((x == other.getX()) 
						&& (y == other.getY())
						&& (z.equals(other.getZ()))) {
					return true;
					
				}
			}
		}
		return false;
	}*/
	


}
