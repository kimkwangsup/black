package day11;

public class Test01_Field {
	int no;
	
	{ // 초기화 블럭
		no = 10;
	}
/*
	멤버 변수의 초기화
	==> 멤버 변수는 Heap 영역에 생기므로 자동 초기화가 된다.
			boolean ==> false
			char	==> 코드값 0
			정수	==> 0
			실수	==>	0.0;
			문자열	==> null
			
		하지만 가끔은 변수에 특정한 값으로 지정할 필요가 생긴다.
		
		1. 명시적 초기화
		==> 변수를 선언하면서 데이터를 입력하는 것을 의미한다.
			가장 먼저 실행되는 방법
			
				예 ]
					class Test {
						int no = 100;	
					}
					
		2. 초기화 블럭을 이용한 초기화
		==> 이 방법은 인스턴스 변수에 대해서만 가능한 ㅂ아법으로
			두번째 실행되는 방법이다.
			
				형식 ]
					{
						이 안에서 데이터를 변수에 입력
					}
				
				예 ]
					class Test {
						int no;
						...
						
						{
							no = 10;
						}
					}
		
		3. static 블럭을 이용한 초기화
		==> static 변수에 한해서 적용되는 초기화 방법
			두번째 실행되는 방법
			
			형식 ]
				
				static {
					데이터 입력...
				}
			
			예 ]
				class Test {
					static int no;
					String name;
					
					...
					
					static {
						no = 1000;
					}
				}
			
		4. 생성자를 이용한 초기화
		==> 가장 마지막에 실행되는 방법
		
			예 ]
				class Test {
					int no;
					
					public Test() {
						no = 20000;
					}
					
					public Test(int num) {
						no = num;
					}
				}
				
------------------------------------------------------------------------------------------
	상속
	==> 이미 만들어진 클래스의 기낭을 그대로 부여받아서 
		(변수와 함수의 기능을 그대로 복사받아서)
		새로운 클래스를 만드는 방법
		
		이런 기법이 나타나게 된 이유는 
		소프트우어의 개발 속도를 빠르게 하기 위한 한가지 방법이다.
		
		즉, 상속은 객체지향에서 매우 중요한 역할을 하는 개념이다.
		
		객체지향 언어는 부품(클래스) 단위로 프로그램을 만든 후 
		그 부품을 조립해서 원하는 결과를 얻어내는 언어이다.
		
		그런데 어디선가 부품(클래스)를 구했는데
		그 기능이 사용자 마음에 꼭 맞지 않을 수 있다.
		그럴 때 처음부터 다시 만들게 되면 개발 속도가 저하될 것이다.
		이 문제를 해결하기 위해서 만든 방법이 상속이다.
		
		상속은 자신이 만들고자 하는 부품(클래스)과 가장 유사한 부품을 가지고 와서
			일단 그 기능을 모두 복사한 후 
			1. 없는 기능은 덧붙여 넣고
			2. 있는 기능 중 바꿀 내용은 바꿔서 사용하자.
			
		상속을 받는 형식 ]
			
			[접근지정자] [속성] class 클래스이름 extends 상속해주는 클래스 이름 {
				// 이 내부에는 상속해주는 클래스의 내용이 모두 들어와 있게 된다.
			}
		
	참고 ]
		상속은 오직 단일 상속만 가능하다.
		( ==> 여러 클래스로 부터 동시에 상속받을 수 없다.)
		오직 한 개의 클래스에서 상속받을 수 있다.
		
		예 ]
			
			class NewClass extends Class1, Class2 {
			
			}	=================================> X
			
			class NewClass extends Class1 {
			
			}	=================================> O
	
	용어 ]
		상속 해준 클래스	==> (부모 클래스, )상위 클래스, super Class
		상속 받은 클래스	==> (자식 클래스, )하위 클래스, sub Class
	
		is a	==> 상속 관계에 있는 클래스를 부르는 용어
		
			class Father {
			}
			
			class Son extends Father {
			}
			
			==> Son is a Father 가 성립한다.
			
		has a	==> 어떤 클래스안에 다른 클래스를 멤버로 가지고 있는 상태
		
---------------------------------------------------------------------------------------

	상속 관계에 있는 경우 생성자의 역할
		
		결론적으로 
			하위 클래스가 생성되는 순간
			상위 클래스가 자동 생성된다.
			==> 생성되는 순간 상위 클래스의 생성자도 자동 실행된다.
			
		상위 클래스의 생성자 함수는 자동으로 호출이 되는 개념이다.
		자동 호출 되는 경우에는 무조건 기본 생성자만 이용하게 된다.
		
	***	
	참고 ]
		super()
		==> 상위 클래스의 특별한 생성자를 강제로 호출하는 기능을 가진 명령
		
		특징 ]
			1. 반드시 생성자 함수 내에서만 호출할 수 있다.
			2. 반드시 생성자 내의 첫 명령으로만 사용할 수 있다.
		
 */

	public Test01_Field() {
		Amoo a = new Amoo();
		System.out.println(a.toString());
		
		
	}

	public static void main(String[] args) {
		new Test01_Field();
	}

}
