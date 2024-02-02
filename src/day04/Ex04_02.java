package day04;

/*
 	1000 ~ 3000 사이의 숫자를 입력 받아서 
 	이 숫자를 년도로 하는 해가 
 	윤년인지 평년인지 판별해주는 프로그램을 작성하세요.
 	
 	참고 ] 
 		윤년은 4로 나누어 떨어지고 
 		100으로 나누어 떨어지지 않고
 		400으로 나누어 떨어지는 해를 윤년이라고 한다.
 */
import java.util.*;
public class Ex04_02 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력 메시지 출력
		System.out.print("년도 입력 : ");
		// 입력 내용 기억
		int year = sc.nextInt();
		// 결과 변수 준비
		String result = "";
		// 삼항 조건 처리 연산자로 판별
		/*
		result = (year % 400 == 0) ?
					// 조건식이 참인 경우
					"윤년"
				:
					// 조건식이 거짓인 경우
					(year % 100 == 0) ?
							// 100으로 나누어 떨어지는 경우
							"평년"
							:
							// 100으로 떨어지지 않는 경우
								(year % 4 == 0) ?
											"윤년"
										: 
											"평년"
		;
		
		*/
		
		result = ((year % 400 == 0) | (year % 4 == 0)) & (year % 100 != 0) ?
						"윤년" : "평년";
				
		// 출력
		
		System.out.printf("입력받은 년도는 [ %3d ]년 이고\n" + "이 해는 [ %2s ]입니다.",year, result);
	}
		
	
}
