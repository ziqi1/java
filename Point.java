package ziqi.first;

public class Point {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("(%5.2f, %5.2f)", x, y);
	}

}
