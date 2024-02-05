package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class Spiel {

	public static void main(String[] args) {
		int zahl = (int) (Math.random() * 1000), step = 1, ans = 0;
		String line = "-".repeat(30) 
				+ "\n%d: ";
		System.out.printf("Ich habe ein Zahl (0 <= x <= 1000) gewaehlt.\n\n"
				+ "Sie mussen eigene Zahlen schreiben und ich\n"
				+ "antworte kleiner oder großer sind sie.\n\n"
				+ "Sie haben nur 11 Versuchen!\n" 
				+ line, step);
		while ((ans = new Scanner(System.in).nextInt()) != zahl && step++ != 11) 
			System.out.printf("x "
					+ (ans > zahl ? '<' : '>')
					+ " %d\n"
					+ line, ans, step);
		System.out.print(step == 12 ? 
				"Sie haben verloren 👎\n"
				+ "Meine Zahl war: " + zahl 
				+ "\nVersuchen noch ein mal!":
				"Ja, Sie haben gewonnen!");
	}
	
}
