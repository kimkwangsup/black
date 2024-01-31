package day02;

/*
 	PI 를 기억할 변수를 float 형태로 만들고
 	이것을 이용해서 
 		반지름이 5
 		원의 넓이
 		둘레
 	를 계산해서 1. 출력하세요.
 	
 	bonus ]
 				2. 넓이와 둘레를 정수로 출력하세요.
 		
 */
public class Ex02 {
	public static void main(String[] args) {
	
		// PI를 float 형태로 만들기
		double pi1 = 3.14;
		
		float PI;
		// PI = (float) pi1; - 강제 형변환
		PI = 3.14F; // 리터널 형변환
	
		
		// 반지름이 r
		int r = 5;

		
		
		// 원의 둘레
		System.out.println("원의 둘레는 : " + 2 * PI * r);
		// 원의 넓이
		System.out.println("원의 넓이는 : " + r * r * PI);
		// 정수로
		System.out.println("원의 정수 둘레는 : " + (int)(2 * PI * r));
		System.out.println("원의 정수 넓이는 : " + (int)(r * r * PI));
		
		
		// System.out.println(3.14f * 10);
	}
}
