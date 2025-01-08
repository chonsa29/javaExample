package day9;

public class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	int moveUp() {
		return z = z + 1;
	}

	int moveDown() {
		return z = z - 1;
	}

	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}

	public String toString() {
		return ("(" + getX() + "," + getY() + "," + z + ")");
	}
}
