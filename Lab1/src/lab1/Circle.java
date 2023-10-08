package lab1;

public class Circle extends Shape{
	
	public Circle() {
		super(1);
	}

	private double radius;


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (Math.PI*radius*radius);
	}

	@Override
	public String toString() {
		return "Circle [radius= " + radius + "]\nSides= " + getSides() + "\nArea of circle= " + getArea() + "\n";
	}

	
}
