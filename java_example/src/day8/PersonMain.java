package day8;

public class PersonMain {
	public static void main(String[] args) {
		Person hong = new Person("홍길동", 30, "서울");
		
		Student kim = new Student("김철수",25,"인천");
//		kim.name = "김철수";
		kim.eat();
		kim.study();
		
		Student park = new Student("박영희",20,"제주도","12341234");
	}
}
