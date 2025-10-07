
public abstract class Shape {
	
	// Dimensions that describe size
	private int length; // x-axis
	private int width; // y-axis
	private int height; // z-axis
	
	private static int numShapes = 0; // counts number of shape objects
	
	// Returns a text description that lists properties of shape
	protected void printProperties() {
		System.out.println("Length (x-axis) = " + length);
		System.out.println("Width (y-axis) = " + width);
		System.out.println("Height (z-axis) = " + height);
	}
	
	// Constructor for any shape
	
	public Shape(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
		numShapes++;
	}
	
	// Accessors for dimensions that describe size for ALL shapes
	
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
	
	// method that returns a text description of shape object
	@Override
	public String toString() {
		return "Length: " + length + "\tWidth: " + width + "\tHeight: " + height;
	}
}
