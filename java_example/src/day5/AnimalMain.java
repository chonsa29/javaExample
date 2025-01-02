package day5;

public class AnimalMain {
	public static void main(String[] args) {
		Animal lion = new Animal();
		Animal bear = new Animal();

		lion.name = "lion";
		bear.name = "bear";
		lion.age = 4;
		bear.age = 8;
		
		lion.eat();
		lion.speak();
		lion.love();
		
		bear.eat();
		bear.speak();
		bear.love();
	}

}
