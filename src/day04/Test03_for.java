package day04;

public class Test03_for {
	public static void main(String[] args) {
		// 랜덤하게 숫자 1 ~ 99 사이의 숫자 10개를 만들어서 출력해보자.
		for(int i = 0; i < 10; i++ ) {
			// 랜덤 숫자 만들기
			int no = (int)(Math.random() * (99 + 1 - 1) + 1);
			// 출력
			System.out.println((i + 1) + "번째 숫자 : " + no);
		}
	}
}
