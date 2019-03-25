package compare;

public class Book implements Comparable<Book> {
// Compareable says we need compareTo
	// <Book> says we should only compare to books
	private String title;
	private String author;
	private int length;
	private double popularity;
	private Colour coverColour;
	
	public Book(
			String title, 
			String author, 
			int length, 
			double popularity, 
			Colour coverColour) {
		super();
		this.title = title;
		this.author = author;
		this.length = length;
		this.popularity = popularity;
		this.coverColour = coverColour;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getLength() {
		return length;
	}
	public double getPopularity() {
		return popularity;
	}
	public Colour getCoverColour() {
		return coverColour;
	}
	
	public String toString() {
		return title + " " + author + "(" + popularity + ")";
	}

	/*@Override
	public int compareTo(Book o) {
		//return this.author.compareTo(o.getAuthor());
		return -(int) ((this.popularity * 10) - (o.popularity * 10));
		// can multiply by 10 to avoid trucation when casting
		//return 0;
	} */
	
	/*@Override
	public int compareTo(Book o) {
		
		int cValue = -(int) ((this.popularity * 10) - (o.popularity * 10));
		// can multiply by 10 to avoid trucation when casting
		if (cValue == 0) {
			return this.author.compareTo(o.getAuthor());
		}
		return cValue;
		


		//return 0;
	}*/
	
	public int compareTo(Book o) {
		return this.coverColour.compareTo(o.coverColour);
	}
	
	
}
