package day20;

public class Nemo {
	private int width, height, area;
	public Nemo() {}
	public Nemo(int width, int height) {
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
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {
		area = width * height;
	}
	@Override
	public String toString() {
		return "가로 : " + width + "\n\t세로 : " + height + "\n넓이 : " + area;
	}
	
}
