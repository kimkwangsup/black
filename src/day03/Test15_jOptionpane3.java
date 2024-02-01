package day03;

import javax.swing.*;

public class Test15_jOptionpane3 {
	public static void main(String[] args) {
		String sno = JOptionPane.showInputDialog("***** 정수 입력 *****");
		int no = Integer.parseInt(sno);
		
		// 숫자를 짝수, 홀수인지를 판별
		// 다중 조건 처리 명령 switch - case 명령으로 처리
		
		
		String result = "";
		/*
		switch( no % 2 ) {
		case 0:
			result = "짝수";
			break;
		default:
			result = "홀수";
		}
		*/
		
		switch(no) {
		case 0:
			result = "0";
			break;
		default:
			switch(no % 2) {
			case 0:
				result = "짝수";
				break;
			default:
				result = "홀수";
			}
		}
		
		JOptionPane.showMessageDialog(null,  "입력 받은 숫자 [ " + no + " ]은(는) < " + result + " > 입니다.");
		
	}
}
