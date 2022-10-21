package ch_3.item_15;

public class Point {
	public double x;
	public double y;

	public Point() {
	}

	public Point(final double x, final double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public static void main(String[] args) {
		Point point = new Point();
		point.x = 10;
		point.y = 30;
	}
}
