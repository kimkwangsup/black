package day07;

/*
 	문자열을 역순으로 다시 만들어보자.
 */

public class Test06_stringReverse {
	public static void main(String[] args) {
		String str = "Hello Jennie!";
		// 결과 변수
		String reverse = "";
		int len = str.length();
		int lastIndex = len - 1;
		for(int i = 0 ; i < len ; i++) {
			char ch = str.charAt(lastIndex - i);
			
			// 꺼내온 문자를 reverse 변수에 덧붙여넣는다.
			reverse = reverse + ch;
		}
		
		System.out.println("origin  : " + str);
		System.out.println("reverse : " + reverse);
	}
}
