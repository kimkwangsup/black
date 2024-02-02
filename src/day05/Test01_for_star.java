package day05;

/*
 	*****
 	*****
 	*****
 	*****
 	*****
 	
 	을 출력해보자.
 */

public class Test01_for_star {

	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				// 가로로 * 을 5번 출력
				if(i == j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			// 줄바꿈을 해줘야한다.
			// *****
			//
			System.out.println();
		}
	}
}
