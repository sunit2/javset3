
public class exceptionmain {

	public static void main(String[] args) {
		checkingaccount c = new checkingaccount(101);
		System.out.println("Deposit 500");
		c.deposit(500);

		try {
			System.out.println("withdraw 100");
			c.withdraw(100);
			System.out.println("withdraw 100");
			c.withdraw(600);
		} catch (InsufficientFundsException e) {
			System.out.println("amount is sort by" + e.getamount());
			e.printStackTrace();
		}
	}
}
