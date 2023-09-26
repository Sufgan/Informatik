package sufgan.aufgaben;

import java.util.Scanner;

public class PQFormel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Geben Sie biite A, B und C Argumente");
		System.out.print("A: ");
		a = scanner.nextInt();
		System.out.print("B: ");
		b = scanner.nextInt();
		System.out.print("C: ");
		c = scanner.nextInt();
		
		double dis = Math.sqrt(Math.pow(b, 2) - 4 * a * c); 
		
		System.out.printf("x1:%7.2f\nx2:%7.2f", (- b + dis) / (2 * a), (- b - dis) / (2 * a));

	}

}
