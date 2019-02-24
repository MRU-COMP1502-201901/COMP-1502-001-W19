package vending;

import java.util.Scanner;

public class Main {

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {

		PaymentFactory factory = new PaymentFactory();
		System.out.println("What type of payment? ");
		Payment payment = factory.getPayment(kb.next());
		
		VendingMachine vending = new VendingMachine(payment);
		vending.addItem(new Item("Cookies", 10, 1.00));
		vending.addItem(new Item("Plain Chips", 10, 1.00));
		vending.addItem(new Item("Salt and Vinegar Chips", 10, 1.50));

		menu(vending);

	}

	public static void menu(VendingMachine machine) {
		
		
		
		String input;
		
		do {
			machine.listAllItems();
			
			System.out.println("P - Purchase");
			System.out.println("I - Info");
			System.out.println("R - Restock");
			System.out.println("S - Total Sales");
			System.out.println("Q - Quit");
			
			System.out.print("Action? ");
			
			input = kb.next();
			
			switch(input) {
				case "P" : 
					System.out.println("Item? ");
					machine.purchaseItem(kb.next()); 
					break;
				case "R" : 
					System.out.print("Item? ");
					String item = kb.next();
					System.out.print("Amount? ");
					int amount = kb.nextInt();
					machine.restockItem(item, amount); 
					break;
				case "I" : 
					System.out.println("Item? ");
					machine.showItemInfo(kb.next()); 
					break;
				case "S" : 
					System.out.println("Total sales: " + machine.getTotalSales());
					machine.resetSales();
					break;
			}
			
			System.out.println();
		
		} while (!input.equalsIgnoreCase("Q"));
			
		System.out.println("Thank you for vending with us");
		
		
	}

}
