package udemyTutorialChapter11;

import java.util.Scanner;

public class MainChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plz enter a number: ");
		X x = new X(scanner.nextInt());
		x.x();
		

	}

}
