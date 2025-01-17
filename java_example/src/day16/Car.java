package day16;

public class Car implements CarManager {
	String kind;
	int speed;
	String color;

	Car(String kind, int speed, String color) {
		this.kind = kind;
		this.speed = speed;
		this.color = color;
	}

	public String toString() {
		return ("차 종류는 " + kind + ",색은 " + color + " 입니다.");
	}

	@Override
	public void SpeedUp(int speed) {
		// TODO Auto-generated method stub
		if (this.speed + speed > 200)
			this.speed = 200;
		else
			this.speed += speed;
	}

	@Override
	public void SpeedDown(int speed) {
		// TODO Auto-generated method stub
		if (this.speed - speed < 0)
			this.speed = 0;
		else
			this.speed -= speed;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}
}
