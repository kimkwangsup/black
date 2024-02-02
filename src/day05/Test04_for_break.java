package day05;

/*
	연산식을 입력하면
	연산식의 결과를 출력해주는 계산기를 제작하세요.
	단, 'Q' 가 입력되면 프로그램이 종료되게 하세요.
 */
import java.util.*;
public class Test04_for_break {
	public static void main(String[] args) {
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 반복해서 작업
		for(;;) { // for 명령의 (;;) 안에 카운터변수, 조건식을 기술하지 않으면 항상 true 로 처리한다.
 		// 입력메시지 출력
		System.out.print("계산식 입력 : ");
		// 연산식 기억
		String sik = sc.nextLine();
		// 프로그램 종료 조건
		if(sik.equals("Q")) {
			System.out.println("============================");
			System.out.println("*** 계산기를 종료합니다. ***");
			System.out.println("============================");
			// 종료 명령이 입력 됐으므로 반복문을 즉시 종료한다.
			break;
		}
		// 연산 기호 위치 알아내고
		int idx = 0;
		for(int i = 0 ; i < sik.length(); i++) {
			char ch = sik.charAt(i);
			if(ch < '0' || ch > '9') {
				// 연산기호를 찾은 경우이므로 
				// 위치값을 기억시키고
				// 반복문을 즉시 종료시킨다.
				idx = i;
				break;
			}
		}
		// 숫자 꺼내서 변환
		/*
		 	문자열 잘라내기
				substring(int beginIndex)
				: 시작 위치를 지정해서 시작위치에서 부터 문자열의 끝까지 추출		
				
				substring(int endIndex)
				: 시작위치에서 부터 종료 위치 직전까지 추출
		 */
		String sno1 = sik.substring(0, idx);
		String sno2 = sik.substring(idx + 1);
		char giho = sik.charAt(idx);
		// 정수 변환
		int no1 = Integer.parseInt(sno1);
		int no2 = Integer.parseInt(sno2);
		// 연산
		double result = 0.; // 자동형변환
			switch(giho) {
			case '+':
				result = no1 + no2;
				break;
			case '-':
				result = no1 - no2;
				break;
			case '*':
				result = no1 * no2;
				break;
			case '/':
				result = no1 / (double)no2; // 강제형변환
				break;
			case '%':
				result = no1 % no2;
				break;
			}
		// 출력
		System.out.printf("%d %c %d = %10.2f%n\n", no1, giho, no2, result);
			
		}
	}
}
