
public class Student extends Person implements Cloneable   {

	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return super.toString();
		//return "Student " + getName();
	}
	
//	public boolean equals(Object o) {
//	
//	}
}
