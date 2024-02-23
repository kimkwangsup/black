package day09;

public class Nemo {
	int garo;
	// 둘레 기억할 변수
	int sero;
	// 넓이 기억할 변수
	int area;
	
	public Nemo() {}
	
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}

	public void setArea() {
		area = garo * sero;
	}
}
