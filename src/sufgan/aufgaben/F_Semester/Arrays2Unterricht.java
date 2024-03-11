package sufgan.aufgaben.F_Semester;

public class Arrays2Unterricht {
	
	public static void main(String[] args) {
		String[] stadts1 = new String[] {"Muenchen", "Stutgard", "Rom", "Sankt-Petersburg", "Frankfurt am Main"};
		String[] stadts2 = new String[] {"Barselona", "Sankt-Petersburg", "Frankfurt am Main", "London"};
		
		for (String stadt1 : stadts1) 
			for (String stadt2 : stadts2)
				if (stadt1.equals(stadt2))
					System.out.println(stadt1 + " liegt in zwei Arrays");
		
	}

}
