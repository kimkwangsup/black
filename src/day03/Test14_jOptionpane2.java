package day03;

import javax.swing.*;
public class Test14_jOptionpane2 {
	public static void main(String[] args) {
		String sno = JOptionPane.showInputDialog("***** 정수 입력 *****");
		int no = Integer.parseInt(sno);
		
		// 숫자를 짝수, 홀수, 0 인지를 판별
		// 다중 조건 처리 명령 if - else if - else 명령을 사용
		String result = "";
		
		/*
		if(no == 0) {
			String result = "0";
		} else if(no % 2 == 1) {
			String result = "홀수";
		} else {
			String result = "짝수";
		}
		
		블럭({}) 안에서 만든 변수는 블럭({})이 끝나는 순간 사라지는 변수이다.
		따라서 블럭({}) 내에서만 사용할 수 있다.
		*/
		if(no == 0) {
			result = "0";
		} else if(no % 2 == 1) {
			result = "홀수";
		} else {
			result = "짝수";
		}
		
		JOptionPane.showMessageDialog(null,  "입력 받은 숫자 [ " + no + " ]은(는) < " + result + " > 입니다.");
		
	}
}
