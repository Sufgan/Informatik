package sufgan.aufgaben.F_Semester;

public class Tabelle {

	public static void main(String[] args) {
//		System.out.println();
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) 
				if (i == 0 || j == 0) System.out.printf(" %-3d|", i + j);
				else System.out.printf(" %-3d|", i * j);
			System.out.println("\n" + "-----".repeat(11));
		}
	}
}
