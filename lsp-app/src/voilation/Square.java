package voilation;

public class Square extends Rectangle{
	public Square(int side) {
		super(side,side);
	}
	
	
	public void setHeight(int height) {
		this.height = this.width=height;
	}
	public void setWidth(int width) {
		this.height = this.width=height;
	}

}
