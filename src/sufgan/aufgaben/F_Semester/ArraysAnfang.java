package sufgan.aufgaben.F_Semester;

import java.util.Scanner;

public class ArraysAnfang {

	public static void main(String[] args) {
//		Namen20();
//		NameOrtPlz();
//		randomInArray();
		maxAndMinInRandomInArray();
		
//		schwirigNameOrtPlz();
	}
	
	static void Namen20() {
		String names[] = new String[20];
		Scanner s = new Scanner(System.in);
		
		System.out.println("Schreiben Sie bitte 20 Namen");
		for (int i = 0; i < 20; i++) {
			names[i] = s.next();
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(names[i]);
		}
	}
	
	static void NameOrtPlz() {
		Scanner s = new Scanner(System.in);
		int a = 3;
		String names[] = new String[a];
		String orts[] = new String[a];
		String plzs[] = new String[a];
		
		for (int i = 0; i < a; i++) {
			System.out.print(i+1 + " Name: ");
			names[i] = s.nextLine();
			System.out.print(i+1 + " Ort: ");
			orts[i] = s.nextLine();
			System.out.print(i+1 + " PLZ: ");
			plzs[i] = s.nextLine();
		}
		
		for (int i = 0; i < a; i++) {
			System.out.println(names[i] + " wohnt im " + orts[i] + ", PLZ: " + plzs[i]);
		}
	}
	
	static void randomInArray() {
		int[] array = new int[5];
		
		for (int i = 0; i < 5; i++) {
			array[i] = (int) (Math.random() * 101) - 50;
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ": " + array[i]);
		}
	}
	
	static void maxAndMinInRandomInArray() {
		int[] array = new int[5];
		int max = -100; int min = 100; 
		for (int i = 0; i < 5; i++) {
			int zahl = (int) (Math.random() * 101) - 50;
			array[i] = zahl;
			if (zahl > max) max = zahl;
			if (zahl < min) min = zahl;
		}
		
		for (int i = 0; i < 5; i++) System.out.println(i+1 + ": " + array[i]);
		System.out.printf("-".repeat(10) + "\nmin: %d\nmax: %d", min, max);
		
	}
	
	static void schwirigNameOrtPlz() {
			Scanner s = new Scanner(System.in);
			int maxLength = 8;
			System.out.println("Wie viel Infos haben Sie?");
			String[][] infos = new String[s.nextInt()+1][3];
			System.out.println("-".repeat(20));
			
			infos[0] = new String[] {"Name: ", "Stadt: ", "PlZ: "};
			for (int i = 1; i < infos.length; i++) {
				for (int j = 0; j < infos[0].length; j++) {
					System.out.printf("%d %s", i, infos[0][j]);
					infos[i][j] = s.nextLine();
					if (infos[i][j].length() > maxLength) maxLength = infos[i][j].length(); 
				}
			}
			
			System.out.println("-".repeat((maxLength + 3) * 3 + 1));
			for (String[] line : infos) {
				for (String info : line) System.out.printf("| %-" + maxLength + "s ", info);
				System.out.println("|\n" + "-".repeat((maxLength + 3) * 3 + 1));
		}
	}

}
