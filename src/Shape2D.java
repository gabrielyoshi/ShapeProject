
public abstract class Shape2D extends Shape {
	
	private static final int DEFAULT_HEIGHT = 0; // z-axis set to 0 for 2D shapes
	
	// Overloaded Constructor for 2D shapes
	
	public Shape2D(int length, int width) {
		super(length, width, DEFAULT_HEIGHT);
	}
	
	// Calculates area of 2D shapes
	
	public double calculateArea() {
		return getLength() * getWidth();
	}
	
	// Calculates perimeter of 2D shapes
	
	public double calculatePerimeter() {
		return 2*(getLength() + getWidth());
	}
	// Generic version of equals()
	@Override
	public boolean equals(Object obj) {
		// covers case if same reference
	    if (this == obj) return true;
	 // ensures the types are the same
	    if (obj == null || getClass() != obj.getClass()) return false;

	    // Safe cast to Shape2D
	    Shape2D other = (Shape2D) obj;

	    // Default equality check: both have same length and width works on Square
	    return Double.compare(getLength(), other.getLength()) == 0 &&
	           Double.compare(getWidth(), other.getWidth()) == 0;
	}
	
	

}
