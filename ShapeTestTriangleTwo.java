package ziqi.first.test;

import ziqi.first.Point;
import ziqi.first.TriangleTwo;

public class ShapeTestTriangleTwo {
	public static void main(String[] args) {
		TriangleTwo s = new TriangleTwo (new Point (8,7), 3,4.2,0.70710678118);
		System.out.printf("the area of the %s at position %s is %5.2f\n",s.type,s.topLeft, s.area());
}
}
