package sufgan.aufgaben;

import java.util.ArrayList;
import java.util.Scanner;

public class SortedNamen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String namen[] = new String[3];
//		for (int i = 0; i < namen.length; i++) namen[i] = scanner.nextLine();
//		
//		for (int i = namen.length; i > 1; i--) {
//			for (int j = 0; j < i - 1; j++) {
//				if (namen[j].compareTo(namen[j+1]) > 0) {
//					String x = namen[j];
//					namen[j] = namen[j+1];
//					namen[j+1] = x;
//				}
//			}
//		}
//		
//		for  (String name: namen) System.out.println(name);
		
		// ODER
		
		String name1, name2, name3, hilfe;
		name1 = scanner.nextLine();
		name2 = scanner.nextLine();
		name3 = scanner.nextLine();
		
		if (name1.compareTo(name2) > 0) {
			System.out.println(1);
			hilfe = name2;
			name2 = name1;
			name1 = hilfe;
		}
		
		if (name2.compareTo(name3) > 0) {
			System.out.println(2);
			hilfe = name2;
			name2 = name3;
			name3 = hilfe;
		}
		
		if (name1.compareTo(name3) > 0) {
			System.out.println(3);
			hilfe = name1;
			name1 = name3;
			name3 = hilfe;
		}
		
		System.out.printf("%s\n%s\n%s", name1, name2, name3);
	}
	
}
