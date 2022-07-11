package udemyTutorialChapter5;

public class Sum3And5Challenge {

	public static void main(String[] args) {
		
		int sum=0;
		int allTogether = 0;
		for(int i=1;i<=1000;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("The number is " + i);
				allTogether+=i;
				sum++;
				if(sum==5) {
					break;
				}
			}
		}
		System.out.println(allTogether);

	}
	
	

}
