package sufgan.aufgaben.F_Semester;

import java.util.Arrays;
import java.util.Scanner;

public class Quersumme {

	public static void main(String[] args) {
		System.out.println("Geben Sie eine Zahl bitte");
		
//		int sum = 0, c = new Scanner(System.in).nextInt();
//		while (c != 0) {
//			s += c % 10;
//			c /= 10;
//		}
		
//		int sum = 0;
//		for (char c : new Scanner(System.in).next().toCharArray()) 
//			sum += c - '0';
		
		System.out.println("Quersumme: " + new Scanner(System.in).next().chars().reduce(0, (a, b) -> (a + b - '0')));
	}

}
