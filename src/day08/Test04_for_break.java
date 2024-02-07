package day08;

/*
	정수를 입력받아 그 숫자가 짝수인지 홀수인지 출력하세요.
	7번 반복하고 중간에 3이 나오면 종료하세요.
 */
import java.util.*;

import javax.swing.JOptionPane;
public class Test04_for_break {

	public static void main(String[] args) {
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력 메시지 준비
		/*
		loop:
		for(int i = 0 ; i < 7 ; i++) {
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();
			String result = "";
			
				if(num == 3) {
					System.out.println("**** 종료합니다 ****");
					break;
				} else if(num % 2 == 0) {
					result = "짝수";
					System.out.printf("입력한 숫자 [%d]는 %s입니다", num, result);
				} else {
					result = "홀수";
					System.out.printf("입력한 숫자 [%d]는 %s입니다", num, result);
				}	
			System.out.println();
			continue loop;
		}
		System.out.println("**** 종료합니다 ****");
		*/
		
		for(int i = 0 ; i < 7 ; i++) {
			String sno = JOptionPane.showInputDialog("**** 정수 입력 ****");
			int no = Integer.parseInt(sno);
			if(no == 3) {
				JOptionPane.showMessageDialog(null, "종료합니다.");
				break;
			}
			String result = "홀수";
			if(no % 2 == 0) {
				result = "짝수";
			}
			JOptionPane.showMessageDialog(null, "입력받은 숫자" + no + "는" + result + "입니다.");
			
			if(i == 6) {
				JOptionPane.showMessageDialog(null, "종료합니다.");
			}
		}
	}

}
