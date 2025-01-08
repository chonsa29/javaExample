package day9;

public class Test {
	static void increase(int n) {
		n = n + 1;
	}

	static void increase(Circle c) {
		c.radius++;
	}
	
	public static void main(String[] args) {
		int n = 30;
		

		increase(n);
		System.out.println(n);

		Circle c = new Circle(50);
		increase(c);
		System.out.println(c.radius);
	}
}

class Circle {
	int radius;

	Circle(int r){
		radius = r;
	}
}