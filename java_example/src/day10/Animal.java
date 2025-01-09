package day10;

public class Animal {
	private String animal;
	private int age;

	Animal(String animal, int age) {
		this.animal = animal;
		this.age = age;
	}

	void info() {
		System.out.println("이름 : " + animal + ", 나이 :" + age);
	}

	void sound() {
		System.out.println(animal + "이 소리를 냅니다.");
	}
}
