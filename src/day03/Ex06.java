package day03;

import java.util.*;

/* 		소수 이하 네자리 이상되는 숫자를 입력받아서(Scanner 사용)
 		소수 이하 셋째자리에서 반올림한 숫자를 만들어서 출력해주는
 		프로그램을 작성하세요.
				힌트 ] 
					+ 0.005 해주고
 					셋째자리 이하는 지워야한다.
					숫자 * 100 ==> 정수로 만든다.
					그 정수를 / 100.
*/
public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소수 이하 네자리 이상되는 숫자 입력 : ");
		
		double num = sc.nextDouble();
		
		
		// 	키보드로 입력한 내용은 버퍼메모리에 기억이 되고
		// 	꺼내오는 순간 메모리에서 지워진다.
		 	
		 	
			double no, no1;
			no = num + 0.005;
	
			no1 =(int)(no * 100.0) / 100.0;
		
		
		
		// System.out.printf("소수 셋째자리에서 반올림한 숫자는 %4.2f 입니다.", num);
		
		System.out.println("소수자리 셋째자리에서 반올림한 숫자는 : " + no1);
		
		
		
		
	}
}
