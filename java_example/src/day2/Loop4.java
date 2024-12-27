package day2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력해주세요: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("합:" + sum);
	}

}
