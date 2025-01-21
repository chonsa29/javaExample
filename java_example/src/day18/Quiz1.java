package day18;

public class Quiz1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<101;i++) {
			if(i%2 == 1 || i % 8 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
