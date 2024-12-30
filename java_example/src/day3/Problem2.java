package day3;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = 0;
		System.out.println("정수(양수)를 입력하고 마지막에 -1을 입력하세요.");

		while (true) {
			int n = s.nextInt();

			if (n < 0)
				break;

			else {
				max = n > max ? n : max;
			}
		}
		System.out.println("가장 큰 수는" + max + "입니다.");
	}
}