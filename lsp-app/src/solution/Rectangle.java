package solution;

public class Rectangle implements Ishape{
    private int length;
    private int breadth;
    
    public Rectangle(int length, int breadth) {
    	this.length=length;
    	this.breadth=breadth;
    }
    public int getLenght() {
    	return length;
     }
    public int getBreadth() {
    	return breadth;
    }
	@Override
	public int calculateArea() {
		return length*breadth;
	}

}
