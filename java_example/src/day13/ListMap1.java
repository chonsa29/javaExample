package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap1 {
	static Scanner scan = new Scanner(System.in);
	
	static int setNumber(int n, int min, int max) {
		while(n < min || n > max) {
			System.out.println(min + "~" + max + " 사이의 값을 입력하세요 : ");
			n = scan.nextInt();
		}
		return n;
	}
	
	public static void main(String[] args) {
		// json -> list 안에 map 이 있는 형태
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println("[(1) 추가 (2) 판매 (3) 확인 (4) 종료]");
			int menu = scan.nextInt();
			if (menu == 1) { // 추가 , 과일명, 가격, 개수
				System.out.print("과일명 : ");
				String name = scan.next();
				map.put("name", name);
				
				System.out.print("가격 : ");
				int price = scan.nextInt();
				price = setNumber(price, 100, 100000);
				map.put("price", price);
				
				System.out.print("개수 : ");
				int num = scan.nextInt();
				num = setNumber(num, 1, 300);
				map.put("num", num);
				
				list.add(map);

			} else if (menu == 2) { // 판매

			} else if (menu == 3) { // 확인
				System.out.println(list);
			} else if (menu == 4) { // 종료
				System.out.println("종료합니다.");
				break;
			} else { // 다시시도
				System.out.println("1~4 사이의 값을 입력해주세요.");
			}
		}
	}
}
