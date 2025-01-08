package day9;

public class PositivePoint extends Point {
	PositivePoint() {
	}

	PositivePoint(int x, int y) {
		if (x < 0 || y < 0) {
			x = 0;
			y = 0;
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
