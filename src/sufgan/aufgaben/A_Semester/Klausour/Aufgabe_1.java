package sufgan.aufgaben.A_Semester.Klausour;

public class Aufgabe_1 {
	/*
	 *  Finden Zahlen von ~71 bis ~256 die durch 13 teilbar sind
	 * 	Am Ende schreiben ihre Mittelwert.
	 */
	
	public static void main(String[] args) {
		methode_1(71, 256);
//		methode_2(71, 256);
	}
	
	static void methode_1(int von, int bis) {
		int c = 0, sum = 0;
		for (int i = von; i < bis + 1; i++) {
			if (i % 13 == 0) {
				sum += i;
				c++;
			}
		}
		System.out.println("Zahlen insgesammt: " + c 
				+ "\nMittelwert: " + (float) sum / c);
	}
	
	static void methode_2(int von, int bis) {
		int z1 = 13 * Math.ceilDiv(von, 13),
				z2 = 13 * Math.floorDiv(bis, 13);
		System.out.println("Zahlen insgesammt: " + ((z2-z1) / 13 + 1)
				+ "\nMittelwert: " + (z1+z2) / 2.);
		
	}
}
