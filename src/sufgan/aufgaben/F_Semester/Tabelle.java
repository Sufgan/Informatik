package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class Tabelle {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie bitte Grenzen(von|bis)");
		int a = s.nextInt(), b = s.nextInt();
		
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) 
				if (i == 0 && j == 0) System.out.print("    |");
				else if (i == 0 || j == 0) System.out.printf(" %-3d|", i + j);
				else System.out.printf(" %-3d|", i * j);
			System.out.println("\n" + "-----".repeat(b + 1));
		}
	}
}
// println("abc") == print("abc" + "\n")