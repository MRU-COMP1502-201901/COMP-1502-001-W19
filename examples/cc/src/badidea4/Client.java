package badidea4;

import java.time.LocalDate;

public class Client {
	
	private String name;
	private LocalDate birthdate;
	
	
	public Client(String name, LocalDate birthdate) {
		super();
		this.name = name;
		this.birthdate = birthdate;
	}


	public String getName() {
		return name;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	

}
