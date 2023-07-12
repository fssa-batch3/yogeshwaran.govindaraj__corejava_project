package day03.solved;

public class TestAccount2 {
	public static void main(String[] args) {

		// create Account using Setter methods and Default constructor
		Account2 acct1 = new Account2();
		acct1.setAccNo("A101");
		acct1.setName("Yogesh");
		acct1.setBalance(1000);

		System.out.println(acct1.getAccNo() + "-" + acct1.getName() + "-"
				+ acct1.getBalance());
		
		// Create Account with Overloaded constructor accepting parameters
		Account2 acct2 = new Account2("A102", "Maari", 1000);
		System.out.println(acct2.getAccNo() + "-" + acct2.getName() + "-"
				+ acct2.getBalance());

	}
}
