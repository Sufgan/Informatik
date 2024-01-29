package sufgan.aufgaben.F_Semester;

public class ZweiWurfelGleichZehn {

	public static void main(String[] args) {
		int w1 = 0, w2 = 0, i = 0, sum = 0;
		for (; w1 + w2 != 10; i++) {
			w1 = (int)(Math.random() * 6) + 1;
			w2 = (int)(Math.random() * 6) + 1;
			sum += w1 + w2;
			System.out.printf("Wurfel 1:%4d\t\tWurfel 2:%4d\n", w1, w2);
		}
		System.out.printf("Mittelwerte Summe betraegt: %.2f", sum / (double)i);
	}

}
