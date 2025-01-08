package day9;

public class ColorPoint extends Point {
	String color;

	ColorPoint() {
		super(0, 0);
		color = "BLACK";
	}

	ColorPoint(int x, int y) {
		super(x, y);
		color = "BLACK";
	}

	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void setXY(int x, int y) {
		move(x, y);
	}

	void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")" + "의 점";
	}
}
