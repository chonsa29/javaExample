package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review4 {
	public static void main(String[] args) {
		// 이름 나이 주소를 입력받아서 map에 저장하고 list에 추가하기 (3명)

		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			
			System.out.print("이름 : ");
			map.put("name", scan.next());
			System.out.print("나이 : ");
			map.put("age", scan.nextInt());
			System.out.print("주소 : ");
			map.put("address", scan.next());
			
			list.add(map);
		}
		
		System.out.println(list);
	}
}
