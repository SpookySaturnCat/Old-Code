
public class Rectangle {

	private int width;
	private int height;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(int width, int height) {
		
		setWidth(width);
		setHeight(height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getPerimeter() {
		return 2 * (this.width + this.height);
	}
	
	public int getArea() {
		return this.width * this.height;
	}
}
