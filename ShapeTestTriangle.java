package ziqi.first.test;

import ziqi.first.Point;
import ziqi.first.Triangle;

public class ShapeTestTriangle {
	
	public static void main(String[] args) {
		Triangle s = new Triangle (new Point (8,7),3,4);
		System.out.printf("the area of the %s at position %s is %5.2f\n",s.getType(),s.getTopLeft(), s.area());
	}
}
