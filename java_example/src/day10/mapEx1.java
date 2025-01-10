package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class mapEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();


		while (true) {
			System.out.print("[(1) 추가 (2) 확인 (3) 삭제 (4) 종료] : ");
			int menu = scan.nextInt();

			if (menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				map.put("name", scan.next());
				System.out.print("나이 : ");
				map.put("age", scan.nextInt());
				System.out.print("주소 : ");
				map.put("addr", scan.next());
				list.add(map);
			} else if (menu == 2) {
				System.out.println(list.size());
				for (int i = 0; i < list.size(); i++) {
					System.out.print((i+1)+". ");
					System.out.print("이름 : " + list.get(i).get("name") + ", ");
					System.out.print("나이 : " + list.get(i).get("age") + ", ");
					System.out.println("주소 : " + list.get(i).get("addr"));
				}
			} else if (menu == 3) {
				System.out.print("삭제할 이름을 입력하세요 : ");
				String str = scan.next();
				
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("name").equals(str)) {
						list.remove(i);
					}
				}

			} else if (menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4번중에 선택해라");
			}
		}
	}
}
