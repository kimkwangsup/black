package day13;

public abstract class Moyang {
	public abstract void setArea();
	public abstract double getArea();
	
	
	public static Moyang getInstance() {
		M1 m = new M1();
		return m; // 반환하는 순간 Moyang 타입으로 자동 형변환이 된다.
	}
}

class M1 extends Moyang{

	@Override
	public void setArea() {
	}

	@Override
	public double getArea() {
		return 0;
	}
	
}
