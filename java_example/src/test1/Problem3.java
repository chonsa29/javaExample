package test1;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		if (n <= 0 || n >= 11)
			System.out.println("계산할 수 없습니다.");
		else if (n % 2 == 1)
			System.out.println("홀수");
		else if (n % 2 == 0)
			System.out.println("짝수");
	}
}
