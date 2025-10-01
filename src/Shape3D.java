
public abstract class Shape3D extends Shape {

	// Constructor for 3D shapes inherits from Shape constructor
	
	public Shape3D(int length, int width, int height) {
		super(length, width, height);
	}
	
	// Calculates volume of all shapes (note: only 3D shapes return value
	
	public int calculateVolume() {
		return getLength() * getWidth() * getHeight();
	}
}
