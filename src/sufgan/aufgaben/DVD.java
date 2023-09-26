package sufgan.aufgaben;

import java.util.Scanner;

public class DVD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wie Viel DVD haben Sie gekauft?");
		int DVDCount = scanner.nextInt();
		
		double DVDKosten = 2.30;
		if (DVDCount > 2) DVDKosten -= 0.50;
		if (DVDCount > 5) DVDKosten -= 0.20;
		
		System.out.printf("Zahlen Sie bitte %.2f", DVDKosten * DVDCount);	
	}

}
