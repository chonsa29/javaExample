package day9;

public class CalcMain {
	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		int div = calc.div(5, 10);
		int mod = calc.mod(5, 2);
		int sum = calc.sum(3, 2);
		int mul = calc.mul(3, 5);
		int sub = calc.sub(10, 5);
	}
}
