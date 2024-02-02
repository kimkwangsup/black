package day05;

/*
 	2 부터 시작해서 소수 10개를 출력하세요.
 */
public class Test05_for_continue {
/*
 	label 이 붙은 for 명령
 	:	
 		break, continue 에 적용되는 문법으로
 		위 두 명령이 적용될 반복문을 지정해 주고 제어하는 문법이다.
 		
 		형식 ]
 			
 			레이블이름1:
 			for(;;) {
 				레이블이름2:
 				for(;;) {
 					if() {
 						continue 레이블이름
 					}
 				}
 				for(;;) {
 					if() {
 						break 레이블이름2; ------------- X
 					}
 				}
 			}
 			
 		주의 ]
 			상위의 반복문에만 적용시킬 수 있다.
 */
	public static void main(String[] args) {
		int cnt = 0;
		
		loop:
		for(int i = 2 ; cnt < 10 ; i++) {
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0) {
					// 이 수는 소수가 아니므로 다음 수를 검사해야 한다.
					continue loop;
				} 
			}
			// 이 행을 실행하는 경우는 나누어 떨어지는 수가 없는 경우.
			cnt = cnt + 1;
			System.out.print(i + ", ");
			// System.out.printf("[%2d]", i);
		}
	}
}
