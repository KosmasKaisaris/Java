package udemyTutorialChapter11;

public class MainAccess {

	public static void main(String[] args) {
		Account kosmasAccount = new Account("Kosmas");
		kosmasAccount.deposit(1000);
		kosmasAccount.withdraw(500);
		kosmasAccount.withdraw(-200);
		kosmasAccount.deposit(-20);
		kosmasAccount.calculateBalance();
		kosmasAccount.balance = 5000;
		
		System.out.println("Balance on account is " + kosmasAccount.getBalance());
		kosmasAccount.transactions.add(4500);
		kosmasAccount.calculateBalance();
	
	}

}
