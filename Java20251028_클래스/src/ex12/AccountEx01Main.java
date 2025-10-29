package ex12;

public class AccountEx01Main {

	public static void main(String[] args) {
		
		AccountEx01 account = new AccountEx01();
		
		account.setBalance(10000);
		System.out.println(account.getBalance());
		
		account.setBalance(-100);
		System.out.println(account.getBalance());

		account.setBalance(2000000);
		System.out.println(account.getBalance());
		
		account.setBalance(300000);
		System.out.println(account.getBalance());
		
	}

}
