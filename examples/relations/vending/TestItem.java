package vending;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestItem {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testItemConstructor() {
		
		String itemCode = "A";
		int maxStock = 10;
		double price = 2.50;
		int currentStock = 0;
		double totalSales = 0;
		
		
		Item testItem = new Item(itemCode, maxStock, price);
		
		assertEquals(itemCode, testItem.getID());
		assertEquals(maxStock, testItem.getMaxStock());
		assertEquals(price, testItem.getPrice(), 0.001);
		assertEquals(currentStock, testItem.getStock());
		assertEquals(totalSales, testItem.getTotalSales(), 0.001);
		
		
	}
	
	@Test // very important tells junit this is a test
	public void testRestockInputFits() {
		
		String itemCode = "A";
		int maxStock = 10;
		double price = 2.50;
		
		Item testItem = new Item(itemCode, maxStock, price);
		
		int restockAmount = 5;
		
		testItem.restock(restockAmount);
		
		// often don't test getters because we will in other tests
		assertEquals(restockAmount, testItem.getStock());
		
		
	}
	
	@Test // very important tells junit this is a test
	public void testRestockInputDoesntFit() {
		
		String itemCode = "A";
		int maxStock = 10;
		double price = 2.50;
		
		Item testItem = new Item(itemCode, maxStock, price);
		
		int originalStock = testItem.getStock();
		
		int restockAmount = 22;
		
		
		boolean result = testItem.restock(restockAmount);
		

		assertFalse(result);
		// can add messages to tests
		assertEquals("Stock shouldn't be changed", 
				originalStock, 
				testItem.getStock());
		
		
		
		
	}
	
//	@Test
//	public void testRestockWrongInput() {
//		
//		String itemCode = "A";
//		int maxStock = 10;
//		double price = 2.50;
//		
//		Item testItem = new Item(itemCode, maxStock, price);
//		
//		int restockAmount = -55;
//		
//		testItem.restock(restockAmount);
//		
//		fail("Unsure how to handle negative amounts of restock.");
//		
//		
//	}

}
