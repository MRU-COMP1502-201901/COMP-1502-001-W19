
public class Student extends Person {

	private String name;
	
	public Student(String name) {
		this.name = name;
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
