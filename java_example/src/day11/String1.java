package day11;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		String str = scan.nextLine();

		
		for(int i = 0;i<str.length();i++) {
			String first = str.substring(0,1);
			String last = str.substring(1);
			str = last + first;
			System.out.println(str);
		}
	}
}
