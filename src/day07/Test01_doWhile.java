package day07;

/*
	반복문 중 후조건 처리 명령이다.
	
	조건이 최악의 경우라도 
	최소 한번은 실행문은 실행하는 반복문이다.
	
	형식 ]
		do {
			실행내용...
		} while(조건식);
 */

public class Test01_doWhile {

	public static void main(String[] args) {
		// 2단 구구단을 출력하세요.
		int dan = 2;
		int gop = 1;
		
		do {
			System.out.printf("%d x %d = %2d\n", dan, gop, dan * gop++);
		} while(false);
	}

}
