package test1;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1;i<=9;i++) {
			System.out.println(n + "*" + i + "=" + (n*i));
		}
	}

}
