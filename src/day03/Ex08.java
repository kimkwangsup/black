package day03;

/*
 	랜덤하게 두개의 숫자를 발생시켜서
 	작은 숫자부터 출력하는 프로그램을 작성하세요.
 */

public class Ex08 {
	public static void main(String[] args) {
		/*
		for(int i = 0 ; i < 2 ; i++) {
		int no = (int)(Math.random() * (999 - 1 + 1) + 1);
		
		
		
		
		System.out.println(no);
		
		
		
		}
		*/
		// 랜덤한 숫자만들기
		int no1 = (int)(Math.random() * (999 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (999 - 1 + 1) + 1);
		// 판별해서 결과만들고
		// 1. 삼항 조건처리 연산자
		// String result = (no1 < no2) ? no1 + ", " + no2 : no2 + ", " + no1;
		
		// if - else 명령으로 처리하는 방법
		/*
		int min = no1;
		int max = no2;
		
		if(no1 > no2) {  // 조건식이 거짓인 경우는 이 블럭은 실행하지 않는다.
			min = no2;
			max = no1;
		} else {		 // 조건식이 거짓인 경우는 이 부분은 위에서 이미 초기화 된 과정이므로 생략해도 무방하다. 
			min = no1;
			max = no2;
		}
		*/
		
		
		// 2-1 if - else
		/*
		String result = "";
		if(no1 > no2) {
			result = no2 + ", " + no1;
		} else {
			result = no1 + ", " + no2;
		}
		*/
		
		// 3. switch - case
		String result = "";
		char bool = no1 > no2 ? 'Y' : 'N';
		switch(bool) {
		case 'Y':
			result = no2 + ", " + no1;
			break;
		default:
			result = no1 + ", " + no2;
		}
			
		// String result = min + ", " + max;
		// 출력
		System.out.printf("랜덤하게 발생시킨 두 수 no1 : [ %2d ] , no2 : [ %2d ] 를 순서대로 나열하면"+ "\n", no1, no2);
		System.out.println(result + "입니다.");
		/*
		if(no1 >= no2) {
			System.out.println("랜덤한 두개의 숫자 : " + no2 + ", " + no1);

		} else {
			
			System.out.println("랜덤한 두개의 숫자 : " + no1 + ", " + no2);
		}
		*/
		
		
		} 
	

}
