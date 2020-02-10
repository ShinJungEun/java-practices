package prob6;

public class RectTriangle extends Shape{
	private int width;
	private int height;
	
	public RectTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return (width * height) / 2;
	}

	public double getPerimeter() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2))
				+ width + height;
	}
}
