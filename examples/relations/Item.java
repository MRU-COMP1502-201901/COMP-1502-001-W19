
public class Item {

	private int maxStock;
	private int currentStock;
	private String id;
	private double price;
	private double totalSales;

	public Item(String id, int maxStock, double price) {
		this.id = id;
		this.maxStock = maxStock;
		this.price = price;
		this.currentStock = 0;
		this.totalSales = 0;
	}

	public String toString() {
		return id + " " + currentStock + " " + price;
	}

	public String getID() {
		return this.id;
	}

	public int getStock() {
		return this.currentStock;
	}

	public double getPrice() {
		return this.price;
	}

	public int getMaxStock() {
		return this.maxStock;
	}

	public double getTotalSales() {

		return this.totalSales;
	}
	
	public void resetSales() {
		this.totalSales = 0;
	}

	public boolean restock(int newItems) {
		boolean returnValue = true;
		if (currentStock + newItems > maxStock) {
			returnValue = false;
		} else {
			this.currentStock += newItems;
		}
		return returnValue;
	}

	public boolean hasStock() {
		return currentStock > 0;
	}

	public boolean buyItem() {
		if (!hasStock()) {
			return false;
		}
		currentStock -= 1;
		totalSales += price;
		return true;

	}

}