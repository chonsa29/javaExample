package day18;

import java.util.ArrayList;

public class Student extends Human{
	String StuNo;
	Student(String name, int age, String StuNo){
		super(name,age);
		this.StuNo = StuNo;
	}
	
	ArrayList<String> subjectList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("자바");
		list.add("오라클");
		list.add("HTML");
		
		return list;
	}
}
