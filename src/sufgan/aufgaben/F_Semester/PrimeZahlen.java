package sufgan.aufgaben.F_Semester;

public class PrimeZahlen {

	public static void main(String[] args) {
		int grenz1 = (int) (Math.random() * 10e4), grenz2 = (int) (Math.random() * 10e4);
		if (grenz2 < grenz1) {
			int a = grenz1;
			grenz1 = grenz2;
			grenz2 = a;
		}
		System.out.printf("Prime Zahlen zwischen %d und %d sind folgendes:\n", grenz1, grenz2);
		
		for (int i = grenz1 < 2 ? 2 : grenz1; i <= grenz2; i++) 
			if (isPrime(i)) System.out.println(i);
		}
	
	static boolean isPrime(int a) {
		for (int i = 2; i <= Math.sqrt(a); i++) 
			if (a % i == 0) return false;
		return true;
	}
	
}