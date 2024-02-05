package day06;

import java.util.*;
public class Test03_forEach {

	public static void main(String[] args) {
		// BlackPink 멤버의 이름, 나이, 전화번호, 성별, 혈액형을
		// 기억하는 배열을 만들어보자
		// 멤버 순서는 제니, 리사, 로제, 지수 순으로 한다.
		String[][] blackPink = new String[4][5];
/*
			주의 ]
				기본 데이터 타입으로 배열을 만드는 경우
				배열의 각 방에 기억된 데이터는 0으로 자동 초기화 된다.
				
				객체타입의 배열을 만드는 경우
				자동초기화가 되지 않는다.
				각 방에는 null (아직 기억하는 데이터가 결정되지 않은 상태)
				로 세팅된다.
		int[][] nums = new int[4][5];
		
		for(int[] no : nums) {
			System.out.println(Arrays.toString(no));
		}
*/
		
		String[] jennie = new String[] {
				"제니", "28", "010-7272-7272", "여자", "B형"
		};
		String[] lisa = new String[] {
				"리사", "26", "010-2424-2424", "여자", "O형"
		};
		String[] rose = new String[] {
				"로제", "26", "010-5252-5252", "여자", "B형"
		};
		String[] jisoo = new String[] {
				"지수", "29", "010-2929-2929", "여자", "A형"
		};

		// 1차원 배열을 2차원 배열의 각 방에 채워준다.
		blackPink[0] = jennie;
		blackPink[1] = lisa;
		blackPink[2] = rose;
		blackPink[3] = jisoo;
		
		for(String[] memb : blackPink) {
			System.out.println(Arrays.toString(memb));
		}
		/*
		 	참고 ]
		 		Arrays.toString() 은
		 		출력해보면 마치 데이터가 꺼내와 지는 것처럼 보이지만
		 		데이터를 사용할 때는 이렇게 꺼내면 안된다.
		 		이 함수는 배열의 데이터를 문자열로 변환해서 내보내주는
		 		기능을 가진 함수이다.
		 		따라서 데이터 각각에 대한 연산이 안된다.
		 		
		 		Arrays.toString(blackPink[3])  ==> "[지수, 29, 010-2929-2929, 여자, A형]"
		*/
		
		// 지수의 데이터를 꺼내보자
		for(String js : blackPink[3]) {
			System.out.print("["+js + "]");
		}
		System.out.println();
		
		// 모든 데이터를 꺼내보자

		System.out.println();
		for(String memb[] : blackPink) { // 멤버 꺼내고
			// 각 멤버의 정보 꺼내고
			for(String info : memb) {
				System.out.printf("[%s]", info);
			}
			System.out.println("");
			}
		System.out.println();
		
		// 기본 for 명령으로 데이터 꺼내서 출력
		System.out.println("*** for 명령으로 꺼내기 ***");
		for(int i = 0 ; i < blackPink.length ; i++) {
			// 먼저 멤버 꺼내고
			// 4명의 데이터를 모아놓은 배열이므로 blackPink 의 길이는 4
			for(int j = 0 ; j < blackPink[i].length ; j++) {
				// 각 멤버의 데이터를 순서대로 하나씩 꺼내기
				String data = blackPink[i][j]; 
				// i번째 멤버의 j번째 정보 꺼내서
				// data 라는 문자열 변수에 기억
				
				// 출력
				System.out.printf("| %s", data);
			}
			System.out.println("|");
		}
	}

}
