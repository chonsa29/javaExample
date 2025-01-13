package day12;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class WordQuiz {
	String name;
	private static Vector<Word> v;

	public WordQuiz(String name) {
		this.name = name;
		v = new Vector<Word>();
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("human", "인간"));
		v.add(new Word("stock", "주식"));
		v.add(new Word("trade", "거래"));
		v.add(new Word("society", "사회"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("honey", "꿀"));
		v.add(new Word("dall", "인형"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("fault", "오류"));
		v.add(new Word("example", "보기"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("statue", "조각상"));
	}

	public static void main(String[] args) {

		WordQuiz quiz = new WordQuiz("영어테스트");
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("\"" + quiz.name + "\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다. \n 현재 17개의 단어가 들어 있습니다.");

		while (true) { 
			int r = ran.nextInt(17); 
			System.out.println(v.get(r).getEnglish() + "?");

			boolean flag = false;
			int prev = ran.nextInt(17);
			int cur;
			Vector<Integer> v2 = new Vector<Integer>();

			while (true) { 
				for (int i = 0; i < 4; i++) {
					if (i == 0) {
						if (prev == r)
							flag = true;
						v2.add(prev);
					} else {
						cur = ran.nextInt(17);
						while (cur == prev) {
							cur = ran.nextInt(17);
						}
						prev = cur;
						if (cur == r)
							flag = true;
						v2.add(cur);
					}
				}
				if (flag == true)
					break;
				else
					v2.removeAllElements();
			}

			System.out.print("(1)" + v.get(v2.get(0)).getKorean() + " (2)" + v.get(v2.get(1)).getKorean() + " (3)"
					+ v.get(v2.get(2)).getKorean() + " (4)" + v.get(v2.get(3)).getKorean());
			int n = scan.nextInt();

			if (v.get(v2.get(n - 1)).getEnglish().equals(v.get(r).getEnglish())) {
				System.out.println("정답!");
			} else if (n == -1)
				break;
			else {
				System.out.println("오답!");
			}
		}
	}

}
