package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class Dreieck {

	public static void main(String[] args) {
		System.out.println("Geben sie bitte der Grund seiner Dreieck");
		int a = new Scanner(System.in).nextInt();
		a += a%2 == 0? 1 : 0;
		
		if (a%2 == 1) System.out.println(" ".repeat(a/2) + "*");
		for (int i = 0; i < a/2 - 1; i++) 
			System.out.println(" ".repeat(a/2 - i - 1) 
					+ "*" 
					+ " ".repeat(i*2 + a%2)
					+ "*");
		System.out.println("*".repeat(a));
	}

}
