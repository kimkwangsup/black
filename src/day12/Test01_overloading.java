package day12;

public class Test01_overloading {
/*
 	함수의 오버로딩(Overloading, 함수의 중첩)
 	==> 원칙적으로 같은 클래스 내에서는 함수의 이름은 모두 달라야 한다.
 		같은 이름의 함수가 있으면 에러가 발생한다.
 	
 		이러다보니 가독성에 있어서 문제가 발생할 수 있다.
 		
 		함수의 가독성이란?
 		함수의 이름만 봐도 그 함수가 어떤 기능을 가지고 있는 함수인지를
 		알 수 있어야 한다.
 		함수의 이름을 다르게 만들다 보면 가독성에서 문제가 발생할 수 있다.
 		
 		이런 문제점을 해결하기 위한 방법으로 제시된 문법이다.
 		
 		
 		오버로딩이란?
 		같은 클래스 내에서 같은 이름의 함수를 만들 수 있다.
 		단, 다음 조건은 무조건 충족해 줘야 한다.
 			
 			조건 ]
 				1. 함수의 이름이 같아야 한다.
 				2. 매개변수리스트의 형태가 달라야 한다.
 					==> 매개변수의 갯수, 순서, 형태 중 적어도 하나는 달라야 한다.
 				3. 반환값과는 전혀 상관이 없다.
 				
 			예 ]
 				void abc(){
 				}
 				void abc(int no){}  -------------- O
 				int abc(){}  --------------------- X ( <== 반환값과는 상관 없다.)
 				
 				void abc(double no){}  ----------- O
 				void abc(int no, int num) -------- O
 				int abc(int no, float num){} ----- O
 				int abc(float no, int num){} ----- O
 				
 		
------------------------------------------------------------------------------------------ 		
 	*****
 	함수의 오버라이딩(Overriding, 함수의 재정의)
 	==> 상속 관계에 있는 하위 클래스에서
 		상위 클래스가 가진 함수의 기능을 수정하는 행위
 		
 		방법 ]
 			0. 상속받아야한다.
 			1. 상위 클래스가 가진 함수의 원형과 동일한 형태로 만들어야 한다.
 			   	함수의 원형(Prototype)
 				==> 반환값 + 함수이름 + 매개변수리스트
 			2. 접근지정자는 같거나 넓은 방향으로
 			3. 예외처리는 같거나 좁은 방향으로 
 			
 		참고 ]
 			접근지정자 : 클래스, 함수, 변수를 사용할 수 있는 권한을 지정하는 것
 				
 				public 		: 모든 곳에서 사용 가능
 				protected	: 같은 패키지 내거나, 상속받은 클래스 내에서는 사용 가능
 				생략		: 같은 패키지 내, 그리고 같은 클래스에서만 사용 가능
 				private		: 같은 클래스 내에서만 사용 가능
 	
 			***
 			클래스의접근지정자는 public 과 생략만 사용 가능하다.
 */
	public Test01_overloading() {
		// Test01_Sub2  객체 만들고 
		Test01_Sub2 t1 = new Test01_Sub2();
		System.out.println("Test01_Sub2.getNum() : " + t1.getNum());
		
	}
	
	public static void main(String[] args) {
		new Test01_overloading();
	}
}

class Test01_Sub{
	int no;
	public int getNum() {
		return 0;
	}
}

// Test01_Sub2를 Test01_Sub 을 상속받아서 만들고
// getNum()를 1 ~ 20 사이의 정수로 랜덤하게 반환해주는 기능으로 고쳐서 정의하세요
class Test01_Sub2 extends Test01_Sub{
	// getNum() Override
	@Override
	public int getNum() {
		int result = (int)(Math.random() * 20 + 1);
		return result;
	}
}


