package udemyExercisesChapter5;

public class NumberInWord {

	public static void main(String[] args) {
		printNumberInWord(0);
		printNumberInWord(8);
		printNumberInWord(-1);
		printNumberInWord(10);

	}
	
	public static void printNumberInWord(int number) {
		switch(number) {
		case 0 :
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:case 9:
			System.out.println("Eight or Nine");
			break;
		default:
			System.out.println("Other");
			
			
			
			
		}
	}

}
