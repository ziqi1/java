package ziqi.first;

public class Rectangle {
		Point topLeft;
		double width;
		double height;
		String type = "Rectangle";
		
	public Rectangle (Point topLeft, double width,double height){
		this.topLeft = topLeft;
		this.height = height;
		this.width = width;
	}

	public Point getTopLeft() {
		return topLeft;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	 public double area() {
		return width * height;
		
	}
}