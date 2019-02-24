package vending;

public class Main {
	
	public static void main(String[] args) {
		
		VendingMachine vending = 
				new VendingMachine(new Payment());
		vending.addItem(new Item("A", 10, 1.00));
		vending.addItem(new Item("A", 10, 1.00));
		vending.addItem(new Item("B", 10, 1.50));
		
		
		
		vending.listAllItems();
		
		
		
		vending.showItemInfo("A");
		
		vending.restockItem("A", 5);
		
		vending.purchaseItem("A");
		
		System.out.println("Total sales: " + vending.getTotalSales());
		
		vending.resetSales();
		
		System.out.println("Total sales After Reset: " 
		+ vending.getTotalSales());
		
	}

}
