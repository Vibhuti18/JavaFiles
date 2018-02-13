package esg.itp.shape;

public class Square implements Polygon {

	private float side;
	private float area = 0.0f;
	private float perimeter = 0.0f;

	public Square(float s) {
		// TODO Auto-generated constructor stub
		side = s;
	}

	public void calcArea() {
		area = side * side;
	}

	public void calcPeri() {
		perimeter = 4 * side;
	}

	public void display()

	{
		System.out.println("SQUARE area: " + area + "perimeter: " + perimeter);
	}

}
