package day03;

public class Test12_randomif {
	public static void main(String[] args) {
		// 숫자가 짝수인지 홀수인지 판별하세요.
		int no = (int)(Math.random() * (200 - 50 + 1) + 50);
		
		/*
		  String result = "";
	
		if(no % 2 == 0) {
			result = "짝수";
		}
		if(no % 2 == 1) {
			result = "홀수";
		}
		*/
		String result = "홀수";
		// 홀수가 아닌 경우만 처리
		if(no % 2 == 0) {
			result = "짝수"; 
			// 홀수인 경우는 조건식이 거짓이므로 이 부분은 실행하지 않는다.
		}
		// 출력
		System.out.printf("랜덤한 숫자 %3d은(는) %2s 입니다.", no, result);
	}
}
