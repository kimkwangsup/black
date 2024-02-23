package day12;

public class Test02_ObjectClass {
/*
	Object 클래스
	==> 자바로 만들어진 클래스의 최상위 super 클래스의 역할을 하는 클래스
		따라서 자바로 만들어진 모든 클래스는 Object 클래스가 제공하는 
		모든 기능(멤버 : 변수, 함수)를 자동적으로 사용할 수 있게 된다.
		
		참고 ]
			이렇게 최상위 클래스를 만들어 놓은 이유
			==> 계층 추적을 원활히 하도록 하기 위해서
				각각의 클래스의 족보를 정확하게 따질 수 있도로 하기 위해서...
				
		참고 ]
			자바로 만든 모든 클래스는 반드시 상위 클래스를 가지고 있다.
			지금까지 우리가 만들었던 클래스들 역시 
			상위 클래스를 가지고 있다.
			만약 강제로 상위 클래스를 지정(extends ????)하지 않으면 
			묵시적으로 Object 클래스를 상속받아서 만들게 된다.
			
			
			**
			instanceof
			==> 특정 클래스를 new 시키면 주소가 만들어지는데
				이 주소가 어떤 클래스 소속의 주소인지를 알아내는 연산자.
				연산 결과는 true 또는 false 로 만들어진다.
				
				형식 ]
					주소 instanceof 클래스이름
					
				의미 ]
					주소가 가리키고 있는 곳의 내용이 
					지정 클래스 소속인지 물어보는 것.
					
				참고 ]
					소속이라는 개념은 is a 관계를 따지는 것이다.
					이 말은 상속관계를 따지는 것이 된다.
 */
	public Test02_ObjectClass() {
		Test02_B b1 = new Test02_B();
		System.out.println("b1 instanceof Test02_A : " + (b1 instanceof Test02_A));
		System.out.println("b1 instanceof Test02_B : " + (b1 instanceof Test02_B));
	
	}

	public static void main(String[] args) {
		new Test02_ObjectClass();
	}

}

class Test02_A{
	
}
class Test02_B extends Test02_A{
	
}