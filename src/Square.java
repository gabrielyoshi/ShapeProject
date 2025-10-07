
public class Square extends Shape2D {

	public Square(int side) { // Squares just need one side measurement
		super(side, side);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Square\t\t" + super.toString() +
				"\nSquare: A quadrilateral with four equal sides and "
				+ "four equal angles" +
				"\n\tArea: " + calculateArea() +
				"\n\tPerimeter: " + calculatePerimeter() +
				"\n";
	}

}
