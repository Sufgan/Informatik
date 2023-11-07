package sufgan.aufgaben;

import java.util.Scanner;

public class DskFormel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Geben Sie biite A, B und C Argumente");
		System.out.print("A: ");
		a = scanner.nextDouble();
		System.out.print("B: ");
		b = scanner.nextDouble();
		System.out.print("C: ");
		c = scanner.nextDouble();
		
		double dis = Math.sqrt(Math.pow(b, 2) - 4 * a * c); 
		
		if (dis >= 0) System.out.printf("x1:%7.2f\nx2:%7.2f", (- b + dis) / (2 * a), (- b - dis) / (2 * a));
		else System.out.println("Es gibt keine reelle Rechnung!");

	}

}
