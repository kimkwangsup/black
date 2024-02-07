package day07;

/*
	2x + 4y = 10
	을 만족하는 
	x와 y의 조합들을 출력하세요.
 */

public class Test02_while {
	public static void main(String[] args) {
		// 할일
		// x 가 정해질 때 y 를 증가시켜 가면서 결과가 10이 되는지 확인해본다.
		int x = 0;
		int y = 0;			
		while(x < 100) { // x 를 증가시킬 반복문
			y = 0;
			while(y < 100) { // y 를 증가시킬 반복문
				if(2 * x + 4 * y == 100){
					// 결과 출력
					System.out.printf("2x + 4y = 10 을 만족하는 " + "x와 y의 조합은 (%d, %d) 입니다.\n",x, y);
					
					break;
				}
				y = y + 1;
			}
			x = x + 1; // 
		}		
	}
}
