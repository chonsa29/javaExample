package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map2 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();


		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			
			map.put("name", scan.next());
			map.put("age", scan.nextInt());
			map.put("height", scan.nextDouble());
			
			list.add(map);
		}

		System.out.println(list);
	}
}
