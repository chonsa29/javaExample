package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {

			int n;
			
			System.out.println(i+1+"번 째 숫자를 입력해주세요:");
			while (true) {
				n = scan.nextInt();
				if (n > 0)
					break;
				else {
					System.out.println("0보다 큰 숫자를 입력해주세요:");
				}
			}
			arr[i] = n;
		}

		System.out.println(Arrays.toString(arr));
	}
}
