package day04;

/*
 	정수 연산식을 입력하면 
 	계산해서 출력해주는 프로그램을 작성하세요.
 	
 	예 ]
 		100 - 10
 		==> 90
 		
 		방법 ]
 			1. 연산 기호의 위치값을 알아낸다.
 			2. 연산기호 이전까지의 숫자를 꺼낸다.
 			3. 연산기호 이후의 숫자를 꺼낸다.
 			4. 계산한다.
 */
import java.util.*;
public class Test07_for_calc {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력 메시지 출력
		System.out.print("정수 연산식 입력 : ");
		// 입력된 내용 기억
		String sik = sc.nextLine();
		
		// 연산기호 위치값을 알아낸다.
		// 문자열 길이
		int len = sik.length();
		// 연산기호 위치값 변수
		int idx = 0;
		for(int i = 0; i < len ; i++) {
			char ch = sik.charAt(i);
			if(ch < '0' || ch > '9') {
				// 이 경우는 숫자형태의 문자가 아니므로
				// 연산 기호에 해당할 것.
				// 따라서 이 문자의 위치값을 기억해둔다.
				idx = i;
				// 연산 기호를 찾았으므로 반복을 종료한다.
				break;
			}
		}
		
		// 첫번째 숫자 꺼내기
		String sno1 = "";
		for(int i = 0; i < idx ; i++) {
			sno1 = sno1 + sik.charAt(i);
		}
		
		// 두번째 숫자 꺼내기
		String sno2 = "";
		for(int i = idx + 1; i < len; i++) {
			sno2 = sno2 + sik.charAt(i);
		}
		
		/*
		// 출력
		System.out.println("연산식   : " + sik);
		System.out.println("sno1     : " + sno1);
		System.out.println("sno2     : " + sno2);
		System.out.println("연산기호 : " + sik.charAt(idx));
		*/
		
		// 연산 조건처리
		// 문자열로 된 숫자를 정수로 변환
		int no1 = Integer.parseInt(sno1);
		int no2 = Integer.parseInt(sno2);
		
		char giho = sik.charAt(idx);
		
		double result = 0;
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
			result = no1 / (double)no2; 
			// 정수끼리의 연산의 결과는 정수가 만들어진다.
			break;
		case '%':
			result = no1 % no2;
			break;
		}
		
		// 결과 출력
		System.out.printf("%5d %c %5d = %10.2f", no1, giho, no2, result);
	}
}
