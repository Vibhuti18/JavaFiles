package esg.itp.shape;

public class Rectangle implements Polygon {

	private float length, breadth;
	private float area = 0.0f;
	private float perimeter = 0.0f;

	public Rectangle(float l, float b) {
		// TODO Auto-generated constructor stub
		length = l;
		breadth = b;

	}

	public void calcArea() {
		area = length * breadth;
	}

	public void calcPeri() {
		perimeter = 2 * (length + breadth);
	}

	public void display()

	{
		System.out.println("RECTANGLE area: " + area + "perimeter: "
				+ perimeter);
	}

}
