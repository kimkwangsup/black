package day09;

import java.util.Arrays;

public class Ex04_array {
/*
 	1.
		다섯 학생들의
		국어, 영어, 수학, 총점(점수는 랜덤)
		을 관리할 배열을 만들고
		데이터를 채워서
		정보를 출력하세요. (완료)
	2.
		위 배열을 깊은 복사해서 
		순위가 추가된 배열을 만들고
		
	3.	
		순위를 채워서
		
	4.	
		오름차순 정렬하세요.
	
 */
	public static void main(String[] args) {
		/*
		int[][] nums = new int[5][4];
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				nums[i][j] = (int)(Math.random() * (100 - 60 + 1) + 60);
			}
			nums[i][3] = nums[i][0] + nums[i][1] + nums[i][2];
		}
		for(int[] a : nums) {
//			System.out.println(Arrays.toString(a));
		}
		
		int[][] result = new int[5][5];
		
		System.arraycopy(nums[0], 0, result[0], 0, 4);
		System.arraycopy(nums[1], 0, result[1], 0, 4);
		System.arraycopy(nums[2], 0, result[2], 0, 4);
		System.arraycopy(nums[3], 0, result[3], 0, 4);
		System.arraycopy(nums[4], 0, result[4], 0, 4);

		for(int[] a : result) {
				System.out.println(Arrays.toString(a));
			
		}
		for(int i = 0 ; i < 5 ; i++) {
			
		}
		*/
		
		int[][] a_ban = new int[5][4];
		/*
		int kor1 = (int)(Math.random() * 101);
		int eng1 = (int)(Math.random() * 101);
		int math1 = (int)(Math.random() * 101);
		int total1 = kor1 + eng1 + math1;
		
		a_ban[0][0] = kor1;
		a_ban[0][1] = eng1;
		a_ban[0][2] = math1;
		a_ban[0][3] = total1;
		
		
		int kor2 = (int)(Math.random() * 101);
		int eng2 = (int)(Math.random() * 101);
		int math2 = (int)(Math.random() * 101);
		int total2 = kor2 + eng2 + math2;
		
		a_ban[1][0] = kor2;
		a_ban[1][1] = eng2;
		a_ban[1][2] = math2;
		a_ban[1][3] = total2;
		*/
		
		for(int i = 0 ; i < 5 ; i++) {
			// 과목 데이터 입력
			for(int j = 0 ; j < 3 ; j++) {
				// 각 과목 점수 입력
				a_ban[i][j] = (int)(Math.random() * 41 + 60);
				// 총점 누적
				a_ban[i][3] += a_ban[i][j];
			}
//			a_ban[i][3] = a_ban[i][0] + a_ban[i][1] + a_ban[i][2];
		}
		
		// 출력
		for(int i = 0 ; i < a_ban.length ; i++) {
			// 학생 한명 꺼내고
			
			for(int j = 0 ; j < a_ban[i].length; j++) {
				// 과목 하나 꺼내고
				System.out.print(a_ban[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("");
		
		// 순위 추가
		for(int i = 0 ; i < 5 ; i++) {
			// 1. 한명씩 데이터 꺼내기
			int[] stud = a_ban[i];	// 국어, 영어, 수학, 총점을 기억하는 배열
			// 2. 비어있는 배열 만들고
			int[] newScore = new int[5];
			// 3. 데이터 복사하고
			System.arraycopy(stud, 0, newScore, 0, 4);
			// 4. 새로 만든 배열로 교체하고
			a_ban[i] = newScore;
		}
		
		// 결과 확인
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(a_ban[i][j] + ", "); // 각 과목 꺼내서 출력
			}
			System.out.println(); // 줄바꿈
		}
		System.out.println(" ");
		
		// 순위 채우기
		for(int i = 0 ; i < 5 ; i++) {
			// 순위에 1로 채운다.
			a_ban[i][4] = 1;
			// 총점 꺼내기
			int total = a_ban[i][3];
			for(int j = 0 ; j < 5 ; j++) {
				// 다른 학생의 총점 꺼내고
				int chong = a_ban[j][3];
				if(chong > total) {
					a_ban[i][4] = a_ban[i][4] + 1;
				}
			}
		}
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(a_ban[i][j] + ", "); // 각 과목 꺼내서 출력
			}
			System.out.println(); // 줄바꿈
		}
		System.out.println("");
		
		// 정렬하기
		// 한명씩 데이터 꺼내고
		for(int i = 0; i < 4 ; i++) {
			
			for(int j = i + 1 ; j < 5 ; j++) {
				// 꺼낸 학생의 순위
				int rank = a_ban[i][4];
				// 비교할 학생 순위 꺼내고..
				int soonwee = a_ban[j][4];
				
				if(rank > soonwee) {
					// 순위가 높은 학생의 데이터를 통째로 위치를 바꾼다.
					int[] tmp = a_ban[i];
					a_ban[i] = a_ban[j];
					a_ban[j] = tmp;
				}
			}
		}
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(a_ban[i][j] + ", "); // 각 과목 꺼내서 출력
			}
			System.out.println(); // 줄바꿈
		}

	}

}
