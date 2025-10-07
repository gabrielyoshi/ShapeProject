import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ShapeTester {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Shape shape1 = new Shape(3,4,5);
		//System.out.println(shape1);
		//Shape shape2 = new Shape(3,4);
		//System.out.println(shape2);
		
		// Object Testing
		Rectangle rectangle1 = new Rectangle(3,4);
		Rectangle rectangle2 = new Rectangle(4,3);
		Rectangle rectangle3 = new Rectangle(5,6);
		Square square1 = new Square(2);
		Square square2 = new Square(4);
		Square square3 = new Square(4);
		Circle circle1 = new Circle(3);
		Circle circle2 = new Circle(5);
		Cylinder cylinder1 = new Cylinder(3, 5);
		Cylinder cylinder2 = new Cylinder(4, 6);
		Cylinder cylinder3 = new Cylinder(6, 4);
		Cube cube1 = new Cube(2);
		Cube cube2 = new Cube(3);
		
		
		System.out.println("Area of rectangle1 = " + rectangle1.calculateArea());
		System.out.println("Perimeter of square1 = " + square1.calculatePerimeter());
		//System.out.println(shape1.calculatePerimeter());
		System.out.println("Area of circle1 = " + circle1.calculateArea());
		
		List<Shape> shapeList = new ArrayList<>();
		
		shapeList.add(rectangle1);
		shapeList.add(rectangle2);
		shapeList.add(rectangle3);
		shapeList.add(square1);
		shapeList.add(square2);
		shapeList.add(square3);
		shapeList.add(circle1);
		shapeList.add(circle2);
		shapeList.add(cylinder1);
		shapeList.add(cylinder2);
		shapeList.add(cylinder3);
		shapeList.add(cube1);
		shapeList.add(cube2);
		
		for (Shape s : shapeList) {
			System.out.println(s.toString());
		}
		
		//Equality testing
		Rectangle r1 = new Rectangle(3,4);
		Rectangle r2 = new Rectangle(4,3);
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		Square s1 = new Square(2);
		Square s2 = new Square(2);
		Cube cu1 = new Cube(3);
        Cube cu2 = new Cube(3);
        Cube cu3 = new Cube(4);
        Cylinder cyl1 = new Cylinder(3, 5);
        Cylinder cyl2 = new Cylinder(3, 5);
        Cylinder cyl3 = new Cylinder(4, 6);

		System.out.println("\nEquality tests:");
		System.out.println("r1.equals(r2): " + r1.equals(r2));
		System.out.println("c1.equals(c2): " + c1.equals(c2));
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		System.out.println("cube1.equals(cube2): " + cu1.equals(cu2)); // true — same side
        System.out.println("cube1.equals(cube3): " + cu1.equals(cu3)); // false
        System.out.println("cyl1.equals(cyl2): " + cyl1.equals(cyl2));     // true — same radius/height
        System.out.println("cyl1.equals(cyl3): " + cyl1.equals(cyl3));     // false — different dimensions
        
        System.out.println("cyl1.hasTopOrBottom(circle1): " + cyl1.hasTopOrBottom(circle1)); // true
        System.out.println("cyl1.hasTopOrBottom(circle2): " + cyl1.hasTopOrBottom(circle2)); // false
        System.out.println("cyl2.hasTopOrBottom(circle1): " + cyl2.hasTopOrBottom(circle1)); // false
		
        Square sq1 = new Square(3);
        Square sq2 = new Square(4);
        Cube cu4 = new Cube(5);

        System.out.println("cube1.hasSameSide(sq1): " + cu1.hasSameSide(sq1)); // true
        System.out.println("cube1.hasSameSide(sq2): " + cu1.hasSameSide(sq2)); // false
        System.out.println("cube2.hasSameSide(sq1): " + cu4.hasSameSide(sq1)); // false
		

	}
}

/* OUTPUT FROM TEST DRIVER
 * 
 * Area of rectangle1 = 12.0
Perimeter of square1 = 8.0
Area of circle1 = 28.274333882308138
Rectangle	Length: 3	Width: 4	Height: 0
Rectangle: A quadrilateral with four right angles
	Area: 12.0
	Perimeter: 14.0

Rectangle	Length: 4	Width: 3	Height: 0
Rectangle: A quadrilateral with four right angles
	Area: 12.0
	Perimeter: 14.0

Rectangle	Length: 5	Width: 6	Height: 0
Rectangle: A quadrilateral with four right angles
	Area: 30.0
	Perimeter: 22.0

Square		Length: 2	Width: 2	Height: 0
Square: A quadrilateral with four equal sides and four equal angles
	Area: 4.0
	Perimeter: 8.0

Square		Length: 4	Width: 4	Height: 0
Square: A quadrilateral with four equal sides and four equal angles
	Area: 16.0
	Perimeter: 16.0

Square		Length: 4	Width: 4	Height: 0
Square: A quadrilateral with four equal sides and four equal angles
	Area: 16.0
	Perimeter: 16.0

Circle		Radius: 3.0	Diameter: 6.0
Circle: A closed plane curve every point of which is equidistant from a fixed point within the curve
	Area: 28.274333882308138
	Perimeter: 18.84955592153876

Circle		Radius: 5.0	Diameter: 10.0
Circle: A closed plane curve every point of which is equidistant from a fixed point within the curve
	Area: 78.53981633974483
	Perimeter: 31.41592653589793

Cylinder	Length: 3	Width: 3	Height: 5
Cylinder: A solid geometric figure with straight parallel sides and a circular or oval cross section
	Surface Area: 150.79644737231007
	Volume: 141.3716694115407

Cylinder	Length: 4	Width: 4	Height: 6
Cylinder: A solid geometric figure with straight parallel sides and a circular or oval cross section
	Surface Area: 251.32741228718345
	Volume: 301.59289474462014

Cylinder	Length: 6	Width: 6	Height: 4
Cylinder: A solid geometric figure with straight parallel sides and a circular or oval cross section
	Surface Area: 376.99111843077515
	Volume: 452.3893421169302

Cube		Length: 2	Width: 2	Height: 2
Cube: A three-dimensional solid object bounded by six square faces with three meeting at each vertex
	Area: 24.0
	Volume: 8.0

Cube		Length: 3	Width: 3	Height: 3
Cube: A three-dimensional solid object bounded by six square faces with three meeting at each vertex
	Area: 54.0
	Volume: 27.0


Equality tests:
r1.equals(r2): true
c1.equals(c2): true
s1.equals(s2): true
cube1.equals(cube2): true
cube1.equals(cube3): false
cyl1.equals(cyl2): true
cyl1.equals(cyl3): false
cyl1.hasTopOrBottom(circle1): true
cyl1.hasTopOrBottom(circle2): false
cyl2.hasTopOrBottom(circle1): true
cube1.hasSameSide(sq1): true
cube1.hasSameSide(sq2): false
cube2.hasSameSide(sq1): false

*/
