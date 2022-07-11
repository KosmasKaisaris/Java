package udemyTutorialChapter6;

public class MainBank {

	public static void main(String[] args) {
		BankAccountConstructor firstCustomer = new BankAccountConstructor();
		firstCustomer.setCustomerName("Kosmas Kaisaris");
		firstCustomer.setBalance(1000);
		System.out.println(firstCustomer.getCustomerName() + " " +  firstCustomer.getBalance());
		firstCustomer.setEmail("kosmastk@yahoo.gr");
		firstCustomer.setPhoneNumber(698323432);
		System.out.println(firstCustomer.getEmail() + " " +  firstCustomer.getPhoneNumber());
		firstCustomer.depositFunds(1345);
		System.out.println(firstCustomer.getBalance());
		firstCustomer.withdrawFunds(300);
		System.out.println(firstCustomer.getBalance());
		
		BankAccountConstructor secondCustomer = new BankAccountConstructor(123,2000,"Nikos Argiros", "theemail@ya.com",67856);
		System.out.println(secondCustomer.getBalance());
		BankAccountConstructor thirdCustomer = new BankAccountConstructor();
		System.out.println(thirdCustomer.getEmail());
	}

}
