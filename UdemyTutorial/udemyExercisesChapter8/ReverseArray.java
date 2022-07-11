package udemyExercisesChapter8;

public class ReverseArray {

	public static void main(String[] args) {
	
		int[] kosmas = {5,4,3,2,1};
		for(int num: kosmas) {
			System.out.println(num);
		}
		
		reverse(kosmas);
		for(int num: kosmas) {
			System.out.println(num);
		}

	}
	
	public static void reverse(int[] array) {
		int maxIndex = array.length-1;
		int halfWay = array.length/2;
		int temp;
	
		
		for(int i=0;i<halfWay;i++) {
			temp = array[i];
			array[i]=array[maxIndex-i];
			array[maxIndex-i]=temp;
		}
	}

}
