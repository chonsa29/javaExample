package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력 : ");
			int input = s.nextInt();

			while (input <= 0) {
				System.out.print("0보다 큰 숫자를 입력하세요 : ");
				input = s.nextInt();
			}
			arr[i] = input;

		}
		System.out.println(Arrays.toString(arr));
	}
}
