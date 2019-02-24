package vending;

import java.util.Scanner;

public class CreditPayment extends Payment {

	Scanner s = new Scanner(System.in);
	
	@Override
	public double receivePayment() {
		double payment = 0.00;
		
		System.out.println("Please enter payment");
		payment = s.nextDouble();

		return payment;
	}

}
