package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<>();
		ints.add(11);
		ints.add(17);
		ints.add(22);
		ints.add(106);
		ints.add(219);
		ints.add(31);
		ints.add(5);
		System.out.println(ints);
		
		// put the ints in their "natural order"
		Collections.sort(ints);
		
		System.out.println(ints);
		
		Collections.shuffle(ints);
		
		System.out.println(ints);
		
		
		List<String> strs = new ArrayList<>();
		strs.add("11");
		strs.add("17");
		strs.add("22");
		strs.add("106");
		strs.add("219");
		strs.add("Bob");
		strs.add("Alice");
		
		System.out.println(strs);
		
		Collections.sort(strs);
		
		System.out.println(strs);
		
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("A Different Book", "The Same Author", 119, 4.5, Colour.BLUE));
		books.add(new Book("A Book", "An Author", 200, 4.5, Colour.RED));
		books.add(new Book("C", "Y", 122, 1, Colour.RED));
		System.out.println(books);
		
		Collections.sort(books);
		
		System.out.println(books);
		
		Collections.sort(books, new BookTitleComparator());
		
		System.out.println(books);
		
		Collections.sort(books, new BookLengthComparator());
		
		System.out.println(books);
		
	}

}
