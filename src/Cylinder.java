
public class Cylinder extends Shape3D{
	
	private double radius;
	private double height;
	double DEFAULT_PI = Math.PI;
	

	public Cylinder(double radius, double height) {
		// calls superclass constructor and casts doubles as int
		super((int) radius, (int) radius, (int) height); 
		this.radius = radius;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	public double calculateArea() {
		return 2 * DEFAULT_PI * Math.pow(radius, 2) + 2 * DEFAULT_PI * radius * height;
	}
	
	public double calculateVolume() {
		return DEFAULT_PI * Math.pow(radius, 2) * height;
	}
	
	public double getRadius() { return radius;}
	
	@Override
	public String toString() {
		return "Cylinder\t" + super.toString() +
				"\nCylinder: A solid geometric figure with straight parallel "
				+ "sides and a circular or oval cross section" +
	               "\n\tSurface Area: " + calculateArea() +
	               "\n\tVolume: " + calculateVolume() + "\n";
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cylinder other = (Cylinder) obj;
        return Double.compare(this.radius, other.radius) == 0 &&
               Double.compare(this.height, other.height) == 0;
    }
	
	public boolean hasTopOrBottom(Circle circle) {
	    if (circle == null) {
	        return false; // covers case when circle doesn't exist
	    }
	    // Compare radius using Double.compare for accuracy
	    return Double.compare(this.radius, circle.getRadius()) == 0;
	}

}
