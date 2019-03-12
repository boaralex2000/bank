
public class Account extends Bank{
	private double balance;
	
	public Account(double amount) {
		balance = amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("You don't have enough money to withdraw!");
			return;
		}
		else {
			balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
}
