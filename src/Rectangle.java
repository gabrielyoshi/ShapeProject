
public class Rectangle extends Shape2D{

	public Rectangle(int length, int width) {
		super(length, width);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Rectangle\t" + super.toString()
			+ "\nRectangle: A quadrilateral with four right angles" +
					"\n\tArea: " + calculateArea() +
					"\n\tPerimeter: " + calculatePerimeter() +
					"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		// benefits from shared type check in parent class
		if (!super.equals(obj)) {
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Rectangle other = (Rectangle) obj; 

		// Rectangles are equal if dimensions match regardless of order
	    return
	        (getLength() == other.getLength() && getWidth() == other.getWidth()) ||
	        (getLength() == other.getWidth() && getWidth() == other.getLength());
		}
		
	    return true;
	}

}
