package sufgan.aufgaben.F_Semester;

public class PrimeZahlen {

	public static void main(String[] args) {
		int grenz = 100;
		for (int i = 2; i <= grenz; i++) 
			if (isPrime(i)) System.out.println(i);
		}
	
	private static boolean isPrime(int a) {
		for (int i = 2; i <= Math.sqrt(a); i++) 
			if (a % i == 0) return false;
		return true;
	}
	
}

