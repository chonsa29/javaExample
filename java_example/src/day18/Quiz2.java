package day18;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[6];

		for (int i = 0; i < 6; i++) {
			System.out.print(i + 1 + "번째 배열에 들어갈 숫자를 입력하세요 : ");
			int num = scan.nextInt();
			while (true) {
				for (int j = 0; j < i; j++) {
					if (num == arr[j]) {
						System.out.println("중복된 숫자입니다. 다시 입력하세요 : ");
						i--;
						break;
					}
				}
				if (num < 1 || num > 100) {
					System.out.print("1~100사이의 값을 입력하세요 : ");
					num = scan.nextInt();
					continue;
				} else
					break;
			}
			arr[i] = num;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1] > arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
