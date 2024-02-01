package day04;

/*
 	랜덤하게 0 ~ 100 까지의 숫자를 세개를 발생시켜서 
 	큰 숫자만 출력해주는 프로그램을 작성하세요.
 	
 	보너스 ]
 		숫자를 순서대로 나열해서 출력하세요.
 		
 */
public class Ex01 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (100 - 1 + 1) + 1);
		
		int result = 0;
		
		if(no1 > no2 & no1 > no3) {
				result = no1;
		}
			if(no1 > no2 & no1 < no3) {
				result = no1;
			} if(no1 < no2 & no1 > no3) {
				result = no2;
			} if(no1 < no2 & no1 < no3) {
					result = no2;
				} if(no3 > no1 & no1 < no2) {
					result = no3;
				} if(no3 > no1 & no1 > no2) {
					result = no3;
			}



		System.out.printf("랜덤한 숫자 %3d , %3d , %3d 중 제일 큰 숫자 : %3d", no1, no2, no3, result);
		
}	
}