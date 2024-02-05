package sufgan.aufgaben.A_Semester.Klausour;

import java.util.Scanner;

public class Aufgabe_2 {
	/*
	 * Man muss von 3 bis 21 mal Namen fragen
	 * und dann sortieren sie.
	 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = (int)(Math.random() * 18) + 3; i > 0; i--) {
			System.out.println("Schreiben bitte drei Namen:");
			String a = s.nextLine(), b = s.nextLine(), c = s.nextLine(), d;
			
			if (a.compareTo(b) > 0) {
				d = a; a = b; b = d; 
			}
			if (b.compareTo(c) > 0) {
				d = b; b = c; c = d; 
			}
			if (a.compareTo(b) > 0) {
				d = a; a = b; b = d; 
			}
			
			System.out.printf("%s, %s, %s\n" + "-".repeat(25) + "\n", a, b, c);
		}
	}

}
