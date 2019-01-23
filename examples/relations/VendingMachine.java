import java.util.ArrayList;

public class VendingMachine {

	private ArrayList<Item> items;
	private Payment payment;
	
	
	public VendingMachine(Payment payment) {
		this.payment = payment;
		items = new ArrayList<>();
		String s = new String("Hello!");
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
	
	public static void main(String[] args) {
		
//		ArrayList<Integer> ints = new ArrayList<>();
//		ints.add(1);
//		ints.add(2);
//		ints.add(4);
//		ints.add(8);
//		
//		for (int i = 0; i < ints.size(); i++) {
//			System.out.println(ints.get(i));
//		}
//		
//		for (Integer i : ints) {
//			System.out.println(i);
//		}
//		
		VendingMachine vending = 
				new VendingMachine(new Payment());
		vending.addItem(new Item("A", 10, 1.00));
		vending.addItem(new Item("A", 10, 1.00));
		vending.addItem(new Item("B", 10, 1.50));
		vending.listAllItems();
		
	}
	
}
