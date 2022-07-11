package udemyTutorialChapter5;

public class Switch {

	public static void main(String[] args) {
		
		int switchValue=1;
		
		switch(switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
		case 3: case 4: case 5:
			System.out.println("Was a 3,or 4, or a 5");
			break;
		default:
			System.out.println("Was not 1 or 2");
			break;
		}
		
		char myChar= 'A';
		switch(myChar) {
		case 'A':
			System.out.println("was A");
			break;
		case 'B':
			System.out.println("was B");
			break;
		case 'C':
			System.out.println("was C");
			break;
		case 'D':
			System.out.println("was D");
			break;
		case 'E':
			System.out.println("was E");
			break;
			default:
				System.out.println("Not found");
				break;
		}
		
		String month= "January";
		switch(month.toLowerCase()) {// or toUpperCase()
		case "january":
			System.out.println("Jan");
			break;
		case "june":
			System.out.println("Jun");
			break;
			default:
				System.out.println("Not sure");
				break;
			
		}
		
	

	}

}
