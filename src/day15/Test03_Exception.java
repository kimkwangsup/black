package day15;

/*
	정수를 반복해서 입력받아서 출력하고
	정수 이외의 문자가 입력이 되면 프로그램이 종료되도록 하자.
 */
import java.util.*;
public class Test03_Exception {
	// 입력도구 변수 선언
	Scanner sc;
	public Test03_Exception() {
		// 입력 도구 만들기
		sc = new Scanner(System.in);
		try {
			while(true) {
				// 메세지 출력
				System.out.print("정수입력 : ");
				// 입력 받고
				int no = sc.nextInt();			
				// 입력받은 내용 출력
				System.out.println("입력된 정수 : " + no);
			}
		} catch(Exception e) {
		// 예외 발생 시 처리 내용
			System.out.println("잘못된 숫자가 입력되었습니다.");
		} finally {
		// 예외 발생 여부와 상관없이 처리되어야 할 내용 처리
			try {
				sc.close();
			} catch(Exception e) {}
			System.out.println("프로그램을 종료합니다.");
		}
	}
	public static void main(String[] args) {
		new Test03_Exception();
	}

}
