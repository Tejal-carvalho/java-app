package voilation.test;

import voilation.Rectangle;
import voilation.Square;

public class LspTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(200, 100);
		shouldNotChangeWidthIfHeightIsModified(rect);
		Square square = new Square(100);
		shouldNotChangeWidthIfHeightIsModified(square);

	}

	private static void shouldNotChangeWidthIfHeightIsModified(Rectangle rect) {
		// TODO Auto-generated method stub
	    int beforeWidth = rect.getWidth();
		rect.setHeight(rect.getHeight() + 100);
		int afterWidth = rect.getWidth();
		System.out.println(beforeWidth == afterWidth);
		System.out.println("Area:"+rect.calculateArea());
	}

}
