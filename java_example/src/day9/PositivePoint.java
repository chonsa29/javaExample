package day9;

public class PositivePoint extends Point {
	PositivePoint() {
		super(0, 0);
	}

	PositivePoint(int x, int y) {
		if (x < 0 || y < 0) {
			super.move(0, 0);
		} else {
			move(x, y);
		}
	}

	protected void move(int x, int y) {
		if (x >= 0 && y >= 0)
			super.move(x, y);
	}

	public String toString() {
		return ("(" + getX() + "," + getY() + ")" + "의 점");
	}
}
