package lab1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(4);
		rect.setHeight(12);
		rect.setWidth(10);
		System.out.println(rect.toString());
		
		Circle cir = new Circle();
		cir.setRadius(6);
		System.out.println(cir.toString());
		
		Ellipse e = new Ellipse();
		e.setHeight(6);
		e.setWidth(8);
		System.out.println(e.toString());
	}

}
