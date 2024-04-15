package sufgan.aufgaben.F_Semester;

import java.util.Arrays;

public class ZahlenSort {

	public static void main(String[] args) {
		int[] digits = new int[10];
		
		for (int j = 0; j < 1; j++) {
			for (int i = 0; i < digits.length; i++) {
				digits[i] = (int) (Math.random() * 100);
			}
			
//			System.out.println(Arrays.toString(digits));
			sort(digits);
			System.out.println(Arrays.toString(digits));
		}
		
		
	}
	
	static void sort(int[] arr) {
		sort(arr, 0, arr.length);
	}
	
	static void sort(int[] arr, int begin, int end) {
		int left = begin, right = end - 1;
		if (right <= left) return;
		
		int x = arr[right], temp;
		System.out.print(Arrays.toString(arr));
		System.out.println("\t" + left + "\t" + right);
		System.out.println(x);
		
		
		while (left != right) {
			
			// find switch indexes
			while (left != right) {
				if (arr[left] <= x)
					left++;
				else if (arr[right] >= x)
					right--;
				else break;
			}
			
			// switch
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		
		int i = end - left - 1;
//		System.out.println(i);
		if (i > 0) {
			System.arraycopy(arr, left, arr, left + 1, end - left - 1);
			arr[left] = x;
		}
		
		
		sort(arr, 0, left);					// sort left half
		sort(arr, left + 2, arr.length);	// sort right half
//		System.out.println(Arrays.toString(arr));
	}
}
