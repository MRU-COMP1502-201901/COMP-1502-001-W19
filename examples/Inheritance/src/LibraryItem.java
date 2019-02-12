import java.util.ArrayList;

// base class or super class or parent class
public class LibraryItem {

	// inheritance allows us to create LibraryItems
	// but extend them with particular details for
	// LibraryBook or LibraryTape 
	
	int idNumber;
	int yearOfRelease;
	String title;
	
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
	
	public static void main(String[] args) {
		
		// We can create a LibraryItem, which only has
		// the shared aspects and none of subclass aspects
		LibraryItem i = new LibraryItem(1, 2008, "An item");
		
		System.out.println(i);
		
		
		// creates a new library book
		LibraryBook book = new LibraryBook(2, 
				2009, 
				"A book", 
				400);
		
		// uses LibraryItem's toString()
		System.out.println(book);
		
		// uses LibraryBook's method
		System.out.println(book.getPageCount());
		
		LibraryTape tape = new LibraryTape(3, 
				2010, 
				"A tape", 33.3);
		
		// Again can use the shared
		System.out.println(tape);
		System.out.println(tape.getLength());
		
		// can refer to any subclass as the superclass
		// this is polymorhpism
		LibraryItem tapeItem = tape;
		//  can access getTitle, from
		System.out.println(tapeItem.getTitle());
		// can't access .getLength()
		// won't work because .getLength() can only be accessed
		// from a LibraryTape. Even though the object in memory
		// is a LibraryTape, a LibraryItem reference can only
		// see the LibraryItem parts of the object. 
		/*System.out.println(tapeItem.getLength());*/
		
		// polymorphism 
		ArrayList<LibraryItem> items = new ArrayList<>();
		items.add(book);
		items.add(tape);
		for (LibraryItem item : items) {
			System.out.println(item);
		}
	}
	
	
	
}
