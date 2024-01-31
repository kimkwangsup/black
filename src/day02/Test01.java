
package day02;

public class Test01 {
	public static void main(String[] args) {
		String 클래스 = " 클래스 :";
		int 만들기 = 10;
		// char 성공 = '>';		
		
		System.out.println(클래스+만들기+성공());
		
		/*
		 	주의 사항 :
		 		식별자로 한글을 사용해도 되지만
		 		인코딩에 문제가 발생할 수 있으므로
		 		한글 식별자는 피하는 것이 좋다.
		 */
	}
	
	public static String 성공() {
		return " > !!!";
	}
}
