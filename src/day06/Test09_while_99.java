package day06;

/*
 	while 반복문을 활용해서
 	구구단을 출력하세요
 */

public class Test09_while_99 {
	public static void main(String[] args) {
		// 카운터 변수 만들고
		int dan = 2;
		while(dan < 10) {
			int gop = 1;
			while(gop < 10) {
				System.out.printf("%d x %d = %2d\n", dan, gop, dan*gop);
				gop++;
			}
			dan++;
			System.out.println("");
		}
	}
}
