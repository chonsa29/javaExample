package day2;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i ++) {
			if(i % 2 == 1) System.out.println(i);
		}
		
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
	}
}
