import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
    
	Receipt r1 = new Receipt(Receipt.Type.BUSINESS, 8.00, "Good Earth");
	Receipt r2 = new Receipt(Receipt.Type.PERSONAL, 2.50, "Good Earth");
       
	ReceiptList list = new ReceiptList();
	list.addReceipt(r1);
	list.addReceipt(r2);
    
	ArrayList<Receipt> allReceipts = list.getAllReceipts();
	System.out.println("ALL Receipts");
	for (Receipt r : allReceipts) {
	    System.out.println(r);
	}
    
	ArrayList<Receipt> businessReceipts = list.getBusinessReceipts();
	System.out.println("Business Receipts");
	for (Receipt r : businessReceipts) {
	    System.out.println(r);
	}
    
    
	ArrayList<Receipt> personalReceipts = list.getPersonalReceipts();
	System.out.println("Personal Receipts");
	for (Receipt r : personalReceipts) {
	    System.out.println(r);
	}
    }
}