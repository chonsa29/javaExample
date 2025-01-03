package day6;

import java.util.Arrays;

public class Array3_2 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, -4, -10, 8, -15, 6, 2 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j]*arr[j] > arr[j + 1]*arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
