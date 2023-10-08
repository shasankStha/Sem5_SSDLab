package lab1;

public class Ellipse extends Rectangle{

	Ellipse() {
		super(1);
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*super.getArea();
	}

	@Override
	public String toString() {
		return "Ellipse [width=" + getWidth() + ", getHeight()=" + getHeight()
				+ "]\nSides= " + getSides() +"\nArea of Ellipse= " + getArea() + "\n";
	}
	
	

}
