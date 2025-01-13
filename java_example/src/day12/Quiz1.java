package day12;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("영문 테스트를 입력하고 세미콜론을 입력하세요.");

		String str = scan.nextLine();

		for (int i = 97; i <= 122; i++) {
			int num = 0;
			for (int j = 0; str.charAt(j) != '\0'; j++) {
				if (str.charAt(j) == i) {
					num++;
				}
			}

			if (num != 0) {
				System.out.println((char) (i - 32) + " " + num + "개\n");
			}
		}
	}
}
