package day13;

public abstract class Miwansung extends Figure {
	/*
		이 클래스의 경우는
		Figure 클래스가 가지고 있는 추상함수 중 
		setArea() 를 재정의(Overriding) 하지 않았으므로
		추상함수를 1개 가지고 있는 클래스이고
		이렇게 추상함수가 1개 이상이 존재하면
		반드시 추상클래스로 만들어야 한다.
		
		이렇게 추상클래스는 미완성인 기능이 있기 때문에
		new 시켜서 객체로 만들 수 없다.
	 */
	private int width, height;
	private double area;

	public Miwansung() {
	}
	
	//	public abstract void setArea(); 
	// 이 함수를 재정의 하지 않았으므로 생략된 상태다.
	// 눈에 보이지는 않지만 추상함수인채로 감춰져 있는 상태다.
	
	@Override
	public double getArea() {
		return area;
	}

}
