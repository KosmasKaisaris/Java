package udemyExercisesChapter8;

import java.util.Scanner;

public class MinimumElementExcercise {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int count=readInteger();
		int[] myArray = readElements(count);
		
		
		System.out.println(findMin(myArray));
		scanner.close();

	}
	
	public static int readInteger() {
		System.out.println("How many elements you need to enter ?");
		int theNumber = scanner.nextInt();
		
		
		return theNumber;
	}
	
	public static int[] readElements(int count) {
		
		int[] myArray  = new int[count];
		System.out.println("Give me the elements:");
		for(int i=0;i<myArray.length;i++) {
			myArray[i]= scanner.nextInt();
		}
		
		
		return myArray;
		
	}
	
	public static int findMin(int[] array) {
		int min=array[0];
		for(int i=1;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		
		return min;
	}

}
