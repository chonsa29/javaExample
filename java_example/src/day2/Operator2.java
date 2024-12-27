package day2;


public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		int num3 = 10;
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num3);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		boolean temp = true;
		System.out.println(temp);
		System.out.println(!temp);
		System.out.println(!(num1 > num2));
		System.out.println((num1 > num2)&&(num1 >= num3));
	}

}
