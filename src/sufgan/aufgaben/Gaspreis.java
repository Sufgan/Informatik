package sufgan.aufgaben;


import java.util.Scanner;

public class Gaspreis {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double preis;
		
		System.out.println("Geben Sie bitte ihres Verbrauch");
		int verbrauch = scanner.nextInt();
		
		if (verbrauch < 4000) {
			preis = 10 + verbrauch * 0.1912;
		} else {
			preis = 13.5 + verbrauch * 0.1732;
		}
		
		System.out.println("Verbrauch ist: " + verbrauch);
	}
	
}
