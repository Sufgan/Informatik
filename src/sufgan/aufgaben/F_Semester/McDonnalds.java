package sufgan.aufgaben.F_Semester;

import java.util.HashMap;
import java.util.Scanner;

public class McDonnalds {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		var gerichts = initGerichts();
		String command = ""; 
		StringBuilder list = new StringBuilder();
		int zahlen = 0;
		
		do {
			System.out.println("Was moechten Sie bestellen? (Drueck Enter als nichts)\n" + gerichts.keySet());
			zahlen += gerichts.getOrDefault(command=s.nextLine(), 0);
			list.append("\n").append(command);
		} while (!command.equals(""));
		
		System.out.printf("Sie haben bestellt:%sAlles kostet %d Euro", list, zahlen);
	}
	
		
	static HashMap<String, Integer> initGerichts() {
		HashMap<String, Integer> menu = new HashMap<>();
		menu.put("Burger", 12);
		menu.put("Cola", 4);
		menu.put("Nicolas", 1200);
		menu.put("McDonnalds", 1_500_000_000);
		menu.put("Ayoub", 10);
		return menu;
	}
}
