
public class checkingaccount {
	private double balance;
	private int number;
	public checkingaccount(int number) {
		this.number = number;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	public double getbalance () {
		return balance;
	}
	
}
