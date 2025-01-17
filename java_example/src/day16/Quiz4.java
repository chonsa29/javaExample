package day16;

public class Quiz4 {
	public static void main(String[] args) {
		Car c = new Car("소나타",0,"검정");
		System.out.println(c);
		c.SpeedUp(100);
		System.out.println(c.getSpeed());
		c.SpeedUp(150);
		System.out.println(c.getSpeed());
		c.SpeedDown(30);
		System.out.println(c.getSpeed());
	}
}
