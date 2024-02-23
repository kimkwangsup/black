package day11;

public class Circle extends Figure {
	public int rad;
	public double arround;
	public Circle() {
	}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	public void setArround() {
		arround = 2 * 3.14 * rad;
	}
	public void setArea() {
		area = rad * rad * 3.14;
	}
	@Override
	public String toString() {
		String result = "반지름이 [ " + rad + " ] 인 원의 둘레는 [ " + arround + " ] 넓이는 [ " + area + " ] 입니다."; 
		return result;
	}

}
