package vending;

import java.util.Scanner;

public class CoinPayment extends Payment {

	static Scanner kb = new Scanner(System.in);
	
	@Override
	public double receivePayment() {
		
		double payment = 0;
		int coinCount = 0;
		
		System.out.print("# of quarters? ");
		coinCount = kb.nextInt();
		payment += coinCount * 0.25;
		
		System.out.print("# of loonies? ");
		coinCount = kb.nextInt();
		payment += coinCount;
		
		System.out.print("# of twoonies? ");
		coinCount = kb.nextInt();
		payment += coinCount * 2;
		
		return 0;
	}

}
