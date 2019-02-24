package library;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		badMain();
		
		goodMain();

	}
	
	public static void badMain() {
		// two examples using Bad Library Item, where we have to include
		// irrelevent or weird information
		BadLibraryItem i = new BadLibraryItem("Ender's Game", 
				1, 
				"Card", 
				120, 
				-1, 
				-1, 
				"It's a book?");
		System.out.println(i);
		BadLibraryItem aTape = new BadLibraryItem(
				"Into the SpiderVerse", 
				2, 
				"A bunch of people", 
				-1, 
				45, 
				-1, 
				"It's a tape, so walkman?");
		System.out.println(aTape);
		
	}
	
	public static void goodMain() {
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
		
		// polymorphism allows us to handle different 
		// subclass instances as instances of the superclass
		// which can be very useful
		ArrayList<LibraryItem> items = new ArrayList<>();
		items.add(book);
		items.add(tape);
		for (LibraryItem item : items) {
			System.out.println(item);
		}
	}

}
