package day12;

public class Test04_APIClass {
/*
	String
	==> 문자열을 관리하는 클래스
		
		주의 ]
			String 의 단점
			==> String 클래스는 내용이 변경이 되면
				변경된 내용을 메모리에 별도로 다시 저장한다.
				따라서 메모리의 낭비가 생길 수 있다.
				
				결론적으로 변화가 심한 문자열은 String 클래스를 이용하면 안된다.
				이런 경우는 StringBuffer 클래스를 이용해야 한다.
				
				그래도 문자열 데이터는 일상적으로 많이 사용하므로
				클래스들 중 유일하게 new 시키지 않아도 사용할 수 있도록 해놓았다.
				
				예 ]
					String str = "abc";
					String msg = new String("abc");
					
					이 때 
					str == msg 비교하면
					false 가 반환이 된다.
					
				String 클래스는 클래스들 중 유일하게 + 기호를 결합 연산자로 사용할 수 있다.

-------------------------------------------------------------------------------------------------------------
		
	StringBuffer
	==> String 클래스와 동일하게 문자열을 관리하는 클래스이다.
			
		차이점 ]
			String 클래스는 문자열이 변화되면 별도로 다시 저장하는데
			StringBuffer 의 경우는 기존 데이터를 수정해서 보관한다.
			따라서 메모리 관리 측면에서 StringBuffer 가 유리하다.
			
		사용법 1]
			StringBuffer buff = new StringBuffer();
		사용법 2]
			StringBuffer buff = new StringBuffer("문자열데이터");
			
		참고 ]
			문자열 처리가 모두 끝난 시점에서는
			String 형태로 다시 변환해줘야 한다.
			
			방법 ]
				buff.toString()
				
		참고 ]
			실무에서 StringBuffer 사용방법
				
				1. String 이 편하므로 먼저 String 타입으로 변수를 만든다.
					
					String str = "jennie";
					
				2. 문자열의 변화가 필요한 시점에 StringBuffer 로 변환해서
				
					StringBuffer buff = new StringBuffer(str);
					
				3. 문자열 결합을 해준다.
				
					buff.append(", lisa");
					buff.append(", rose");
					buff.append(", jisoo");
					
				4. 문자열 처리가 끝나면 다시 String 형태로 변환해준다.
				
					str = buff.toString();
					
-----------------------------------------------------------------------------------------------
	Math
	==> 주로 수학적인 기능을 처리하는 함수로 구성된 클라스
		멤버들이 모두 static 이므로 별도로 new 시키지 않아도 사용 할 수 있다.
		그래고 아예 new 시키지 못하도록 막아놓은 클래스....
		<== 기본 생성자의 접근 지정자를 private 로 정의해 놓아서
			다른 클래스에서는 new 시키지 못하도록 조치해놓은 클래스이다.
			
-----------------------------------------------------------------------------------------------
	Wrapper Class
	==> 참조형 타입의 변수에는 기본형 타입의 데이터를 사용하지 못하는 문제가 생길 수 있다.
		이런 문제를 해결하기 위해서 만든 클래스들을 Wrapper Class 라고 부른다.
		즉, int 형태의 데이터는 참조형이 아니므로 객체가 아니고
		이렇다 보니 객체 형태로 사용해야 될 필요가 있을 경우 문제가 생길 수 있다.
		이런 문제를 해결하기 위해서 만들어진 클래스들이다.
		
		자바는 Object 클래스를 중심으로 계층 구조화해서 
		클래스를 만들도록 해 놓은 객체 지향 언어이다.
		그런데 기본 데이터 타입의 데이터의 경우는 클래스가 아니기 때문에 계층 구조에서 
		제외가 되는 문제가 생긴다.
		이 문제를 해결하기 위해서 만들어 놓은 클래스들이다.
		
		참고 ]
		
			Boxing
			==> Value Type 을 주소타입으로 변환하는 것
				(기본형 변수를 참조형 변수로 변환하는 작업)
			UnBoxing
			==> 주소 타입을 다시 Value Type 으로 변환하는 것
				(참조형 변수를 기본형 변수로 변환하는 작업)
				
			래퍼 클래스는 Boxing 과 UnBoxing 을 해주기 위한 클래스.
			
		참고 ]
			그런데 위 내용은 몰라도 됩니다.
			자바 버전 1.4부터 Boxing, UnBoxing 이 자동으로 처리되기 때문이다.
			
			예 ] 
				Integer no = 10; // 자동 박싱
				int num = no;	 // 자동 언박싱 
				
			다만 유틸리티적인 함수들은 아직도 사용가능하므로
			완전히 버려진 클래스들은 아니다.
			
			예 ]
				Integer.parseInt()
	
 */
	
	public Test04_APIClass() {
		/*
		 	SELECT
		 		empno 사원번호,
		 		ename 사원이름, 
		 		hiredate 입사일
		 	From
		 		emp
		 	WHERE
		 		hiredate LIKE '%01/__'
		 	;
		 */
		
		StringBuffer buff = new StringBuffer();
		buff.append("SELECT ");
		buff.append("	empno 사원번호, ");
		buff.append("	ename 사원이름, ");
		buff.append("	hiredate 입사일 ");
		buff.append("FROM ");
		buff.append("	emp ");
		buff.append("WHERE ");
		buff.append("	hiredate LIKE '%01/__'");
		
		System.out.println(buff.toString());
		
		// Boxing & UnBoxing
		Integer no = 10;	// 자동 박싱
		int num = no;		// 자동 언박싱
		
		float soo = Float.parseFloat("3.14");
		
	}

	public static void main(String[] args) {
		new Test04_APIClass();
	}

}
