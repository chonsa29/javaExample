package day4;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// arr[] = {10,20,30,40,50}

		// System.out.println(Arrays.toString(arr));

		int arr2[] = { 10, 20, 30, 40, 50, 2, 4, 4, 3, 62, 63, 7, 67, 740 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}
}
