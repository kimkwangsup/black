package tmp;

/*
	랜덤하게 10개의 문자를 배열에 담고
	정렬하세요.
	단, 중복된 문자는 없게하세요.
 */
import java.util.*;
import javax.swing.*;
public class Test07_binarySearch_JOptionpane {
	public static void main(String[] args) {
		// 배열 준비
		char ch[] = new char[10];

//		// 배열에 데이터 채우고
//		loop:
//		for(int i = 0 ; i < 10 ; i++) {
//			char c = (char)(Math.random()*('z' - 'a'+ 1 )+ 'a' );
//			for(int j = 0 ; j < i ; j++) { 
//				char before = ch[j];
//				if(c == before) {
//					
//					i--;
//					continue loop;
//				}
//			}
//			ch[i] = c;
//			System.out.printf("[%s]",c);
//		}
//		System.out.println();
//		// 배열 정렬하고
//		for(int i = 0 ; i < ch.length - 1  ; i++) {
//			for(int j = i + 1 ; j < ch.length ; j++) {
//				if(ch[i] > ch[j]) {
//					// 임시 기억 변수만들기
//					char tmp = ch[i];
//					ch[i] = ch[j];
//					ch[j] = tmp;
//				}
//			}
//		}
//		for(int i = 0 ; i < ch.length ; i++) {
//			System.out.printf("[%s]",ch[i]);
//		}
		
		// 배열 길이만큼 반복해서 채우고
		l1:
		for(int i = 0 ; i < ch.length ; i++) {
			// 문자 만들고
			char c = (char)(Math.random()*('z' - 'a'+ 1 )+ 'a' );
			// 이전 문자와 중복검사 하고
			for(int j = 0 ; j < i ; j++) {
				char tmp = ch[j];
				if(c == tmp) {
					--i;
					continue l1;
				}
			}
			// 이 행을 실행하는 경우는 중복되지 않은 문자가 만들어진 경우
			// 배열에 데이터 채우고
			ch[i] = c;
		}
		
		// 출력
		
		for(char c : ch) {
			System.out.print(c + " ,");
			
		}
		System.out.println();
		
		// 배열 정렬하고
		
		for(int i = 0 ; i < ch.length - 1 ; i++) {
			for(int j = i + 1; j < ch.length ; j++) {
				char origin = ch[i];
				char after = ch[j];
				if(origin > after) {
					char tmp = ch[i];
					ch[i] = ch[j];
					ch[j] = tmp;
					
				}
			}
		}
		for(char c : ch) {
			System.out.print(c + " ,");
			
		}
		System.out.println();
		
		// 찾을 문자 입력받고 
		
		// 배열 데이터 보여주고
		String msg = "|";
		for(char c : ch) {
			msg = msg + c + " | ";
		}
		String str = JOptionPane.showInputDialog(msg + "\n찾을 문자를 입력하세요!");
		// 문자열에서 첫번째 문자를 꺼내서 기억하고
		char munja = str.charAt(0);
		// 입력받아 문자열로 기억하고
		
		// 위치 찾고
		// 위치 변수 만들고
		int start = 0;
		int end = ch.length - 1;
		// 결과 위치값 변수
		int result = -1;
		for(; ;) {
			int mid = (start + end) / 2;
			
			char c = ch[mid];
			if(munja > c) {
				// 꺼낸 문자가 작은 경우
				start = mid + 1;
			}else if(munja < c) {
				// 꺼내온 문자가 큰 경우
				end = mid - 1;
			}else {
				// 문자 찾은 경우
				result = mid;
				// 문자를 찾았으므로 작업(반복)을 종료한다.
				break;
			}
		}
		// 결과 출력하기
		JOptionPane.showMessageDialog(null, "찾을 문자 [" + munja + "] 의 위치값은 [" + result + "] 입니다.");
		
	}
}
