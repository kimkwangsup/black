package day16;

/*
	사용자 예외 클래스 만들기
	==> 예외클래스는 예외의 발생 원인을 알려주는 역할을 담당한다.
		그런데 앞에서 강제 예외 던지기는 자바가 미리 정의 해놓은 예외가 아니므로
		예외의 원인을 파악하기 힘들다.
		
		이런 경우는 예외의 원인을 파악하기가 힘들다.
		
		따라서 사용자가 예외정보를 만들어주는 클래스를 따로 만들어서
		처리해주면 된다.
		
		방법 ]
			1. Exception 클래스를 상속 받는 클래스를 만든다.
			2. toString() 오버라이드 해서
				예외의 원인을 문자열로 반환하도록 해준다.
				
 */
import java.util.*;
public class Test03_Exception {
	Scanner sc;
	public Test03_Exception() {
		sc = new Scanner(System.in);
		
		try {
			while(true) {
				// 입력메세지 출력
				System.out.print("나이 입력 : ");
				// 입력받아 기억하고
				int age = sc.nextInt();
				// 입력값 처리하고
				// 나이가 음수가 입력이 되면 그런 나이는 없으므로 
				// 강제로 우리가 만든 예외클래스로 예외를 발생시킨다.
				if(age < 0) {
					throw new AgeException();
				} 
				
				// 출력하고
				System.out.println("입력 나이 : " + age);
			}
		} catch(Exception e) {
			System.out.println(e);
			System.out.println();
			e.printStackTrace();
		} finally {
			try {
				sc.close();
			} catch(Exception e) {}
		}
		System.out.println("*****프로그램 종료!*****");
	}

	public static void main(String[] args) {
		new Test03_Exception();
		
	}
}

class AgeException extends Exception {
	@Override
	public String toString() {
		return "Input Age Error : 나이가 음수로 입력되었습니다.";
	}
}