package test1;

import java.util.Random;
import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int n = ran.nextInt(100) + 1;
		int cnt = 0;

		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = s.nextInt();

			if (num > n) {
				System.out.println("DOWN!");
				cnt++;
			} else if (num < n) {
				System.out.println("UP!");
				cnt++;
			} else if (num == n) {
				cnt++;
				System.out.println("정답입니다!");
				System.out.println(cnt + "번 만에 맞추셨습니다.");
				break;
			}
		}
	}
}