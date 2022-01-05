package Chapter7;

public class ShapeFactory {
	public SHAPE getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new CIRCLE();
		}
		if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new SQUARE();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RECTANGLE();
		}
		return null;
	}
}
