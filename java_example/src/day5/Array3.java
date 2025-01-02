package day5;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 4, 1 };

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - j - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(arr));
	}
}
