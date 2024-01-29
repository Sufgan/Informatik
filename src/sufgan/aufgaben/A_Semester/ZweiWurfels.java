package sufgan.aufgaben.A_Semester;

import java.util.Random;

public class ZweiWurfels {
	public static void main(String[] args) {
		Random random = new Random();
		int res1, res2, count = 20, summe = 0;
		
		for (Integer i = 1; i >= 0; i++) {
			res1 = random.nextInt(6) + 1;
			res2 = random.nextInt(6) + 1;
			summe += res1 + res2;
			int c = count - 5 - i.toString().length();
			System.out.printf(
					"-".repeat(c/2) + 
					"iter-%d" + 
					"-".repeat(c/2 + (c%2 == 1 ? 1 : 0)) + 
					"\n", i);
			System.out.printf("1: %d\n2: %d\n", res1, res2);
			if (res1 == 3 && res2 == 3) {
				System.out.printf("Nach %d Versuchen haben wir 3 und 3 bekommen!\nGemeinsame Summe: %d", i, summe);
				break;
			}
		}
	}
	
}
