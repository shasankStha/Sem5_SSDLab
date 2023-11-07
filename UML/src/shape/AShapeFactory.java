package shape;

public abstract class AShapeFactory implements IShape{
	
	private String className;
	
	public AShapeFactory(String className) {
		
	}
	
	public IShape makeShape() {
		return null;
		
	}
	
	public String toString() {
		return "";
		
	}

}
