import java.util.Scanner;

public class Navigation extends Bank {
	public Navigation() {
		
	}
	
	public void homepage() {
		Scanner nav = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("    Welcome to you bank account!    ");
		System.out.println("     What would you like to do?     ");
		System.out.println("                                    ");
		System.out.println(" Type a number to choose an option. ");
		System.out.println(" 1. Account Information             ");
		System.out.println(" 2. Account balance                 ");
		System.out.println(" 3. Transfers                       ");
		System.out.println("====================================");
		switch(nav.nextInt()) {
		case 1:
			Information();
			break;
		case 2:
			accountBalance();
			break;
		case 3:
			transfers();
			break;
		default:
			Information();
		}
	}
	
	public void Information() {
		Scanner nav = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println(" This is your account information!  ");
		System.out.println("                                    ");
		System.out.println(" Name: " + Information.getName()     );
		System.out.println(" PIN: " + Information.getPIN()       );
		System.out.println("                                    ");
		System.out.println(" Type 0 to return to home page.     ");
		System.out.println("====================================");
		switch(nav.nextInt()) {
		case 0:
			homepage();
			break;
		default:
			homepage();
		}
	}
	
	public void accountBalance() {
		Scanner nav = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println(" This is your account information!  ");
		System.out.println("                                    ");
		System.out.println(" Balance: " + mainAccount.getBalance());
		System.out.println("                                    ");
		System.out.println(" Type 0 to return to home page.     ");
		System.out.println("====================================");
		switch(nav.nextInt()) {
		case 0:
			homepage();
			break;
		default:
			homepage();
		}
	}
	
	public void transfers() {
		Scanner nav = new Scanner(System.in);
		Scanner dw = new Scanner(System.in);
		Scanner dp = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("     Deposit or Withdraw money!     ");
		System.out.println("                                    ");
		System.out.println(" 1. Deposit                         ");
		System.out.println(" 2. Withdraw                        ");
		System.out.println("                                    ");
		System.out.println(" Type 0 to return to home page.     ");
		System.out.println("====================================");
		switch(nav.nextInt()) {
		case 0:
			homepage();
			break;
		case 1:
			mainAccount.deposit(dp.nextDouble());
			homepage();
			break;
		case 2:
			mainAccount.withdraw(dp.nextDouble());
			homepage();
			break;
		default:
			homepage();
		}
	}
	
}
