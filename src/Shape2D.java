
public abstract class Shape2D extends Shape {
	
	private static final int DEFAULT_HEIGHT = 0; // z-axis set to 0 for 2D shapes
	
	// Overloaded Constructor for 2D shapes
	
	public Shape2D(int length, int width) {
		super(length, width, DEFAULT_HEIGHT);
	}
	
	// Calculates area of 2D shapes
	
	public int calculateArea() {
		return getLength() * getWidth();
	}
	
	// Calculates perimeter of 2D shapes
	
	public int calculatePerimeter() {
		return 2*(getLength() + getWidth());
	}

}
