package udemyTutorialChapter8;

import java.util.Scanner;

public class MinimumChallenge {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter count:");
		int count = scanner.nextInt();
		scanner.nextLine();
		int[] myArray=readIntegers(count);
	
		System.out.println(findMin(myArray));
		

	}
	
	public static int[] readIntegers(int count) {
		
		int[] myArray = new int[count] ;
		System.out.println("Give me "+ count + " numbers");
		for(int i=0;i<count;i++) {
			myArray[i]= scanner.nextInt();
		}
		scanner.close();
		return myArray;
		
	}
	
	public static int  findMin(int[] array) {
		int min=array[0];
		for(int i=1; i<array.length;i++) {
			if(min>=array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}
