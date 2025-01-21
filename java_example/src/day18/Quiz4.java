package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz4 {

	static Scanner scan = new Scanner(System.in);
	
	static int getPrice() {
		int price = scan.nextInt();
		while(price < 100 || price > 10000) {
			System.out.print("100~10000사이 값을 입력해 주세요 : ");
			price = scan.nextInt();
		}
		return price;
	}
	
	static int getCount() {
		int count = scan.nextInt();
		while(count < 0 || count > 100) {
			System.out.print("0~100사이 값을 입력해 주세요 : ");
			count = scan.nextInt();
		}
		return count;
	}
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			System.out.print("=== (1) 과일 추가 (2) 과일 판매 (3) 가격수정 (4) 현황 파악 (그외) 종료 ===");

			int n = scan.nextInt();

			if (n == 1) {
				HashMap<String, Object> map = new HashMap<>();

				System.out.print("이름 : ");
				String name = scan.next();
				boolean exists = false;

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("name").equals(name))
						exists = true;
				}
				if (exists) {
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).get("name").equals(name)) {
							System.out.print("개수 : ");
							int count = scan.nextInt();
							int _count = (int) list.get(i).get("count");
							
							while(count + _count > 100) {
								System.out.print("최대 개수는 100개입니다. 다시 입력해주세요 : ");
								count = scan.nextInt();
							}
							list.get(i).replace("count", count+_count);
						}
					}

				} else {
					map.put("name", name);
					System.out.print("가격 : ");
					int price = getPrice();
					map.put("price", price);
					System.out.print("개수 : ");
					int count = getCount();
					map.put("count", count);

					list.add(map);
				}
			} else if (n == 2) {
				System.out.print("판매할 항목을 입력하세요 : ");
				String name = scan.next();
				boolean exists = false;

				for (int i = 0; i < list.size(); i++) {
					String _name = (String) list.get(i).get("name");
					if (name.equals(_name)) {
						System.out.println(name + "을(를) 판매합니다.");
						list.remove(i);
						exists = true;
					}
				}
				if (!exists)
					System.out.println(name + "은(는) 존재하지 않습니다.");
			} else if (n == 3) {
				System.out.print("수정할 항목을 입력하세요 : ");
				String name = scan.next();

				for (int i = 0; i < list.size(); i++) {
					String _name = (String) list.get(i).get("name");
					if (name.equals(_name)) {
						System.out.print("가격을 수정해주세요(기존 가격) " + list.get(i).get("price") + " : ");
						int price = scan.nextInt();
						list.get(i).replace("price", price);
					}
				}
			} else if (n == 4) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).get("name") + "의 가격은 " + list.get(i).get("price") + "원, 개수는 "
							+ list.get(i).get("count") + "개 남았습니다.");
				}
			} else {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}
