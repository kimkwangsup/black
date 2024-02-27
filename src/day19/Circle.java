package day19;

public class Circle implements Comparable {
	private int rad;
	private double arround, area;
	
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	/*
		new Circle(); ==> 반지름이 준비 안된경우 원 만드는 방법
		
		new Circle(10); ==> 반지름이 준비된 경우 원 만드는 방법
	 */
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround() {
		arround = 2 * rad * 3.14;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = rad * rad * 3.14;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "반지름 : " + rad + "\n둘레 : " + arround + "\n넓이 : " + area + "\n\n";
	}
	@Override
	public boolean equals(Object o) {
		// Set 계열은 중복데이터를 허용하지 않는다.
		// 중복검사는 compare() 함수를 이용해서 처리한다.
		
		Circle other = (Circle) o;
		
		return (rad == other.getRad());
		
	}
	
	@Override
	public int compareTo(Object o) {
		Circle other = (Circle) o;
		
		return rad - other.getRad();
	}
	
	@Override
	public int hashCode() {
		int code = ((Integer) rad).hashCode();
		return code;
	}
}