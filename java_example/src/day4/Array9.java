package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[];
		System.out.print("숫자를 몇개 저장하시겠습니까?");
		while (true) {
			int n = scan.nextInt();

			if (n > 0) {
				arr = new int[n];
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요:");
			}
		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
}
