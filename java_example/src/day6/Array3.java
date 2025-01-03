package day6;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, -4, -10, 8, -15, 6, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;

			for (int j = i; j < arr.length; j++) {
				int orgNum = arr[j] > 0 ? arr[j] : -arr[j];
				int indexNum = arr[minIndex] > 0 ? arr[minIndex] : -arr[minIndex];
				if (orgNum < indexNum) {
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
