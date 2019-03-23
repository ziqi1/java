package ziqi.first;

public class TriangleTwo {
		public Point topLeft;
		double a;
		double b;
		double z;
		public String type = "Triangle2";
		
	public TriangleTwo (Point topLeft, double b,double a,double z){
		this.topLeft = topLeft;
		this.a = a;
		this.b = b;
		this.z = z;
	}

	public double area() {
		return a * b *  z/2;
}
}
