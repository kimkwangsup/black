package day04;

public class Test06_for_String {
	public static void main(String[] args) {
		String str = "Black Pink!";
		/*
		 	문자열 관련 함수들...
		 	
		 		length()  : 문자열의 길이를 알려주는 함수.
		 		equals()  : 해당 문자열의 데이터를 비교하는 함수.
		 		charAt()  : 문자열 중 특정 위치의 문자를 알려주는 함수.
		 		indexOf() :	문자열에 포함된 특정 문자 또는 문자열의 시작 위치를 알려준다.
		 		
		 		 참고 ]
		 		 	- 자바에서는 위치값이 0 부터 시작한다.
		 */
	
		// str의 길이
		
		System.out.println("str 길이 : " + str.length());
		
		// P의 위치값 출력
		System.out.println("'P' 의 위치값 : " + str.indexOf('P'));
		
		// 위치값 6의 문자 꺼내기
		System.out.println("\"6\"번째 문자 추출 : " + str.charAt(6));
		
		/* 
		 	참고 ]
				문자열은 "" 기호로 표현한다.
				이때 문자열 내에 "를 표현하고 싶은 경우는
				" 를 문자로 입력을 해줘야 한다.
				이때 사용되는 문자가 escape 문자(\) 이다.
				\" 를 입력하면 문자열이 " 가 포함될 수 있다.
				
				\t   : 탭
				\r\n : 엔터키
				\n   : 줄바꿈
		*/
		
		// 모든 문자를 반복해서 하나씩 꺼내서 출력
		
		/*
		  	"hello"
		  	 12345 - length
		  	 01234 - index
		  	 
		 */
		int len = str.length();
		for(int i = 0; i < len; i++) {
			System.out.println((i + 1) + " 번째 문자 : " + str.charAt(i));
		}
	}
}
