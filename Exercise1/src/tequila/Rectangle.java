package tequila;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rectangle {
	
	public boolean isInside(Point p) {
		return true;
	} 
	
	public boolean isOutside(Point p) {
		return false;
	}
	// initialize the points 
	Point p = new Point(10,10);
	
	boolean isOverlapping(Rectangle r) {
		
		if (r.isInside(p) == true || r.isOutside(p) == false) 
		{
			System.out.println("Rectangle Overlapping");
			return true;
		}
		else
		{
			System.out.println("Rectangle Not Overlapping");
			return false;
		}
	}
	// Depending upon the return value of isInside and isOutside the tests will check if the rectangle ovelapped.
	
	// First test if the rectangle overlapped
	@Test
	  public void testOverlaped() {
		Rectangle r = new Rectangle();
		assertEquals(true,isOverlapping(r));
	}
	
	// Second rectangle not overlapped 
	@Test
	  public void testNotOverlaped() {
		Rectangle r = new Rectangle();
		assertEquals(false,isOverlapping(r));
	}
}
