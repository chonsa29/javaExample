package day1;

public class Operator1 {

	public static void main(String[] args) {
		int a = 1;
		a += 1;
			

		int x = 5;
		int y = ++x; //y = 6, x = 6;
		y = x--; // y = 6, x = 5;
		int z = x + y; // z = 11;
		++x; //x = 6;
		x = z++; // x = 11, z = 12;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	} 
}
