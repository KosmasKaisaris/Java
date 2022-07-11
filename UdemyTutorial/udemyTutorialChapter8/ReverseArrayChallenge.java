package udemyTutorialChapter8;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		
		int[] array = {5,4,3,2,1};
		for(int num: array) {
			System.out.println(num);
		}
		reverse(array);
		for(int num: array) {
			System.out.println(num);
		}
	

	}
	
	public static void reverse(int[] array) {
		int[] newArray = new int[array.length];
		int temp=0;
	
		for(int i=array.length-1;i>0;i--) {
			newArray[temp] = array[i];
			temp++;
		}
	}

}
