package prob6;

public class Rectangle extends Shape implements Resizable {

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}
	
}
