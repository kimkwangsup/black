package day16;

import java.io.*;
import java.net.*;

/*
	예외 전이하기
	==> 함수는 프로그램의 가장 작은 단위로
		한가지 작업을 하기 위해서 만들어진 것이다.
		따라서 함수 안에서 작업하다가 예외가 발생하면
		그 함수는 더이상 실행할 필요가 없는 경우가 많다.
		그래서 함수는 예외를 전이하도록 해 놓은 경우가 많다.
		
		형식 ]
			[접근지정자] [속성] 반환값타입 함수이름(매개변수리스트) 
									throws 예외클래스1, 예외클래스2, ... {
			}
			
		의미 ]
			지정한 예외가 발생하면
			이 함수는 더이상 실행해도 의미가 없으므로
			실행을 중지시킨다.
		
		*****
		예외가 전이된 함수는
		반드시 그 함수를 호출한 곳에서 예외처리를 해줘야 한다.
		(try{}catch{} 로 처리해줘야 한다.)
		
		참고 ]
			비록 어떤 함수가 예외를 전이하는 함수라도
			예외처리를 하지 않아도 되는 경우가 있다.
			
			전이하는 예외가 RuntimeException의 하위인 경우에는
			예외처리를 해도 그만, 안해도 그만이다.
			(주로 java.lang 패키지 소속의 클래스에 있는 함수들이
				이런 함수들이 많다.)
				
			하지만 될 수 있으면 해주는 것이 좋다.
			
		참고 ]
			Overriding 규칙
				0. 상속받아야한다.
				1. 함수의 원형을 유지한다.
				2. 접근지정자는 같거나 넓은 방향으로
				3. 예외처리는 같거나 좁은 방향으로
					==> 예외를 전이하는 함수를 오버라이딩 하는 경우
						전이하는 예외클래스는 같은 글래스이거나 하위 클래스여야 한다.
						
					예 ]
						
						void abc() throws IllegalArgumentException;
						
						==> 
						@Override
						void abc() throws SocketException {} ---> O
						또는
						void abc() throws ConnectionException {} ---> O
				
		
 */
public class Test01_Exception {

	public Test01_Exception() {
		Abc a = new Efg();
		try{
			a.abc();
		// 이 함수는 예외를전이하는 함수이므로
		// 호출해서 사용하는곳에서 반드시 예외처리를 해줘야 한다.
		} catch(SocketException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		/*
			위 세개중 한번만 기술하면 된다.
		 */
		
		/*
			예외의 기술 순서는
			범위가 좁은 클래스부터 기술해준다
		 */
	}

	public static void main(String[] args) {
		new Test01_Exception();
	}

}
class Abc {
	public void abc() throws SocketException {
		System.out.println("Socket Error!");
	}
}

class Efg extends Abc{
	@Override
	public void abc() throws ConnectException {
		System.out.println("접속 에러 발생!");
	}
}
class Hig extends Abc{
	/*
	@Override
	public void abc() throws IOException {
		// 전이하는 예외가 범위가 넓은 클래스는 오버라이딩 할 때 사용할 수 없다.
		 
	}
	*/
}