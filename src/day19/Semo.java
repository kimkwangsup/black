package day19;

public class Semo {
	private int width, height;
	private double area;
	
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		
		setArea();
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		area = width * height * 0.5;
	}
	@Override
	public String toString() {
		return "넓이 : " + area + ", 가로 : " + width + ", 세로 : " + height + "\n";
	}
	
}
