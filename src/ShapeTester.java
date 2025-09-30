import java.util.Scanner;
public class ShapeTester {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Shape shape1 = new Shape(3,4,5);
		System.out.println(shape1);
		Shape shape2 = new Shape(3,4);
		System.out.println(shape2);
		System.out.println("Volume = " + shape1.calculateVolume());
		System.out.println("Perimter = " + shape2.calculatePerimeter());
		//System.out.println(shape1.calculatePerimeter());
		System.out.println(shape2.calculateVolume());

	}
}
