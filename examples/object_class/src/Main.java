
public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		int number = 17;
		System.out.println(number);
		
		Object o1 = new Object();
		System.out.println(o1);
		
		Object o2 = new Object();
		System.out.println(o2);
		
		Object o3 = o2;
		System.out.println(o3);
		
		System.out.println(o1 == o2);
		System.out.println(o1 == o3);
		System.out.println(o2 == o3);
	
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		System.out.println(o2.equals(o3));
		
		Student s1 = new Student("Taylor");
		System.out.println(s1);
		
		Student s2 = new Student("Taylor");
		System.out.println(s2);
		
		Student s3 = s2;
		System.out.println(s3);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
	
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		s2.clone();
		
	}

}
