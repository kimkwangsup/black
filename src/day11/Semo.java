package day11;

public class Semo extends Figure {
	public int width, height;
	public double area;
	public Semo() {
	}
	
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		
	}
	public void setArea() {
		area = width * height * 0.5;
	}
	
	@Override
	public String toString() {
		String result = "밑변이 [" + width + "] 이고 높이가 [" + height + "] 이고 면적이 [" + area + "] 인 삼각형"; 
		return result;
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
	
}
