package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class QuersummeHA {

	public static void main(String[] args) {
		while (true) {
			Integer zahl = (int) (Math.random() * 100_000_000);
			
			// 1 метод подсчета
//			int sum =  zahl.toString().chars().reduce(0, (a, b) -> (a + b - '0'));
			// 2
//			int z2 = zahl, sum = z2 % 10; // можно вместо z2 исп. zahl, но тогда отображение переделывать надо
//			while ((z2 /= 10) != 0) sum += z2 % 10;
			// 3
			int sum = 0;
			for (char c : zahl.toString().toCharArray()) sum += c - '0';
			
			System.out.printf("\n| Zahl:\t\t%-8d |\n| Quersumme:\t%-8d |\n" + "-".repeat(26), zahl, sum);
			if (sum > 60) break;
		}
		System.out.println("\nWe found!");
	}

}
