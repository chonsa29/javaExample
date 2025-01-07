package day8;

public class Student extends Person{
	String stuNo;
	int grade;
	
	Student(String name, int age, String addr){
		super(name,age,addr);
	}
	Student(String name, int age, String addr, String stuNo){
		super(name,age,addr);
		this.stuNo = stuNo;
	}
	
	void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
}
