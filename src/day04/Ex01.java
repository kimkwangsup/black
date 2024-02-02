package day04;

/*
 	랜덤하게 0 ~ 100 까지의 숫자를 세개를 발생시켜서 
 	1. 큰 숫자만 출력해주는 프로그램을 작성하세요.
 	
 	보너스 ]
 	2. 숫자를 순서대로 나열해서 출력하세요.
 		
 */
public class Ex01 {
	static int num;
	static double soo;
	static boolean nonri;
	static char munja;
	
	public static void main(String[] args) {
		// 랜덤한 숫자 세개 만들기
		int no1 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (100 - 1 + 1) + 1);
		
		// 제일 큰 수 판별하기
		// 제일 큰수 기억할 변수 준비.
		int max = -1;
		/*
		 	변수는 생성과 동시에 초기화 해주는 것이 좋다.
		 	나중에 만든 변수를 사용 할 때
		 	변수가 어떤 데이터도 기억하고 있지 않으면(선언만 해놓은 상태)
		 	에러가 발생한다.
		 */
		
		// 판별
		// 1. 삼항 조건처리 연산자
		
		max = (no1 > no2) ? 
				(
						(no1 > no3) ? no1 : no3
				)
				:	// 참인 경우 
				(
						(no2 > no3) ? no2 : no3
				)	// 거짓인 경우
			;	
						
						
		
		if(no1 > no2) {
			// no1 이 no2 보다 큰 경우
			if(no1 > no3) {
				max = no1;
			} else {
				// no1 <= no3
				max = no3;
			}
		} else {
			// no1 이 no2 보다 크지 않은 경우 : no1 <= no2
			// no1 은 max 의 대상에서 제외된 상황
			if(no2 > no3) {
				max = no2;
			} else {
				max = no3;
			}
		}
		
		
		
		
		
				
		// 출력하기
		System.out.println("no1   : " + no1);
		System.out.println("no2   : " + no2);
		System.out.println("no3   : " + no3);
		System.out.println("큰 수 : " + max);
/*		
		System.out.println();
		System.out.println("num   : " + num);
		System.out.println("soo   : " + soo);
		System.out.println("nonri : " + nonri);
		System.out.println("munja : " + munja);
*/		
		
//		
//		int no1 = (int)(Math.random() * (100 - 1 + 1) + 1);
//		int no2 = (int)(Math.random() * (100 - 1 + 1) + 1);
//		int no3 = (int)(Math.random() * (100 - 1 + 1) + 1);
//		
//		int result = 0;
//		
//		
//		if(no1 > no2 & no1 > no3) {
//				result = no1;
//		}
//			if(no1 > no2 & no1 < no3) {
//				result = no1;
//			} if(no1 < no2 & no1 > no3) {
//				result = no2;
//			} if(no1 < no2 & no1 < no3) {
//					result = no2;
//				} if(no3 > no1 & no1 < no2) {
//					result = no3;
//				} if(no3 > no1 & no1 > no2) {
//					result = no3;
//			}
//			
			/*
		int max, mid, min;
		
		if(no1 > no2) {
			if(no2 > no3) {
				max = no1;
				mid = no2;
				min = no3;
			}else {
				mid = no3;
				min = no2;
			} if(no3 > no1) {
				if(no1 > no2) {
					max = no3;
					mid = no1;
					min = no2;
				} else {
					mid = no2;
					min = no1;
				}
			} 
		} else {
			if(no1 > no3) {
				max = no2;
				mid = no1;
				min = no3;
			} else {
				mid = no3;
				min = no1;
				
			}
		}	
		
			System.out.println("랜덤한 숫자   : " + no1 + ", " + no2 + ", " + no3);
			System.out.println("제일 큰 숫자  : " + max);
			System.out.println("순서대로 나열 : " + max +" , "+ mid + " , " + min);
		
	*/
		
		


//		 System.out.printf("랜덤한 숫자 %3d , %3d , %3d 중 제일 큰 숫자 : %3d", no1, no2, no3, result);

		
		}	
}