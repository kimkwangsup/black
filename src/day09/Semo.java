package day09;

public class Semo {
	// 가로 기억할 변수
	int garo;
	// 세로 기억할 변수
	int sero;
	// 넓이 기억할 변수
	double area;
	
	// 기본 생성자
	public Semo() {}
	// 밑변과 높이를 입력받아서 객체를 만드는 생성자
	public Semo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
//		setArea();
		calcArea(); // ==> area = garo * sero * 0.5;
	}

//	public void setArea() {
//		area = garo * sero / 2.0 ;
//	}
	public void calcArea() {
		area = garo * sero * 0.5;
	}
}
