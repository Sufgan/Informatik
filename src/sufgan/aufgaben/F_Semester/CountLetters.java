package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class CountLetters {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Schreiben bitte ein Satz");
		aufgabe1();
	}
	
	private static void aufgabe1() {
		for (char c : scanner.nextLine().toCharArray())
			System.out.println(c);
	}

	s
	private static void aufgabe2() {
		System.out.println("Sreiben bitte ein suchender Buchstabe");
		String s = scanner.nextLine();
		char c1 = scanner.nextLine().charAt(0);
		int i = 0;
		
		for (char c2 : s.toCharArray()) 
			if (c2 == c1) i++;
		
		System.out.printf("Count of '%c': %d", c1, i);
	}

}
