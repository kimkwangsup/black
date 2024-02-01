package day04;

public class Test04_for_break {
	int num = 100; // 전역변수
	public static void main(String[] args) {
		// 10 ~ 50 까지의 숫자를 랜덤하게 만들어서
		// 29 가 나오는 순간 반복을 종료하세요.
		// 반복 횟수도 출력하세요.
		int i = 0; // main 함수 내에서만 사용할 수 있는 지역변수
		for(;; i++) { 
			
			// for 명령을 선언할 때 () 부분의 내용을 생략할 수 있는데
			// 이 경우는 조건식이 항상 "true" 로 처리된다.

//			i += 1;
			// 랜덤한 숫자 만들기
			int no = (int)(Math.random() * (50 - 10 + 1) + 10);
			// 출력
			System.out.println("랜덤한 숫자 : " + no);
			// 짝수인지 판별하고 출력하고
			

			if(no == 29) {
				System.out.println("프로그램을 종료합니다.");
				break; // 의미 ]
					   // 현재 실행중인 반복문 또는 switch 문을 즉시 종료하세요.
			} 
			
		}
		System.out.println((i + 1) + "회 반복");
		System.out.println("이미 반복문이 종료돼서 프로그램 종료!!!");
		
	}
}
