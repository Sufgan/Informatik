package sufgan.aufgaben.F_Semester;

import java.util.Arrays;
import java.util.Scanner;

public class ZehnNamenSort {

	public static void main(String[] args) {
		String[] names = new String[10];
		Scanner s = new Scanner(System.in);
		
		System.out.println("Schreiben bitte zehn Namen");
		for (int i = 0; i < names.length; i++) 
			names[i] = s.next();
		
//		sort1(names);
		String temp;
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					 temp = names[i];
					 names[i] = names[j];
					 names[j] = temp;
				}
			}
		}
		
		System.out.println("Sortierte Namen:\n" + Arrays.toString(names));		
	}
	
	static void sort1(String[] arr) { // buble sort
		String temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				}
			}
		}
	}
	
	static void sort2(String[] arr) { // сортировка выбором
		int min = -1;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (min == -1 || arr[i].compareTo(arr[min]) > 0)
				min = i;
		}
	}
	
	
	4%3(1) == 6%3(0)

}
