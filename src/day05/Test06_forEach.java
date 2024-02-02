package day05;

/*
 	향상된 for 명령(forEach)
 */
import java.util.*;
public class Test06_forEach {
/*
 	참고 ]
 		배열(Array)
 		: 한 가지 타입의 데이터를 여러개 모아서 관리하는 자료구조
 		
 			형식 ]
 				데이터타입[] 변수이름 = new 데이터타입[관리할 갯수];
 				데이터타입[] 변수이름 = new 데이터타입[]{데이터1, 데이터2, ...};
 				데이터타입[] 변수이름 = {데이터1, 데이터2, ...};
 				
 				
	 			사용하는 방법 ]
	 				꺼낼 때   : 변수이름[위치값]
	 				입력할 때 : 변수이름[위치값] = 데이터;
	 		
	 		배열의 단점
	 			배열을 생성할 때
	 				관리할 데이터의 타입과 
	 				관리할 데이터의 갯수를 지정해줘야 만들 수 있다.
	 			한번 결정된 데이터의 형태와 갯수는 변경 할 수 없다.
	 				
 		
 */
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5};
		/*
		int[] lotto = new int[6];
//		System.out.println("# 데이터입력 전 :" + Arrays.toString(lotto));
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = (int)(Math.random() * (45 - 1 + 1) + 1);
		}
//		System.out.println("# 데이터입력 후 :" + Arrays.toString(lotto));
		*/
		
		int[][] lotto = new int[5][6];
		for(int i = 0 ; i < lotto.length ; i++) {
			
			loop:
			for(int j = 0 ; j < lotto[i].length ; j++) {
				int no = (int)(Math.random() * 45 + 1);
				
				for(int k = 0 ; k < j ; k++) {
					if(lotto[i][k] == no) {
						// 중복된 번호 발생한 경우
						// 번호를 다시 생성한다.
						j--;
						continue loop;
					}
				}
				lotto[i][j] = no;
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.println(Arrays.toString(lotto[i]));	
			}
		
		System.out.println();
		for(int i = 0 ; i < lotto.length ; i++) {
			for(int j = 0 ; j <lotto[i].length ; j++ ) {
				System.out.printf("[%2d]", lotto[i][j]);
			}
			System.out.println();
			}
	}
}
