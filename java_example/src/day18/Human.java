package day18;

public class Human {
	String name;
	int age;
	String phone;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	boolean setPhone(String phone) {
		this.phone = phone;
		if (phone.length() != 11) {
			System.out.println("핸드폰 번호는 11글자로 입력해주세요. ( - 제외 )");
			return true;
		} else
			return false;
	}

	public String toString() {
		return (name + "의 나이는 " + age + " 입니다.");

	}
}
