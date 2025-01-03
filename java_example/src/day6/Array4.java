package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		int arr[][] = new int[4][2];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				int n = scan.nextInt();
				arr[i][j] = n;
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
