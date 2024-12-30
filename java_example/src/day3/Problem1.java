package day3;

import java.util.Random;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while (true) {
			System.out.println("문제 수를 입력해주세요. 0이하 숫자 입력 시 종료됩니다.");
			int num = s.nextInt(); //문제 수를 입력받음, 0이하 입력 시 종료
			int cnt = 0; //맞은 문제 갯수 카운터

			if (num <= 0) { //0이하 입력 시 종료
				System.out.println("종료되었습니다.");
				break;
			} else {//아닐 경우 num 수만큼 문제를 받음
				for (int i = 0; i < num; i++) {
					int x = ran.nextInt(9) + 1; //랜덤 x값
					int y = ran.nextInt(9) + 1; //랜덤 y값

					System.out.print(x + " * " + y + " = ");
					int ans = s.nextInt(); //정답 입력

					if (ans == x * y) { //정답일 경우
						System.out.println("정답입니다!");
						cnt++;
					} else {//오답일 경우
						System.out.println("오답! 정답은 " + (x * y) + "입니다.");
					}
				}
				System.out.println("총 " + num + "문제 중 " + cnt + "개 맞추셨습니다."); //맞춘 문제 개수
			}
		}

	}
}
