package udemyTutorialChapter4;

public class OverloadingMethod {

	public static void main(String[] args) {
		int newScore = calculateScore("Tim" , 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore("Kosmas",100);
		calculateScore();
		
		System.out.println(calcFeetAndInchesToCentimeters(6,0));
		System.out.println(calcFeetAndInchesToCentimeters(7,12));
		System.out.println(calcFeetAndInchesToCentimeters(-7,5));
		
		System.out.println(calcFeetAndInchesToCentimeters(157));
	}
	
	public static int calculateScore(String playerName,int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score*1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored "  + score + " points");
		return score*1000;
	}
	public static int calculateScore() {
		System.out.println("No player ,no score");
		return 0;
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		if(feet<0 || (inches<0 || inches>12)) {
			return -1;
		}else {
			inches+=feet*12;
			return inches*2.54;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches>=0) {
			double feet=(int)inches/12;
			 inches=(int)inches%12;
			return calcFeetAndInchesToCentimeters(feet,inches);
		}else {
			return -1;
		}
	}

}
