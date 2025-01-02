package day5;

import java.util.Arrays;

public class SelectionSort1 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 1, 4 };


		for (int j = 0; j < arr.length-1; j++) {
			int minIndex = j;
			
			for (int i = j; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}

			int temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;

		}
		
		System.out.println(Arrays.toString(arr));
	}
}