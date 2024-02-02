package day05;

/*
	구구단을 출력하는데 
	7단을 제외하고 출력하세요.
 */

public class Test03_for_continue {
	public static void main(String[] args) {
		for(int dan = 2 ; dan < 10 ; dan++) {
			if(dan == 7) continue;
			/*
			 	참고 ] 
			 		블럭 내의 내용이 명령 한개인 경우는 블럭({})을 생략할 수 있다.
			 */
			for(int gop = 1; gop < 10 ; gop++) {
				System.out.printf("%d x %d = %2d\n", dan , gop, dan * gop);
			}
			System.out.println();
		}
	}
}
