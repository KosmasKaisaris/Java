package udemyTutorialChapter5;

public class TheForStatement {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			System.out.println("Loop " + i + " hello!");
			
		}
		
		for(int i=2;i<=8;i++) {
			System.out.println(calculateInterest(10000, i));
		}
		
		for(int i=8;i>=2;i--) {
			System.out.println(calculateInterest(10000, i));
		}
		int sum=0;
		for(int i=40; i<=100;i++) {
			if(isPrime(i)) {
				System.out.println("Its a Prime number " + i);
				sum=sum+1;
				if(sum==3) {
					break;
				}
			}
		}
		
		
	}
	
		
	
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2; i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static double calculateInterest(double amount,double interestRate) {
		return (amount * (interestRate/100));
		
	}

}
