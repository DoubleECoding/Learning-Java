
public class Triangle extends GeometricObject {

	
	// three double data fields with default values
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	//no args default constructor
	public Triangle() {
	}
	
	// Constructor with 3 double parameters
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Constructor that takes in color and filled parameters
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}

////////////////////////////////////////////////////
	//getter and setters for each side
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	/////////////////////////////////////////////
	
	//gets the area of a triangle with a formula using 3 Sides
	public double getArea() {
		double Area = 0;
		double s = 0;
		s += side1;
		s += side2;
		s += side3;
		s = s/2;
		
		Area = Math.sqrt(s * (s-side1)*(s-side2)*(s-side3));
		return Area;
	}
	
	// finds the perimeter of the shape with the provided data
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	// returns a detailed description of the triangle's sides
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
