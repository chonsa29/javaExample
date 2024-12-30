package day3;

public class Loop2 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=9) {
			int j = 1;
			while(j<=9) {
				System.out.println(i + "*" + j + " = " + i*j);
				j++;
			}
			i++;
		}		
	}
}