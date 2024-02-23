package day15;

/*
	예외 정보 출력하기
	==> 다음 이유에 의해서 예외의 정보를 얻을 수 있다.
		1. 예외정보클래스 변수를 출력하면 정보를 출력할 수 있다.
			==> 예외의 원인을 파악할 수 있게 해준다.
			
		2. 변수.printStackTrace()를 이용하는 방법
 			==> 예외의 정보 + 예외가 발생된 위치와 그 경로를 출력할 수 있다.
 			
----------------------------------------------------------------------------------------- 		
	예외가 발생하면 개발자가 그것을 수정해서
	정상적으로 동작하도록 만드는 행위라고 정의 했었다.
	하지만 정상적으로 동작하도록 만드는 행위는
	매우 어려운 일이고
	그런 경우도 흔하진 않다.
	
	다만, 예외 처리를 하는 실제 이유는
	예외의 정보를 알아서 
	사용자에게 왜 프로그램이 문제가 생겼는지 알려주고 
	그 프로그램을 정상적으로 종료하도록 하는 것에 목적이 있다고 할 수 있다.
	
	
 */
import java.util.*;
public class Test04_Exception {
	Scanner sc;
	public Test04_Exception() {
		sc = new Scanner(System.in);
		
		try {
			System.out.print("정수입력 : ");
			int no = sc.nextInt(); // 예외 발생할 수 있는 명령 1
			int result = 10 / no;
			System.out.println(10 + " / " + no + " = " + result);
			sc.close();
//			throw new Exception();
		} catch(NumberFormatException e) {
			// printStackTrace()를 이용하는 방법
			e.printStackTrace();
		} catch(ArithmeticException e) {
			// e 를 출력하는 방법
			System.out.println(e);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04_Exception();
	}

}
