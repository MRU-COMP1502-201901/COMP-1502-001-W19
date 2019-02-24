package library;

// base class or super class or parent class
public class LibraryItem {

	// inheritance allows us to create LibraryItems
	// but extend them with particular details for
	// LibraryBook or LibraryTape 
	
	// private instance members can't be seen by the subclasses
	private int idNumber;
	private int yearOfRelease;
	private String title;
	
	public int getIdNumber() {
		return idNumber;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public String getTitle() {
		return title;
	}
	
	// constructor for all the things important to a LibraryItem
	public LibraryItem(
			int idNumber, 
			int yearOfRelease, 
			String title) {
		
		this.idNumber = idNumber;
		this.yearOfRelease = yearOfRelease;
		this.title = title;
	}
	
	// Method in LibraryItem, but usable by the subclasses
	public String toString() {
		return idNumber + " " + title + " " + yearOfRelease;
	}
	
	
	
	
}
