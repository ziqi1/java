package ziqi.first.test;

import ziqi.first.Point;
import ziqi.first.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle s = new Rectangle (new Point (7,6),5,8);
		System.out.printf("the area of the %s at position %s is %5.2f\n",s.getType(),s.getTopLeft(), s.area());
	}

}
