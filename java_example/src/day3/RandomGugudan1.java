package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGugudan1 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int cnt1 = 0, cnt2 = 0;
		
		while (true) {
			int x = ran.nextInt(1, 10);
			int y = ran.nextInt(1, 10);
			System.out.println("랜덤 구구단입니다. (-1을 입력하여 종료)");
			System.out.print(x + " * " + y + " = ");
			int ans = s.nextInt();

			if (ans == x * y) {
				System.out.println("정답입니다!");
				cnt1++;
				cnt2++;
			} else if (ans == -1) {
				System.out.println(cnt2 + "문제 중 " + cnt1 + "문제를 맞췄습니다.");
				break;
			} else {
				System.out.println("오답입니다.정답은" + (x * y) + "입니다.");
				cnt2++;
			}
		}
	}
}