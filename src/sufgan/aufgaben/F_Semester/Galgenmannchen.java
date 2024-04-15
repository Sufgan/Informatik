package sufgan.aufgaben.F_Semester;

import java.util.Arrays;
import java.util.Scanner;

public class Galgenmannchen {
	private boolean[] availableLetters = new boolean['z' - 'a' + 1];
	private char[] field;
	private boolean win = false;
	private int attempts = 10;
	private char letter = 0;
	private Scanner s = new Scanner(System.in);
	private String selectedWord;


	public static void main(String[] args) {		
		new Galgenmannchen().start();
	}
	
	public void start() {
		selectWord();
		createField();
		
		printField();
		while ((letter = getLetter()) != ' ') {
			if (checkLetter(letter)) System.out.println("Right!");
			else System.out.printf("False\nYou have now %d attemps\n", --attempts);
			if (checkExit()) break;
			printField();
		}
	}
	
	void createField() {
		field = new char[selectedWord.length()];
		Arrays.fill(field, '_');
	}
	
	private void selectWord() {
		String word = "Geschichte";
		switch ((int)(Math.random() * 4)) {
		case 1: word = "Informatik"; break;
		case 2: word = "Deutschland"; break;
		case 3: word = "Teppich"; break;
		}		
		selectedWord = word;
	}
	
	boolean checkExit() {
		if (win) System.out.println("You won!");
		else if (attempts == 0) System.out.println("You lose!");
		else return false;
		return true;
	}
	
	private char getLetter() {
		String move = s.nextLine().toLowerCase();
		if (move.equals("")) {
			System.out.println("Out the game");
			return ' ';
		} 
		if (move.length() != 1) {
			System.out.println("False input\nTry again");
			return getLetter();
		} 
		char letter = move.charAt(0);
		if (letter < 'a' || letter > 'z') {
			System.out.println("It's not a letter");
			return getLetter();
		}
		if (availableLetters[letter - 'a']) {
			System.out.println("This letter was");
			return getLetter();
		} else availableLetters[letter - 'a'] = true;
		return letter;
	}
	
	boolean checkLetter(char letter) {
		int index = -1;
		for (int i = 0; i < selectedWord.length(); i++) 
			if (selectedWord.toLowerCase().charAt(i) == letter) 
				field[i] = selectedWord.charAt(index = i);
		return index != -1;
	}
	
	void printField() { // and check win
		win = true;
		for (char c : field) {
			if (c == '_') win = false;
			System.out.print(c);
		}
		System.out.println();
	}

}
