package day6;

import java.util.Arrays;
import java.util.Random;

public class Array5 {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		
		//arr의 모든 요소에 값을 1~20사이의 랜덤한 값으로 넣기, 그리고 모든 수의 평균 구하기
		
		Random ran = new Random();
		
		int cnt = 0;
		double sum = 0;
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = ran.nextInt(20)+1;
				sum += arr[i][j];
				cnt++;
			}
			System.out.println(Arrays.toString(arr[i]));
		}


		
		System.out.println("모든 값의 평균은 " + sum/cnt+" 입니다.");
	}
}
