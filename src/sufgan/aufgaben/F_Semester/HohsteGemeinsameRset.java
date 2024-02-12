package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class HohsteGemeinsameRset {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie bitte zwei Zahlen ein");
		int a = s.nextInt(), b = s.nextInt();
		
		while (a != 0 && b != 0) {
			if (a > b) a %= b;
			else b %= a;
			System.out.printf("a:%-5db:%d\n", a,  b);
		}
		
		System.out.println("GGT betraegt: " + Math.max(a, b));
	}
}
