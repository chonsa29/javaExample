package day4;

import java.util.Arrays;

public class Array7 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 4, 1 };

		int max = 0;
		int min = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
			
			min = arr[min] < arr[i] ? min : i;
		}
		
//		System.out.println(max);
//		System.out.println(min);
		
		int temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
		
		System.out.println(Arrays.toString(arr));
	}
}