package lab1;

public abstract class Shape {
	
	private  int sides;
	
	public Shape(int sides) {
		this.sides = sides;
	}
	
	
	
	public int getSides() {
		return sides;
	}
	

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	
	
	abstract public double getArea();
	
}
