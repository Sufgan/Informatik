package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class Mathe_Spiel {

	public static void main(String[] args) {
		System.out.println("Wie viel mal moechten Sie spielen?");
		Scanner s = new Scanner(System.in);
		String line = "-".repeat(20) + "\n";
		int total = 0, correct = 0, z1, z2;
		
		for (int i = s.nextInt(); i > 0; i--) {
			z1 = (int)(Math.random() * 100);
			z2 = (int)(Math.random() * 100);
			System.out.printf(line + "Wie viel wird %-7s?\n", z1 + " * " + z2);
			if (s.nextInt() == z1 * z2) {
				System.out.println("Richtig 👍");
				correct++;
			} else System.out.println("Falsch 👎");
			total++;
		}
		s.close();
		
		System.out.printf(line + "Ergebniss: %.0f%%", (float) correct / total * 100);
	}

}
