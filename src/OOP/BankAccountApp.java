package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "07784533";
		acc1.name = "Roger Hue";
		acc1.balance = 10000;
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0554312288";
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "014567229";
		acc3.checkBalance();
		
	}

}
