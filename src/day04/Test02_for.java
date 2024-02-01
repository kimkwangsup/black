package day04;

public class Test02_for {

	public static void main(String[] args) {
		// 0 부터 9 까지 숫자를 출력해보자.
		/*
		 	for 반복명령
		 	형식 ]
		 		for(카운터변수 선언 및 초기화; 조건식; 증감식) {
		 			실행명령...
		 		}
		 */
		
		for(int i = 0;  i < 10; i++) {
			System.out.println(i + " - " + (i + 1));
		}
		
//		System.out.println(i); 
		// for 명령문의 카운터변수 i 는 for 명령의 블럭내에서 만들어지는 변수고
		// 따라서 반복문의 실행(블럭)이 끝나는 순간 사라지는 변수다.
	}

}
