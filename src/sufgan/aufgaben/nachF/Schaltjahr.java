package sufgan.aufgaben.nachF;

import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		System.out.println("Geben Sie bitte ein Jahr");
		System.out.println(
				"Das ist " + 
				(isSchalt(new Scanner(System.in).nextInt()) ? "ein" : "kein") + 
				" Schaltjahr");
	}
	
	static boolean isSchalt(int year) {
		if (year%400 == 0) return true;
		if (year%4 == 0 && year%100 != 0) return true;
		return false;
	}

}
