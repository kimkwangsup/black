package day06;

public class Test08_while {

	public static void main(String[] args) {
		// 구구단 5단을 출력해 보자.
		// 단 변수
		int dan = 5;
		// 카운터변수
		int gop = 1;
		while(gop < 10) {
			System.out.printf("%d. %d x %d = %2d%n",gop, dan, gop, dan * gop);
			gop++;
		}
		System.out.println("**** 구구단 출력 후 ****");
	}
}
