package lab1;

public class Rectangle extends Shape{


	private double width, height;
	
	public Rectangle(int sides) {
		super(sides);
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]\nSides= " + getSides() + "\nArea of Rectangle= "
				+ getArea() + "\n";
	}


}
