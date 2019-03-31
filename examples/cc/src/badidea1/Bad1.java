package badidea1;

import java.time.LocalDate;

public class Bad1 {

	// Coincidental Cohesion
	public static void main(String[] args) {
		
		Student a = new Student(12, "Pedro");
		Student b = new Student(12, "Hatoon");
		Student c = new Student(12, "Taylor");
		
		Student[] students = {a, b, c};
		
		Bad1 bad = new Bad1();
		System.out.println(bad.doStuff(students));
		
	}
	
	int classSize;
	Student[] students;
	double currentTemperature;
	
	
	
	public Bad1() {
	}
	
	public String doStuff(Student[] students) {
		this.students = students;
		classSize = 13;
		currentTemperature = new WeatherGetter().getCurrentTemp();
		LocalDate d = LocalDate.now();
		switch(d.getDayOfWeek()) {
			case MONDAY: return "Back to Work";
			case TUESDAY: return "Do everything";
			case WEDNESDAY: return "Be tired";
			case THURSDAY: return "Realise you're behind";
			case FRIDAY: return "Panic";
			case SATURDAY: return "Catch up";
			case SUNDAY: return "Try to work ahead";
		}
		
		
		return "RUN!";
	}
	
}
