import java.util.Scanner;

public class Payment {

	public double receivePayment() {
		
		double payment = 0.00;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter payment");
		payment = s.nextDouble();
		
		return payment;
		
		
		
	}
	
}
