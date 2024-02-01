package day03;

import java.util.*;
public class Test09_Scanner2 {
	public static void main(String[] args) {
		/*
		 	삼항 조건 연산자
		 	형식 ]
		 		(조건식) ? 참일때 반환값 : 거짓일때 반환값; 	
		 */
		
		// 정수를 입력받아서 그 수가 짝수인지 홀수인지를 출력하세요.
		
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력 메시지 출력
		System.out.print("정수 입력 : ");
		// 입력받은 숫자 기억
		int num = sc.nextInt();
		// 홀수 또는 짝수 판별
		// 결과변수 만들고
		String result = "";

		// 판별
		//result = (num % 2 == 0) ? "짝수" : "홀수" ;
		 	if (num % 2 == 0) {
		 		result = "짝수";
		 	} else {
		 		result = "홀수";
		 	}
		 		// 출력
		System.out.println("입력받은 정수 " + num + "는 " + result + "입니다.");
		
	}

}
