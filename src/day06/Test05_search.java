package day06;

/*
	1 ~ 10 까지의 숫자를 랜덤하게 10 개 만들어서
	배열에 기억 시키세요.
	단, 중복된 숫자는 없도록 하세요.
 */
public class Test05_search {
	
	public static void main(String[] args) {
		// 정수 10개를 기억시킬 배열 준비
		int soos[] = new int[10];
		
		loop:
		for(int i = 0 ; i < 10 ; i++) { // 숫자 생성용 반복문
			/*
				 	현재 i번째방에 채울 데이터를만들고
				 	i번째 보다 1 작은 방까지의 데이터를
				 	하나씩 꺼내서 중복이 되는지 검사할 예정이다.
			 */
			int no = (int)(Math.random() * 10 + 1);
			for(int j = 0 ; j < i ; j++) { // 검사용 반복문
				// 첫번째 방에서부터 i번째 이전방까지 하나씩 꺼내서
				// 비교해본다.
				int before = soos[j];
				if(no == before) {
					// 이전에 기억한 숫자와 중복 된 경우이므로
					// 번호를 다시 만든다.
					// i를 1 감소시켜 주고( <== 이번회차를 다시 진행해야 하기 때문에...)
					i--;
					continue loop;
				}
			}
			// 이 부분을 실행하는 경우는 중복 된 숫자가 없는 경우....	
			// 배열에 만들어진 번호 채워넣기.
			soos[i] = no;
		}
		
		// 배열 출력하기
		for(int i = 0 ; i < soos.length ; i++) {
			System.out.printf("| %2d",soos[i]);
		}
		System.out.println("|");
		System.out.println("******** 졍렬후 *********");
		
		
		// 정렬하기
		for(int i = 0 ; i < soos.length - 1  ; i++) {
			for(int j = i + 1 ; j < soos.length ; j++) {
				if(soos[i] > soos[j]) {
					// 임시 기억 변수만들기
					int tmp = soos[i];
					soos[i] = soos[j];
					soos[j] = tmp;
					
				}
			}
		}
		// 배열 출력하기
				for(int i = 0 ; i < soos.length ; i++) {
					System.out.printf("| %2d",soos[i]);
				}
				System.out.println("|");
	}
}
