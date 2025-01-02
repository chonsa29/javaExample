package day5;

import java.util.Arrays;
import java.util.Random;

public class Array1 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			int n = 0;
			boolean same = true;

			while (same) {
				n = ran.nextInt(46)+1;
				same = false;
				
				for (int j = 0; j < i; j++) {
					if (arr[j] == n) {
						same = true;
						break;
					}
				}

			}
			arr[i] = n;

		}
		System.out.println(Arrays.toString(arr));
	}

}
