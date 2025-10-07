
public class Circle extends Shape2D {
	
	double DEFAULT_PI = Math.PI;
	private double radius;
	
	public Circle(double radius) {
		// Call the Shape2D class with placeholder values
		super((int) radius, 0);
		this.radius = radius; // stores radius in this class
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculateArea() {
		// implements A = pi * r^2
		return DEFAULT_PI * Math.pow(radius,  2);
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * DEFAULT_PI * radius;
	}
	
	public double getRadius() { return radius; }
	
	@Override
	public String toString() {
		return "Circle\t\tRadius: " + radius + "\tDiameter: " + radius*2 +
				"\nCircle: A closed plane curve every point of which "
				+ "is equidistant from a fixed point within the curve" +
				"\n\tArea: " + calculateArea() +
				"\n\tPerimeter: " + calculatePerimeter() +
				"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true; 
	    // ensures the types are the same
	    if (obj == null || getClass() != obj.getClass()) return false;
	    // casts obj parameter as a Circle
	    Circle other = (Circle) obj;
	    return Double.compare(radius, other.radius) == 0;
	}
	

}
