package day4;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 숫자 입력:");
			int n = s.nextInt();

			if (i == 0)	
				min = n;
			
			min = min > n ? n: min;

		}
		System.out.println("가장 작은 수:" + min);
	}
}
