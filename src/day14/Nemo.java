package day14;

public class Nemo implements Figure {
	private int width, height;
	private double area;
	
	public Nemo() {
	}
	public Nemo(int width, int height) { // 생성자 오버로딩
		this.width = width;
		this.height = height;
	}

	@Override
	public void setArea() { // int ==> double 로 자동 형변환
		area = width * height;
	}
	
	public void setArea(double area) { // setArea() 오버로딩
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
		return "■■■ Nemo : \n\t가로 : " + width + ", 세로 : " + height + ", 넓이 : " + area;
	}

}
