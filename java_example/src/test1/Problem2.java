package test1;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if(n >=50) System.out.println("50 이상 입니다.");
		else System.out.println("50 미만 입니다.");
	}
}
