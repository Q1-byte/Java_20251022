package ex05;

public class PayMain {

	public static void main(String[] args) {

		CreditCard cr = new CreditCard();
		cr.fare(10000);
		
		System.out.println("------------------------");
		
		ApplePay ap = new ApplePay();
		ap.charge(10000);
		
	}

}
