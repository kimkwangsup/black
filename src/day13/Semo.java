package day13;

public class Semo extends Figure {
	private int width, height;
	private double area;
	
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

	public Semo() {} // 기본 생성자
	
	public Semo(int width, int height) {
		// 밑변과 높이를 입력해주면서 세모 객체를 만들어 주는
		// 생성자 함수		
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		area = width * height * 0.5;
	}

	@Override
	public double getArea() {
		return area;
	}
	@Override
	public String toString() {
		return "*** 세모 ***\n\t밑변 : " + width + 
				", 높이 : " + height + 
				", 면적 : " + area;
	}
	
}
