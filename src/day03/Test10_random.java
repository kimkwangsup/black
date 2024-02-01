package day03;

public class Test10_random {
	public static void main(String[] args) {
		// 0 에서 10 까지의 랜덤한 숫자 10개
		for(int i = 0 ; i < 10 ; i++ ) {
			int no1 =(int)(Math.random() * (10 - 0 + 1) + 0);
			System.out.println("0 부터 10 사이의 랜덤한 숫자 : " + no1);
		}
			// -10 에서 10 까지의 랜덤한 숫자 10개
			for(int i = 0 ; i < 10 ; i++ ) {
				int no1 =(int)(Math.random() * (10 - (-10) + 1)) + (-10);
				System.out.println("-10 부터 10 사이의 랜덤한 숫자 : " + no1);
			
		}
	}
}
