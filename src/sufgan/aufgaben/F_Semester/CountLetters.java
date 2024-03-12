package sufgan.aufgaben.F_Semester;

import java.io.BufferedReader;
import java.util.Scanner;

public class CountLetters {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Schreiben bitte ein Satz");
		findVokale(scanner.nextLine());
	}
	
	private static void aufgabe1(String s) {
		for (char c : scanner.nextLine().toCharArray())
			System.out.println(c);
	}

	private static void aufgabe2(String s) {
		System.out.println("Schreiben bitte suchende Buchstabe");
		char c1 = scanner.nextLine().charAt(0);
		int i = 0;
		
		for (char c2 : s.toCharArray()) 
			if (c2 == c1) i++;
		
		System.out.printf("Anzahl von '%c' ist %d", c1, i);
	}
	
	private static void aufgabe3(String s) {
		int[] counts = new int['z' - 'a' + 1];
		
		for (char c : s.toLowerCase().toCharArray()) 
			counts[c - 'a']++;
		
		for (int i = 0; i < counts.length; i++)
			if (counts[i] != 0)
				System.out.printf("%c - %d\n", i + 'a', counts[i]);
		
	}
	
	private static void aufgabe4(String s) {
		// var 1
		System.out.println(new StringBuffer(s).reverse());
		
		// var 2
		for (int i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));
	}
	
	private static void findVokale(String s) {
		String s2 = s.toLowerCase();
		
		System.out.println("\nvar 1");
		for (int i = 0; i < s.length(); i++) {
			switch (s2.charAt(i) - 'a') {
			case 0: case 'e' - 'a': case 'u' - 'a': case 'o' - 'a': case 'i' - 'a':
				System.out.printf("Im Satz an der Stelle %d den Vokal %c%n", i, s.charAt(i));
			}
			
		}
		
		
		System.out.println("\nvar 2");
		int pattern = 0;
		for (char c : new char[] {'a', 'e', 'i', 'o', 'u'})
			pattern += 1 << (c - 'a');

		for (int i = 0; i < s2.length(); i++) 
			if ((pattern & (1 << (s2.charAt(i)) - 'a')) != 0)
				System.out.println(s.charAt(i) + " - " + i);
		
		
		System.out.println("\nvar 3");
		char[] chars = new char[] {'a', 'e', 'i', 'o', 'u'};
		for (int i = 0; i < s.length(); i++) 
			for (char c : chars)
				if (c == s2.charAt(i))
					System.out.printf("%c auf Stelle %d\n", s.charAt(i), i);
		
	}

}
