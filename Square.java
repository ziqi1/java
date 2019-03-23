package ziqi.first;

public class Square {
	private Point topLeft;
	private double side;
	private String type = "Square";
	
	public Square (Point topLeft, double side){
		this.topLeft = topLeft;
		this.side = side;
	}

	public Point getTopLeft() {
		return topLeft;
	}

	public double getSide() {
		return side;
	}

	public String getType() {
		return type;
	}

	public double area() {
		return side * side;
	}
}
