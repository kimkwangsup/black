package day14;

public class Semo implements Figure {
// public class Semo extends Object implements Figure {
	private int width, height;
	private double area;
	public Semo() {
	}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		area = width * height * 0.5;
	}

	public void setArea(double area) { // Overloading
		this.area = area;
	}
	
	@Override
	public double getArea() {
		return area;
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
	@Override
	public String toString() {
		return "▲▲▲ Semo : \n\t밑변 : " + width + ", 높이 : " + height + ", 넓이 : " + area;
	}

}
