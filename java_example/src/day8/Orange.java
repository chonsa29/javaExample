package day8;

public class Orange extends Fruit {

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("오렌지는 달다.");
//		super.print();
	}

	public String toString() {
		return "과일명: " + name + ", 색: " + color + ", 가격:" + price;
	}
}