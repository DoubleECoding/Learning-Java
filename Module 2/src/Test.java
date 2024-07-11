
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inData = new Scanner(System.in);
		
		// Creates a generic Triangle
		Triangle firstTri = new Triangle();
		
		//Asks for 3 values and stores them within the Triangle Objects side variables.
		System.out.println("Type in the lengths of 3 sides of a triangle.");
		firstTri.setSide1(inData.nextDouble());
		firstTri.setSide2(inData.nextDouble());
		firstTri.setSide3(inData.nextDouble());
		
		//Asks for a String value for color and sets it with a GeometricObject method.
		System.out.println("What color is the Triangle?");
		firstTri.setColor(inData.next());
		
		//Asks for a Boolean value for filled and sets it with a GeometricObject method.
		System.out.println("Is your shape filled? True or False");
		firstTri.setFilled(inData.nextBoolean());
		
		//Prints out Data
		System.out.println(firstTri.toString());
		System.out.println("Area: " + firstTri.getArea());
		System.out.println("Perimeter: " + firstTri.getPerimeter());
		System.out.println("Color: " + firstTri.getColor() + "\n" + "Filled: " + firstTri.isFilled());
	}

}
