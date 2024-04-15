package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class Spiel_Umgekehrt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int begin = 100, end = 1001, step = 1;
		
		System.out.println("Waehlen biite eine Zahl von 100 bis 1000\n"
				+ "und schreiben folgende Commands:\n"
				+ "= - das ist Ihre Zahl\n"
				+ "> - Ihre Zahl ist grosser\n"
				+ "< - Ihre Zahl ist kleiner\n"
				+ "-".repeat(20));
		
		dialog: while (true) {
			System.out.printf("%d: Ist Ihre Zahl %d?\n", step++, (end - begin) / 2 + begin);
			switch (s.next().toCharArray()[0]) {
			case '>': begin += (end - begin) / 2; break;
			case '<': end -= (end - begin) / 2; break;
			case '=': break dialog;
			}
//			System.out.printf("%d\t%d\n", begin, end);
		} 
		
		s.close();
	}
	
}
