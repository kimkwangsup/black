package day04;

/*
 	알파벳을 입력받아서 
 	입력된 문자가 소문자이면 대문자로
 	대문자이면 소문자로
 	변환해서 출력하세요.
 	
 	대문자를 소문자로 변환하는 방법은
 		(char)(입력한 문자 + ('a' - 'A'))
 */


import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력 메시지 출력
		System.out.print("변환할 문자 입력 : ");
		// 입력 내용 기억
		String str = sc.nextLine();
		/*
		 	문자열과 문자는 전혀 별개의 타입이다.
		 	"a" != 'a'
		 	
		 	문자의 코드값을 산술 연산을 하려면
		 	문자열로는 할 수 없다.
		 */
		// 문자 추출하고
		char ch = str.charAt(0);
		// 결과 변수 만들기
		String munja = "";
		char result = ' ';
		// 변환 작업 
		if(ch > 'Z') {
			// 소문자인 경우
			munja = "소문자";
			result = (char)(ch - ('a' - 'A'));
		} else {
			// 대문자인 경우
			munja = "대문자";
			result = (char)(ch + ('a' - 'A'));
		}
		
		// 출력
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("* 입력 받은 문자 : " + ch);
		System.out.println("* 입력 문자 종류 : " + munja);
		System.out.println("* 변환 후 문자   : " + result);
		System.out.println("------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		String str;
		
		 
		System.out.print("알파벳을 입력하세요 : ");
		str = sc.nextLine();
		
		int alp, bet;
		
		alp = Integer.parseInt(str); 
		String result = "";
		
		if(alp > 'a') {
			result = "alp - ('a' - 'A')";
		} else {
			result = "alp + ('a' - 'A')";
		}
		
		// char res = (char)(result);
		
		System.out.println("변환된 알파벳은 : " + result);
		*/
		
	}
}
