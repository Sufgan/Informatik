package sufgan.aufgaben.A_Semester;

import java.util.Scanner;

public class Schleife {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wie heist du?");
		String a1 = scanner.nextLine();
		System.out.println("Woher kommst du?");
		String a2 = scanner.nextLine();
		System.out.println("Wie heist dien Heimatland?");
		String a3 = scanner.nextLine();
		
		System.out.println("Wie viel mochtest du bekommen?");
		int count = scanner.nextInt();
		
		
		for (int i = 0; i < count; i++) {
			System.out.println("*".repeat(25)); // "*".repeat(5) ist gleich wie "*****"
			System.out.printf("* %-21s *\n", a1);
			System.out.printf("* %-21s *\n", a2);
			System.out.printf("* %-21s *\n", a3); // Oder System.out.printf("* %-21s *\n".repeat(3), a1, a2, a3);
			System.out.printf("*".repeat(25) + "\n\n");
		}		
	}
}

