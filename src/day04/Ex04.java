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
public class Ex04 {
	public static void main(String[] args) {
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력 메시지 출력
		System.out.print("년도 입력 : ");
		// 입력 내용 기억
		int year = sc.nextInt();
		// 외부장치 연결 해제
		sc.close();
		// 결과 변수
		String result = "평년";
		// 판별
		if(year % 400 == 0) {
			result = "윤년";
		}else if(year % 100 == 0) {
			result = "평년";
		}else if(year % 4 == 0) {
			result = "윤년";
		}else {
			result = "평년";
		}
		// 결과 출력		
		// System.out.println("입력받은 년도는 " + result + "입니다.");
		System.out.printf("입력받은 년도는 %4d년 이고\n" + "이 해는 %2s입니다.",year, result);
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.print("년도를 입력하세요 : ");
		year = sc.nextInt();
		
		String result = "";
		
		if(year % 400 == 0) {
			result = "윤년";
		} else if(year % 100 == 0) {
			result = "평년";
		} else if(year % 4 == 0) {
			result = "윤년";
		} else {
			result = "평년";
		}
		System.out.println("입력받은 년도는 " + result + "입니다.");
		 */		
	}
		
	
}
