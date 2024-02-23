package day17;

import java.util.Random;

public class Test06_Random {
/*
 	java.util.Random
 	==> 
 		난수를 반환해주는 클래스
 		
 		지금까지 사용했던
 			Math.random()
 		보다 좀 더 다양한 형태의 난수를 반환해주는 장점이 있다.
 		
 		참고 ]
 			seed
 			==> 컴퓨터에서 난수 발생은 실행하는 순간 만드는 것이 아니고
 				이미 컴퓨터 내부에 난수 테이블이 존재하고
 				그 테이블에서 순서대로 데이터를 꺼내서 반환해주는 기능이다.
 				이때 그 테이블이 여러개 존재하고
 				그 테이블의 위치를 알려주는 것이
 				seed 변수에 알려주는 것이다.
 				
 		함수 ]
 			nextInt() : 정수를 랜덤하게 반환해주는 함수
 			nextInt(int bound) : bound 숫자 사이의 랜덤한 정수를 반환해준다.
 ------------------------------------------------------------------------------------
 	Arrays 클래스
 	==> 100% static 함수로만 구성된 클래스
 		배열을 처리할 때 필요한 기능들로 구성된 클래스
 		
 		toString()
 		sort()
 */

	public Test06_Random() {
		Random rand = new Random();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(rand.nextInt());
		}
		System.out.println();
		
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println(rand.nextInt(45) + 1);
		}
		System.out.println("**************************************");
		rand = new Random(100);
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(rand.nextInt(100));
		}
	}

	public static void main(String[] args) {
		new Test06_Random();
	}

}
