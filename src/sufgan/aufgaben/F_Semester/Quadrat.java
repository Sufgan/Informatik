package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class Quadrat {

	public static void main(String[] args) {
		System.out.println("Geben sie bitte Seite der Quadrat");
		int a = new Scanner(System.in).nextInt();
		
		System.out.println(
				"--".repeat(a) + 
				("\n-" + "  ".repeat(a-1) + "-").repeat(a) + "\n" +
				"--".repeat(a));
	}
}
