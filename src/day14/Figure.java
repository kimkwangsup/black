package day14;

public interface Figure {
	String origin = "Figure";
	// ==> origin 변수는 자동적으로 public static final 변수가 되므로 초기화까지 해줘야하고
	//		이 변수는 final 변수이므로 데이터를 수정할 수 없는 변수가 된다.
	
	void setArea();
	// ==> 이 함수는 자동적으로 public abstract 가 생략된 추상함수가 된다.
	double getArea();
}
