package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String name = scan.next();
			list.add(name);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}

		String longName = "";
		for (int i = 0; i < list.size(); i++) {
			if (longName.length() < list.get(i).length()) {
				longName = list.get(i);
			}
		}
		System.out.println("가장 긴 이름 : " + longName);
	}
}
