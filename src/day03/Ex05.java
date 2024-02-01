package day03;

/* 화씨온도 100도는 섭씨온도 몇도인지를 출력해주는 프로그램을 작성하세요.
		참고 ]
			섭씨온도 = 5 / 9 * (화씨온도 - 32)
*/

public class Ex05 {
	public static void main(String[] args) {
		
		
		
		double C , S , D, F;
		
		// D = (double)(Math.random() * (100 - (-100) + 1) + (-100)); 
		// 화씨온도가 -100 ~ 100도 사이의 랜덤한 온도일때.
		// F = (int)(D * 10)/ 10.0;
		// F 를 소수점 첫재짜리까지만 출력하는 방식.
		F = 100;
		
		// F = 87.3;
		S = 5. / 9. * (F - 32);
		
		// C = (int)(S * 10) / 10.0; 
		// 그대로 출력
		// System.out.println("화씨온도가 " + D + "도씨 일 경우 섭씨온도는 " + S + "도씨 입니다.");
		// C 를 소수점 첫째짜리까지만 출력하는 방식.
		System.out.println("화씨온도가 " + F + "도씨 일 경우 섭씨온도는 " + S + "도씨 입니다.");
		System.out.printf("화씨온도 %4.1f 도 일때 섭씨온도는 %4.1f 도 입니다.",F, S);
	}
}
