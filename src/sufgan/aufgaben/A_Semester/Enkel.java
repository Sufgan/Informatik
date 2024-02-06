package sufgan.aufgaben.A_Semester;

import java.util.Scanner;

public class Enkel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		
		System.out.println("Wie alt sind Sie?");
		int alter = scanner.nextInt();
		
		for (int i = 0; i <= alter; i++) 
			sum = sum * 1.0675 + 1000;
		
		System.out.printf("Summe: %.2f", sum);
		scanner.close();
	}

}
