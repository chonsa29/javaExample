package day2;
import java.util.Scanner;

public class If_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = s.nextInt();
		
		if(age >= 50) System.out.println("50세 이상입니다.");
		else if(age >= 40) System.out.println("40대 입니다.");
		else if(age >= 30) System.out.println("30대 입니다.");
		else if(age >= 20) System.out.println("20대 입니다.");
		else System.out.println("성인이 아닙니다.");
	}
}
	