package udemyExercisesChapter4;

public class EqualSumChecker {

	public static void main(String[] args) {
		System.out.println(hasEqualSum(1,1,1));
		System.out.println(hasEqualSum(1,1,2));
		System.out.println(hasEqualSum(1,-1,0));
		System.out.println(hasEqualSum(2,3,5));
		

	}
	
	public static boolean hasEqualSum(int x ,int y , int z) {
		if(x+y == z) {
			return true;
		}else {
			return false;
		}
	}

}
