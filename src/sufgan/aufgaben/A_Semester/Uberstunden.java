package sufgan.aufgaben.A_Semester;


import java.util.Scanner;

public class Uberstunden {

	public static void main(String[] args) {
		int arbeitszeit, stundenlohn;
		double bruttolohn;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wie viele Stunden arbeiten Sie?");
		arbeitszeit = scanner.nextInt();
		
		System.out.println("Wie hoch ist das Stundenlohn?");
		stundenlohn = scanner.nextInt();
		
		if (arbeitszeit <= 175) {
			bruttolohn = arbeitszeit * stundenlohn; 
		} else {
			bruttolohn = 175 * stundenlohn + (arbeitszeit - 175) * stundenlohn * 1.1;
//			Kann man auch so schreiben: 
//			arbeitszeit * stundenlohn + (arbeitszeit - 175) * stundenlohn * 0.1
//			oder so: 
//			(arbeitszeit * 1.1 - 17.5) * stundenlohn
		}
		
		System.out.println("Ihr Bruttolohn ist: " + bruttolohn);

	}

}
