package day4;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1+"번째 숫자 입력:");
			int n = s.nextInt();

			sum += n;
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}
		
		System.out.println("가장 큰 수: " + max + "\n가장 작은 수: " + min + "\n입력한 수들의 평균: " + (sum / 5));
	}
}
