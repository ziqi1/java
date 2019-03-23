package ziqi.first;

public class Triangle {
	Point topLeft;
	double width;
	double height;
	String type = "Triangle";

	public Triangle(Point topLeft, double width, double height) {
		this.topLeft = topLeft;
		this.height = height;
		this.width = width;
	}

	public double area() {
		return width * height / 2;

	}

	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}