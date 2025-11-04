package ex06;

public class PayMain {

	public static void main(String[] args) {

		CreditCard cr = new CreditCard();
		cr.fare(100000);
		
		ApplePay ap = new ApplePay();
		ap.charge(2500000);
		
		System.out.println("-----------------------------");
		
		Payment p = new KakaoPay();
		p.pay(50000);
		
	}

}
