package day2;
import java.util.Scanner;
	
public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = s.next();

		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();
		
		System.out.println(name + "의 나이는 " + age + " 입니다.");
	}

}

