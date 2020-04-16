package week03.aufgabe05;

import java.awt.*;

public class RectangleTest {
	public static void main(String[] args) {
		testConstructor();	System.out.println();
		testIsSquare();		System.out.println();
		testIsSame();		System.out.println();
		testEncloses();		System.out.println();
		testOverlaps();		System.out.println();
		testStrench();		System.out.println();
		testShrink();		System.out.println();
		testStrechShrink();	System.out.println();
	}

	private static void testConstructor() {
		week03.aufgabe05.Rectangle r1 = new week03.aufgabe05.Rectangle(new Point(2, 2), new Point(6, 5));
		Point topLeft = r1.getTopLeft();
		boolean topLeftOk = topLeft.getX() == 2 && topLeft.getY() == 2;
		Point bottomRight = r1.getBottomRight();
		boolean bottomRightOk = bottomRight.getX() == 6 && bottomRight.getY() == 5;
		System.out.println("testConstructor ok? " +  (topLeftOk && bottomRightOk));
	}

	private static void testIsSame() {
		week03.aufgabe05.Rectangle r1 = new week03.aufgabe05.Rectangle(new Point(2, 2), new Point(4, 4));
		week03.aufgabe05.Rectangle r2 = new week03.aufgabe05.Rectangle(new Point(2, 2), 2);
		System.out.println("testIsSame1 ok? " + r1.isSame(r2));
		System.out.println("testIsSame2 ok? " + r2.isSame(r1));
	}

	private static void testIsSquare() {
		week03.aufgabe05.Rectangle r1 = new week03.aufgabe05.Rectangle(new Point(-2, -2), new Point(4, 4));
		System.out.println("testIsSquare1 ok? " + r1.isSquare());
		week03.aufgabe05.Rectangle r2 = new week03.aufgabe05.Rectangle(new Point(2, 2), 2);
		System.out.println("testIsSquare2 ok? " + r2.isSquare());
	}
	
	private static void testEncloses() {
		week03.aufgabe05.Rectangle r1 = new week03.aufgabe05.Rectangle(new Point(1, 1), new Point(4, 4));
		System.out.println("testEncloses1 ok? " + r1.encloses(r1));
		week03.aufgabe05.Rectangle r2 = new week03.aufgabe05.Rectangle(new Point(2, 2), new Point(5, 5));
		week03.aufgabe05.Rectangle r3 = new week03.aufgabe05.Rectangle(new Point(3, 3), new Point(4, 4));
		System.out.println("testEncloses2 ok? " + r2.encloses(r3));
		System.out.println("testEncloses3 ok? " + !r3.encloses(r2));
		System.out.println("testEncloses4 ok? " + !r2.encloses(r1));
		week03.aufgabe05.Rectangle r4 = new week03.aufgabe05.Rectangle(new Point(2, 2), new Point(4, 4));
		System.out.println("testEncloses5 ok? " + r2.encloses(r4));
		week03.aufgabe05.Rectangle r5 = new week03.aufgabe05.Rectangle(new Point(3, 3), new Point(4, 6));
		System.out.println("testEncloses6 ok? " + !r2.encloses(r5));
		// not all scenarios tested
	}

	private static void testOverlaps() {
		week03.aufgabe05.Rectangle rect = new week03.aufgabe05.Rectangle(new Point(2, 2), new Point(5, 5));
		week03.aufgabe05.Rectangle inside = new week03.aufgabe05.Rectangle(new Point(3, 3), new Point(4, 4));
		System.out.println("testOverlaps01 ok? " + rect.overlaps(inside)); // areas overlap (also if fully enclosed)
		System.out.println("testOverlaps02 ok? " + inside.overlaps(rect)); 
		week03.aufgabe05.Rectangle border = new week03.aufgabe05.Rectangle(new Point(4, 5), new Point(8, 9));
		System.out.println("testOverlaps03 ok? " + !rect.overlaps(border)); // boundaries overlap
		System.out.println("testOverlaps04 ok? " + !border.overlaps(rect)); 
		week03.aufgabe05.Rectangle overlap = new week03.aufgabe05.Rectangle(new Point(3, 4), new Point(8, 9));
		System.out.println("testOverlaps05 ok? " + rect.overlaps(overlap));
		System.out.println("testOverlaps06 ok? " + overlap.overlaps(rect));
		week03.aufgabe05.Rectangle upper = new week03.aufgabe05.Rectangle(new Point(0, 0), new Point(7, 1));
		System.out.println("testOverlaps07 ok? " + !rect.overlaps(upper)); 
		System.out.println("testOverlaps08 ok? " + !upper.overlaps(rect)); 
		week03.aufgabe05.Rectangle left = new week03.aufgabe05.Rectangle(new Point(0, 0), new Point(1, 7));
		System.out.println("testOverlaps09 ok? " + !rect.overlaps(left)); 
		System.out.println("testOverlaps10 ok? " + !left.overlaps(rect)); 
		week03.aufgabe05.Rectangle bottom = new week03.aufgabe05.Rectangle(new Point(0, 6), new Point(7, 6));
		System.out.println("testOverlaps11 ok? " + !rect.overlaps(bottom)); 
		System.out.println("testOverlaps12 ok? " + !bottom.overlaps(rect)); 
		week03.aufgabe05.Rectangle right = new week03.aufgabe05.Rectangle(new Point(6, 0), new Point(6, 7));
		System.out.println("testOverlaps13 ok? " + !rect.overlaps(right)); 
		System.out.println("testOverlaps14 ok? " + !right.overlaps(rect)); 
	}

	private static void testStrench() {
		week03.aufgabe05.Rectangle rect = new week03.aufgabe05.Rectangle(new Point(4, 5), new Point(7, 9));
		week03.aufgabe05.Rectangle expected = new week03.aufgabe05.Rectangle(new Point(4, 5), new Point(10, 13));
		System.out.println("testStretch ok? " + rect.stretch(2).isSame(expected));
	}

	private static void testShrink() {
		week03.aufgabe05.Rectangle rect = new week03.aufgabe05.Rectangle(new Point(4, 5), new Point(13, 17));
		week03.aufgabe05.Rectangle expected = new week03.aufgabe05.Rectangle(new Point(4, 5), new Point(7, 9));
		System.out.println("testShrink ok? " + rect.shrink(3).isSame(expected));
	}
 
	private static void testStrechShrink() {
		week03.aufgabe05.Rectangle r = new Rectangle(new Point(1, 1), new Point(5, 9));
		boolean result = r.stretch(2).shrink(2).isSame(r);
		System.out.println("testStretchShrink ok? " + result);
	}
}
