package udemyTutorialChapter6;

public class BankAccountConstructor {

	private int number;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber; // should have put long for 10 digit
	
	public BankAccountConstructor() {
		this(56789,2.50,"Default name" ,"default address" , 0000);//must be first line
		System.out.println("Empty constructor called");
	}
	
	public BankAccountConstructor(int number,double balance,String customerName,String email,int phoneNumber) {
		System.out.println("BankAccount constructor called ");
		this.number=number;
		this.balance=balance;
		this.customerName=customerName;
		this.email=email;
		this.phoneNumber=phoneNumber;
			
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		 this.balance=balance;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public void depositFunds(double money) {
		this.balance+=money;
		System.out.println("The new balance is "+ balance );
		
	}
	
	public void withdrawFunds(double money) {
		this.balance-=money;
		System.out.println("The new balance is " +  balance);
	}
	
	
}
