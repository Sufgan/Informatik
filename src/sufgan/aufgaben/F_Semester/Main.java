package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int sum = 0, zahl = (int)(Math.random() * 1000);
			System.out.print(zahl);
			for (; zahl != 0; zahl /= 10) 
				sum += zahl % 10; 
			System.out.println("\t" + sum);
			if (sum == 20) break;
		}
	}

}
