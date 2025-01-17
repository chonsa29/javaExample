package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz5 {
	static Scanner scan = new Scanner(System.in);

	static int getScore(String subject) {
		System.out.print(subject + " : ");
		int score = scan.nextInt();
		while (score < 0 || score > 100) {
			System.out.println("0~100 값을 입력해주세요.");
			System.out.print(subject + " : ");
			score = scan.nextInt();
		}
		return score;
	}

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		System.out.println("=== 학생 관리 시스템 입니다! ===");
		while (true) {
			System.out.print("[(1) 학생추가 (2) 성적입력 (3) 조회 (4) 성적수정 (5) 종료]");

			int n = scan.nextInt();
			if (n == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 입력 :");
				String name = scan.next();
				boolean same = false;

				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						System.out.println("이미 존재하는 학생입니다. 처음으로 이동합니다.");
						same = true;
						break;
					}
				}
				if (same == false) {
					map.put("name", name);
					list.add(map);
					System.out.println("학생이 추가되었습니다!");
				}
			} else if (n == 2) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				int java = getScore("java");
				int oracle = getScore("oracle");

				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						list.get(i).put("java", java);
						list.get(i).put("oracle", oracle);
					}
				}
			} else if (n == 3) {
				System.out.println("ArrayList 객체를 그대로 출력합니다.");
				System.out.println(list);
			} else if (n == 4) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				boolean exists = false;

				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						exists = true;
						System.out.print("수정할 과목명(java, oracle) : ");
						String subject = scan.next();

						if (subject.equals("java")) {
							int score = getScore("java");
							list.get(i).replace("java", score);
						} else if (subject.equals("oracle")) {
							int score = getScore("oracle");
							list.get(i).replace("oracle", score);
						} else {
							System.out.println("없는 과목입니다. 메뉴로 이동합니다.");
							break;
						}

					}
				}

				if (exists == false) {
					System.out.println("해당 학생이 존재하지 않습니다.");
				}
			} else if (n == 5) {
				System.out.println("종료되었습니다.");
				break;
			}

		}
	}
}
