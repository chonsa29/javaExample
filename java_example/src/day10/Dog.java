package day10;

public class Dog extends Animal{
	String breed;
	
	Dog(){
		super("정보없음", 0);
	}
	
	Dog(String animal, int age, String breed){
		super(animal, age);
		this.breed = breed;
	}
	
	void sound() {
		System.out.println("멍멍!");
	}
	
	String getBreed() {
		return breed;
	}
}
