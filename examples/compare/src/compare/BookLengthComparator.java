package compare;

import java.util.Comparator;

public class BookLengthComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getLength() - o2.getLength();
	}
	
	

}
