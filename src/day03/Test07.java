package day03;

public class Test07 {
	public static void main(String[] args) {
		/*
		 	물건을 구매했는데 금액이 54,232원 이다.
		 	이 금액은 우리나라 화폐로 각각 몇장씩 지불해야 하는지
		 	계산해서 출력하세요.
		 */
		// 금액변수
		int money = 54232;
		// 계산 변수
		int tmp = money;
		
		// 오만원권 계산
		int oman = tmp / 50000;
		tmp %= 50000;
//		tmp = tmp % 50000;
		
		// 만원권 계산
		int man = tmp / 10000;
		tmp %= 10000;
		
		// 오천원권 계산
		int ochun = tmp / 5000;
		tmp %= 5000;
		
		// 천원권 계산
		int chun = tmp / 1000;
		tmp %= 1000;
		
		// 오백원권 계산
		int obek = tmp / 500;
		tmp %= 500;
		
		// 백원권 계산
		int bek = tmp / 100;
		tmp %= 100;
		
		// 오십원권 계산
		int osip = tmp / 50;
		tmp %= 50;
		
		// 십원권 계산
		int sip = tmp / 10;
		tmp %= 10;
		
		// 일원권 계산
		int il = tmp;
		
		System.out.println("지불할 금액 : " + money);
		System.out.println("오만원권 : " + oman);
		System.out.println("만원권 : " + man);
		System.out.println("오천원권 : " + ochun);
		System.out.println("천원권 : " + chun);
		System.out.println("오백원권 : " + obek);
		System.out.println("백원권 : " + bek);
		System.out.println("오십원권 : " + osip);
		System.out.println("십원권 : " + sip);
		System.out.println("일원권 : " + il);		
	}
}
