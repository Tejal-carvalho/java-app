package solution;

public class LspSolutionTest {
	public static void main(String args[]) {
		Rectangle rect=new Rectangle(5,7);
		Square square=new Square(10);
		printInfo(rect);
		printInfo(square);
	}

	private static void printInfo(Ishape obj) {
		System.out.println("Area:"+obj.calculateArea());
		
	}
}
	
  
