package udemyTutorialChapter5;

public class TheWhileAndDoWhile {

	public static void main(String[] args) {
		int count=1;//count 6 while dont run
		while(count!=6) {
			System.out.println("Count value is " + count);
			count++;
		}
		
//		for(int i=1;i<6;i++) {
//			System.out.println("Count value is " + i);
//		}
		
		count=1;
		while(true) {
			if(count==5) {
				break;
			}
			System.out.println("Count value is " + count);
			count++;
		}
		
		count=1;
		do { //It will execute at least once
			System.out.println("Count value was " + count);
			count++;
			
			if(count>100) {
				break;
			}
		}while(count!=6);
		
		
		int number=4;
		int finishNumber=20;
		int sum=0;
		
		while(number<=finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			sum++;
			if(sum==5) {
				System.out.println("Total number of even is " + 5 );
				break;
			}
			
			System.out.println("Even number " + number);
		}

	}
	
	public static boolean  isEvenNumber(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
		
	}

}
