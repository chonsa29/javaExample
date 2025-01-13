package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {
	static Scanner scan = new Scanner(System.in);

	public static int setScore(int score, int max) {
		while (score < 0 || score > max) {
			System.out.println("0~" + max + " 사이의 점수를 입력해주세요 : ");
			score = scan.nextInt();
		}
		return score;
	}

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			// 이름(name), 자바점수(java), 오라클점수(oracle), html점수(html)
			// 점수는 0~100 사이만 가능

			System.out.println("[ (1) 추가 (2) 수정 (3) 확인 (4) 종료 ]");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.print("이름 : "); // 이름
				String name = scan.next();
				map.put("name", name);

				System.out.print("자바점수 : ");// 자바점수
				int java = scan.nextInt();
				map.put("java", setScore(java, 40));

				System.out.print("오라클점수 : "); // 오라클 점수
				int oracle = scan.nextInt();
				map.put("oracle", setScore(oracle, 35));

				System.out.print("html점수 : "); // html 점수
				int html = scan.nextInt();
				map.put("html", setScore(html, 25));

				list.add(map);
			} else if (menu == 2) { // 수정
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("과목 : ");
				String subject = scan.next();
				System.out.print("점수 : ");
				int score = scan.nextInt();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("name").equals(name)) {
						if(subject.equals("자바")) {
							list.get(i).put("java", setScore(score,40));
						}else if (subject.equals("오라클")) {
							list.get(i).put("oracle", setScore(score,35));
						}
						else if (subject.equals("html")) {
							list.get(i).put("html", setScore(score,25));
						}
						break;
					}
				}
			} else if (menu == 3) {
				System.out.println(list);
			} else if (menu == 4) {
				break;
			}

		}
	}
}
