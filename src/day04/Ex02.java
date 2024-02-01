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
		// System.out.println('a' - 'A');
		int str = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 : ");
		str = sc.nextInt();
		
		int bet = ('a' - 'A');
		
		int result = 0;
		
	
		
		if(str > 97) {
			result = str;
		} else {
			result = str - bet;
		}
			
		// char som = Integer.parseChar(alp);
		
		
		System.out.println("입력한 알파벳 : " + str);
		System.out.println("변환된 알파벳 : " + bet);
		
	}
}
