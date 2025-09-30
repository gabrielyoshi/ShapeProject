
public class Shape {
	
	// Dimensions that describe size
	private int length; // x-axis
	private int width; // y-axis
	private int height; // z-axis
	
	private static final int DEFAULT_HEIGHT = 0; // z-axis set to 0 for 2D shapes
	private static int numShapes = 0; // counts number of shape objects
	
	protected void printProperties() {
		System.out.println("Length (x-axis) = " + length);
		System.out.println("Width (y-axis) = " + width);
		System.out.println("Height (z-axis) = " + height);
	}
	
	// Constructor for 3D shapes
	
	public Shape(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
		numShapes++;
	}
	
	// Overloaded Constructor for 2D shapes
	
	public Shape(int length, int width) {
		this(length, width, DEFAULT_HEIGHT);
	}
	
	// Accessors for dimensions
	
	public int getLength() { return length;}
	public int getWidth() { return width;}
	public int getHeight() { return height;}
	
	// Mutators for dimensions with validity checking
	
	public void setLength(int length) { 
		if (length <= 0) {
			throw new IllegalArgumentException("Length must be positive.");
		}
		this.length = length;
	}
	public void setWidth(int width) {
		if (width <= 0) {
			throw new IllegalArgumentException("Width must be positive.");
		}
		this.width = width; }
	public void setHeight(int height) {
		if (height <= 0) {
			throw new IllegalArgumentException("Height must be positive.");
		}
		this.height = height;}
	
	// Calculates area of 2D shapes
	
	public int calculateArea() {
		if (height != 0) {
			throw new UnsupportedOperationException("3D shapes do not have area.");
		}
		return length * width;
	}
	
	// Calculates perimeter of 2D shapes
	
	public int calculatePerimeter() {
		if (height != 0) {
			throw new UnsupportedOperationException("3D shape perimeter not supported.");
		}
		return 2*(length + width);
	}
	
	// Calculates volume of all shapes (note: only 3D shapes return value
	
	public int calculateVolume() {
		if (height == 0) {
			throw new UnsupportedOperationException("2D shapes do not have volume.");
		}
		return length * width * height;
	}
	
	// method that returns a text description of shape object
	@Override
	public String toString() {
		return "Length: " + length + "\tWidth: " + width + "\tHeight: " + height;
	}
}
