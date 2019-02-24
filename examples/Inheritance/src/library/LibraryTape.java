package library;

//subclass of Library Item, with details for a tape.
public class LibraryTape extends LibraryItem {

	double length;
	
	public LibraryTape(int idNumber, 
			int yearOfRelease, 
			String title,
			double length) {
		super(idNumber, yearOfRelease, title);
		this.length = length;
	}

	public double getLength() {
		return length;
	}
	
	
	
	
	

}
