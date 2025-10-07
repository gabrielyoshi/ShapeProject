
public abstract class Shape3D extends Shape {

	// Constructor for 3D shapes inherits from Shape constructor
	
	public Shape3D(int length, int width, int height) {
		super(length, width, height);
	}
	
	// Calculates volume of all shapes (note: only 3D shapes return value
	
	//public int calculateVolume() {
		//return getLength() * getWidth() * getHeight();
	//}
	
	@Override
	public boolean equals(Object obj) {
		// covers case if same reference
	    if (this == obj) return true;
	    // ensures the types are the same
	    if (obj == null || getClass() != obj.getClass()) return false;
	    // Safe cast to Shape3D
	    Shape3D other = (Shape3D) obj;
	    // Works for generic 3D shapes
	    // But need specific implementation for cube and cylinder
	    return Double.compare(getLength(), other.getLength()) == 0 &&
	           Double.compare(getWidth(), other.getWidth()) == 0 &&
	           Double.compare(getHeight(), other.getHeight()) == 0;
	}
	
}
