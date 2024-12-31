package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 값 입력 : ");
			int n = s.nextInt();
			arr[i] = n;
		}

		System.out.println(Arrays.toString(arr));
	}
}
