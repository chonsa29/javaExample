package day3;


public class Gugudan {
	public static void main(String[] args) {
		for (int i = 9; i >= 2; i--) {
			System.out.println("=========="+i+"단==========");
			for (int j = 1; j <= 9; j++) {
					System.out.print(i + "*" + j + "=");
					System.out.println(i * j);
			}
			System.out.println();
		}
	}
}