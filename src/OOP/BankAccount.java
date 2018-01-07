package OOP;

public class BankAccount {
	// defined variables
	String accountNumber;
	
	static final String routingNumber = "013546";
	
	// instance variables
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	BankAccount(){
		
	}
	
	
	
	public BankAccount(String accountType) {
		
	}

	public BankAccount(String accountType,double initDeposit ) {
		// initdeposit, Msg, and account number are local variables
		System.out.println("NEW ACCOUNT " + accountType);
		System.out.println("NEW ACCOUNT " + initDeposit);
		String Msg = null;
		if(initDeposit < 1000) {
			 Msg = "ERROR : Minimum deposit must be at least $1,000";
			
		}
		else {
			 Msg = "Thanks for your initial deposit of :" + initDeposit; 
		}
		System.out.println(Msg);
		balance = initDeposit;
	}

	// defined methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	void checkBalance() {
		System.out.println("balance : " + balance);
	}
	void getStatus() {
		
	}



	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance= $" + balance + "]";
	}
	
}
