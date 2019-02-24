package vending;

public class PaymentFactory {
	
	/**
	 * 
	 * Returns a new payment object of the type desired.
	 * 
	 * @param paymentType
	 * @return
	 */
	public Payment getPayment(String paymentType) {
		if (paymentType.equalsIgnoreCase("Credit")) {
			return new CreditPayment();
		} else if (paymentType.equalsIgnoreCase("Coin")) {
			return new CoinPayment();
		}
		return null;
	}

}
