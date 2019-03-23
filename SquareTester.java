package ziqi.first.test;

import ziqi.first.Point;
import ziqi.first.Square;

public class SquareTester {
	
	public static void main(String[] args) {
		Point topLeft = new Point(1,4);
		Square s = new Square( topLeft, 5);
		System.out.printf("the area of the %s at position %s is %5.2f\n",s.getType(),s.getTopLeft(), s.area());
	}
	
}
