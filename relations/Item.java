

public class Item {



    private int maxStock;
    private int currentStock;
    private String id;
    private double price;

    public Item(String id,
		int maxStock,
		double price) {
	this.id = id;
	this.maxStock = maxStock;
	this.price = price;
	this.currentStock = 0;
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

    public boolean restock(int newItems) {
	if (currentStock + newItems > maxStock) {
	    return false;
	}
	this.currentStock += newItems;
	return true;
    }

}