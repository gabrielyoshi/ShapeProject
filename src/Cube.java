
public class Cube extends Shape3D {
	
	private int side;

	public Cube(int side) {
		super(side, side, side);
		this.side = side;
		// TODO Auto-generated constructor stub
	}
	
	public double calculateArea() {
		return 6 * Math.pow(side,  2);
	}
	
	public double calculateVolume() {
		return Math.pow(side, 3);
	}
	
	@Override
	public String toString() {
		return "Cube\t\t" + super.toString() +
				"\nCube: A three-dimensional solid object bounded by six square "
				+ "faces with three meeting at each vertex" +
				"\n\tArea: " + calculateArea() +
				"\n\tVolume: " + calculateVolume() +
				"\n";
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Cube other = (Cube) obj;
	        return Double.compare(this.side, other.side) == 0;
	    }
	 
	 public boolean hasSameSide(Square square) {
		    if (square == null) {
		        return false;
		    }
		    // Compare side lengths
		    return Double.compare(this.side, square.getLength()) == 0;
		}

}
