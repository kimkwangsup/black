package day07;

/*
	다섯자리 숫자를 입력받아서
	이 숫자가 회문수인지 아닌지 판별해서 출력하세요
	
	참고 ] 
		회문수
			12321 ==> 회문수
			12321 ==> 회문수 X
			
	문자열로 해결하고
	정수로 해결하고
	배열로도 해결하고
	
	힌트 1 ] 
		12345
	
		45 ==> 54
		앞자리 두 수를 떼어내서 ==> 12
		
	힌트 2 ]
		0 * 10 + 5			===> 5
			12345 % 10	===> 5
			12345 / 10	===> 1234
		5 * 10 + 4			===> 54
			1234 % 10 	===> 4
			1234 / 10 	===> 123
		54 * 10 + 3 		===> 543
			123 % 10 	===> 3
			123 / 10 	===> 13
		543 * 10 + 2 		===> 5432
			12 % 10 	===> 2
			12 / 10 	===> 1
		5432 * 10 + 1 		===> 54321
			1 % 10 		===> 1
			1 / 10 		===> 0
			
			
 */
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		// 입력 명령어
		Scanner sc = new Scanner(System.in);
		// 입력메세지 출력
		System.out.print("숫자 입력 : ");
		// 입력된숫자 기억
		
		// 문자열로 처리하는 방법.
//		String sno = sc.nextLine();
//		String msg = "";
		/*
		int lastIndex = sno.length() - 1;
		for(int i = 0 ; i < sno.length(); i++) {
			
			msg += sno.charAt(lastIndex - i);
			// 결과출력
			if(msg.equals(sno)) {
				System.out.println("입력 받은 숫자 " + sno + " 는 회문수 입니다.");
			}else {
				System.out.println("입력 받은 숫자 " + sno + " 는 회문수가 아닙니다.");
			}
		*/
	/*		
		System.out.println("*****" + msg);
		}
		int no = Integer.parseInt(sno);
		int result = Integer.parseInt(msg);
		
		if(no == result) {	System.out.println("입력 받은 숫자 " + no + " 는 회문수 입니다.");
			}else {
				System.out.println("입력 받은 숫자 " + result + " 는 회문수가 아닙니다.");
			}
	*/	
		/*
		boolean result = true;
		for(int i = 0 ; i < sno.length() ; i++) {
			char bef = sno.charAt(i);
			char aft = sno.charAt(4 - i);
			if(bef != aft) {
				// 다른 숫자가 있는경우
				result = false;
				break;
				
			}
		}
		// 결과 출력
		if(result) {
			System.out.println("입력 받은 숫자 " + sno + " 는 회문수 입니다.");
		}else {
			System.out.println("입력 받은 숫자 " + sno + " 는 회문수가 아닙니다.");
		}
		*/
		
		int num = sc.nextInt();
//		int tmp = num;
//		int soo = 0;
//		for(int i = 0 ; i< 5 ; i++) {
//			int rest = tmp % 10;
//			soo = soo * 10 + rest;
//			tmp = tmp / 10;
//		}
//		
//			if(soo == num) {
//			System.out.println("회문수");
//			}else {
//			System.out.println("회문수 아님");
//			}
		
		
		// 역순으로 만들어진 숫자 기억할 변수
		int result = 0;
		// 원본을 가공할 변수
		int tmp = num;
		for(int i = 0 ; i < 5 ; i++) {
			int namuji = tmp % 10;
			result = result * 10 + namuji;
			// 1의 자리를 잘라낸 숫자로 tmp를 다시 셋팅
			tmp = tmp / 10;
		}
//		System.out.println("num    : " + num);
//		System.out.println("result : " + result);
		String pandan = "회문수";
		if(num != result) {
			pandan = "회문수가 아니"; 
		}
		System.out.printf("입력받은 다섯자리 숫자 [%5d] 를 역순으로 만들면 [%5d] 이고 이 숫자는 %s다.", num, result, pandan);
		

			
		
	}
}
