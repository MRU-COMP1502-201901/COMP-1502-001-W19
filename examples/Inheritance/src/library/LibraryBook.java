package library;

// subclass of Library Item, with details for book.
public class LibraryBook extends LibraryItem{

	int pageCount;
	
	public LibraryBook(int idNumber, 
			int yearOfRelease, 
			String title,
			int pageCount) {
		// super lets us call the constructor of the super class
		// no code duplication because we can use the method that already exists
		super(idNumber, yearOfRelease, title);
		this.pageCount = pageCount;
	}
	

	public int getPageCount() {
		return pageCount;
	}
	
	

}
