package day2;
import java.util.Scanner;

public class If_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int num = s.nextInt();
		
		if(num >= 90) System.out.println("A");
		else if(num >= 80) System.out.println("B");
		else if(num >= 70) System.out.println("C");
		else System.out.println("F");
	}
}
