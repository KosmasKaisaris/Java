package udemyExercisesChapter8;

import java.util.Scanner;

public class MainArrayDescSorted {


	public static void main(String[] args) {
		int[] kosmas =getIntegers(5);
		printArray(kosmas);
		printArray(sortIntegers(kosmas));
		
		

	}
	
	public static int[] getIntegers(int sizeOfArray) {
		Scanner scanner = new Scanner(System.in);
		int[] myArray = new int[sizeOfArray];
		System.out.println("Give me your numbers:");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scanner.nextInt();
		}
		scanner.close();
		return myArray;
	}

	public static void printArray(int[] theArray) {
		for(int i=0;i<theArray.length;i++) {
			System.out.println("Element " + i +  " contents "+ theArray[i]);
		}
	}
	
	public static int[] sortIntegers(int[] theArray) {
		int[] newArray = theArray;
		
		for(int x = 0 ; x<newArray.length;x++) {
			
		
		for(int i =0; i <newArray.length-1;i++) {
			if(newArray[i]< newArray[i+1]) {
				int temp = newArray[i];
				newArray[i]= newArray[i+1];
				newArray[i+1]=temp;
				
			}
		}
		}
		
		
		return newArray;
	}

}
