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
		System.out.println("Item:");
		for (Item i: items) {
			if (i.getID().equalsIgnoreCase(itemID)) {
				System.out.println("\tID: " + i.getID());
				System.out.println("\tPrice: " + i.getPrice());
				System.out.println("\tCurrent Stock: " + i.getStock());
				System.out.println("\tMaximum Stock: " + i.getMaxStock());
				System.out.println("\tTotal Sales: " + i.getTotalSales());
				return;
			}
		}
		System.out.println("Unable to find item");
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
	
	public void restockItem(String itemID, int restockAmount) {
		for (Item i: items) {
			if (i.getID().equalsIgnoreCase(itemID)) {
				System.out.println("Restocking " + i.getID());
				if (i.restock(restockAmount)) {
					System.out.println("Current Stock Now: " + i.getStock());
				} else {
					System.out.println("Not able to restock, not enough space.");
				}
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
		
		vending.showItemInfo("A");
		
	}
	
}
