import java.util.ArrayList;

public class VendingMachine {

	private ArrayList<Item> items;
	private Payment payment;
	
	
	public VendingMachine(Payment payment) {
		this.payment = payment;
		items = new ArrayList<>();
		
	}
	
	public boolean addItem(Item item) {
		
		for (Item i : items) {
			if (i.getID().
					equalsIgnoreCase(item.getID())) {
				return false;
			}
		}
		items.add(item);
		return true;
	}
	
	public void listAllItems() {
		
		for (Item i : items) {
			System.out.println(i);
		}
		
	}
	
	public void showItemInfo(String itemID) {
		for (Item i: items) {
			if (i.getID().equalsIgnoreCase(itemID)) {
				System.out.println("ID: " + i.getID());
				System.out.println("Price: " + i.getPrice());
				System.out.println("Current Stock: " + i.getStock());
				System.out.println("Maximum Stock: " + i.getMaxStock());
				System.out.println("Total Sales: " + i.getTotalSales());
				
			}
		}
	}
	
	public void purchaseItem(String itemID) {
		
		for (Item i: items) {
			if (i.getID().equalsIgnoreCase(itemID)) {
				System.out.println(i.getID() + " " + i.getPrice());
				if (payment.receivePayment() >= i.getPrice()) {
					System.out.println("Vending...");
					if (i.buyItem()) {
						System.out.println("Enjoy");
					} else {
						System.out.println("Out of stock");
					}
				}
				return;
			} 
		}
		
		System.out.println("Unable to find item.");
		
	}
	
	public static void main(String[] args) {
	
		VendingMachine vending = 
				new VendingMachine(new Payment());
		vending.addItem(new Item("A", 10, 1.00));
		vending.addItem(new Item("A", 10, 1.00));
		vending.addItem(new Item("B", 10, 1.50));
		vending.listAllItems();
		
	}
	
}
