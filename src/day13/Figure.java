package day13;

/*
	이 클래스는 
	이 클래스를 상속 받아서 만들어지는 도형 클래스들의
	상위 클래스이다.
	면적 데이터를 처리하는 내용이 도형마다 달라지기 때문에
	이 클래스 내에서 함수의 내용을 정의하지 않고
	이 클래스를 상속 받아서 만들어지는 각 도형 클래스 들에서
	함수의 내용을 정의해서 써야한다.ㅣ
 */
public abstract class Figure {
	public abstract void setArea();
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "이 클래스는 Figure 클래스!";
	} 
	
	
	
}
