package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {

		int arr[] = new int[6];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			int num = 0;
			while (num % 5 == 0 || num > 100 || num < 1) {
				num = scan.nextInt();
			}
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
	}
}
