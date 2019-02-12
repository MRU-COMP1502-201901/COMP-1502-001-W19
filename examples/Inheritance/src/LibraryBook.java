
// subclass of Library Item, with details for book.
public class LibraryBook extends LibraryItem{

	int pageCount;
	
	public LibraryBook(int idNumber, 
			int yearOfRelease, 
			String title,
			int pageCount) {
		super(idNumber, yearOfRelease, title);
		this.pageCount = pageCount;
	}
	

	public int getPageCount() {
		return pageCount;
	}
	
	

}
