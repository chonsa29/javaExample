package day2;

import java.util.Scanner;

public class Loop6 {
	public static void main(String[] args) {
	
		System.out.print("숫자를 입력하세요:");
		Scanner s = new Scanner(System.in);
	 
		int n = s.nextInt();
		
		int sum1 = 0, sum2 = 0;

		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) sum1 += i;
			else sum2 += i;
		}
		
		System.out.println("홀수들의 합" + sum2);
		System.out.println("짝수들의 합" + sum1);
	}
}
