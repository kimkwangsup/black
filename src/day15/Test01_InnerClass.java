package day15;

/*
	내부클래스(Inner Class)
	==> 클래스 내부에 다시 클래스를 만들 수 있다.
	
	1. Top Level Inner Class
	 	==> 형식은 내부 클래스이지만 독립적으로 활동하는 클래스
	 	
	 	형식 ]
	 		
	 		static class 클래스이름 {
	 		}
			==> 내부에 만들면서 static 이 붙으면 Top Level Inner Class 가 된다.
	
		참고 ]
			클래스이름
				일반 클래스와 달리 내부 클래스의 이름은 
				
					바깥클래스이름.내부클래스이름
					
				의 형식을 취한다.
	
	***
	2. 젼역 Inner Class(Global Inner Class)
		==> 일반 클래스를 내부 클래스로 만든 것.
			(일반적으로 내부클래스라고 부르는것이 90%)
			
			형식 ]
				class 클래스이름 {
				}
				
			특징 ]
				1. 바깥 클래스의 모든 멤버는 자동적으로 내것처럼 사용할 수 있다.
				2. 반드시 바깥 클래스가 new 가 된 이후에 안쪽 전역 내부클래스를 new 시킬 수 있다.
					
					형식 ]
						바깥클래스주소.new 전역내부클래스();
				
				3. 바깥 클래스는 안쪽 전역 내부클래스의 멤버를 사용할 수 없고
				 	사용하려면 new 시켜서 주소로 접근해서 사용해야 한다.
			
		주로 바깥 클래스와 연관된 기능을 가진 클래스를 만들고 싶을 때
		많이 사용하는 기법
	
	3. 지역 Inner Class(지역 내부 클래스)
		==> 내부 클래스를 만드는 위치가 바깥 클래스의 함수 안에서 만들게 된다.
		
			class Test {
				
				class GlobInnerClass { // 전역 내부클래스
				}
				
				int a;
				void abc() {
					class Inner {
						// 지역 내부클래스
					}
				}
				
				void xyz() {
					abc();
					System.out.println(a);
				}
			}
			
		특징 ]
			1. 전역 내부 클래스와 유사하게 바깥 클래스의 멤버를 사용할 수 있다.
			2. 이 클래스는 다른 곳에서는 new 시킬 수 없다.
				오직 그 함수 내에서만 new 시킬 수 있다.
				
	***
	4. 무명 내부 클래스
	==> 이름 그대로 이름이 없는 내부 클래스
		
		우리가 프로그램을 만들다 보면 클래스의 기능 수정을 위해서
		오버라이딩을 해야하는 경우가 발생한다.
		(또는 어쩔 수 없이 오버라이딩 해야 하는 경우도 있다.
			<== 인터페이스나 추상클래스를 상속 받아서 사용할 경우...)
			
		이때 원칙적인 규칙은 
		상속 받은 클래스를 별도로 만들고 그 클래스를 new 시켜서 사용하는 것이 원칙이다
		
		이때 간단한 오버라이딩을 해야 하는 경우
		그 기능 하나 때문에 클래스를 별도로 제작해야 하는 불편함이 있다.
		
		결론적으로
		무명 내부 클래스란
		이런 경우를 위해서 만들어진 클래스로
		클래스를 new 시키는 순간 필요한 기능을 오버라이딩 해서 사용하는 방법
		즉, 사용자가 클래스 이름을 정의하지 않아도 된다. 라는 의미에서
		무명 내부 클래스라 부른다.
			
		형식 ]
			new 클래스이름() {
			}
	
 */

public class Test01_InnerClass {
	public int no;
	public Test01_InnerClass() {
		Test01_InnerClass.TopLev a = new Test01_InnerClass.TopLev();
		a.abc();
//		Test01_InnerClass.TopLev.abc();
		
		// 전역내부클래스
		GlobClass g1 = this.new GlobClass(); // 이클립스가 객체가 되어야 GlobClass 를 new 시킬 수 있다.
		g1.ch = 'Z';
		g1.xyz();
		 
	}

	public static void main(String[] args) {
		new Test01_InnerClass();
	}
	
	static class TopLev {
		public void abc() {
			System.out.println("top level inner class . abc()");
		}
	}
	
	public void xy() {
		int num = 100;
	}
	
	public class GlobClass{
		char ch = 'A';
		public void xyz() {
			no = 10;
		}
	}
}

class OuterClass {
}
