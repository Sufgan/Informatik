package sufgan.aufgaben.A_Semester;

import java.util.Scanner;

public class PosotiveBruch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt();
		System.out.printf("%d\t%d", a / b, a % b);
		scanner.close();
	}
	
}
