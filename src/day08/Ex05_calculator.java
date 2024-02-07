package day08;

import java.util.*;
public class Ex05_calculator {
/*
 	연산식을 입력하면 계산해서 결과를 출력해주는 프로그램을 작성하세요.
 	단, 연산식의 내용을 배열로 변환해서 처리하세요.
 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] buho = {'+' , '-' , '*' , '/' , '%'};
		System.out.print("계산식 입력 : ");
		String str = sc.nextLine();
		char[] sik = str.toCharArray();
		int idx = 0;
		for(int i = 0; i < str.length() ; i++) {
			char ch = sik[i];
			if(ch < '0' || ch > '9') {
				idx = i;
				break;
			}
		}
		
	}
}
