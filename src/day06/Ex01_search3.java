package day06;


/* 
	25 ~ 34 까지의 수를 기억하는 배열 nums에서
	30 의 위치를 검색해서 출력하세요.
	
	보너스 ]
		찾을 숫자를 입력받아서
		위치값을 찾는 프로그램을 작성하세요.
		
		
		레어 문제 ]
			25 ~ 34 를 랜덤하게 중복없이 배열에 채워서
			찾을 숫자를 입력받아서 
			위치값을 찾는 프로그램을 작성하세요.
			* 참고
			로또 번호 생성기 참고
 */
import java.util.*;
public class Ex01_search3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 숫자 입력 : ");
		int sno1 = sc.nextInt();
		int nums[] = new int[10];
		int result = 0;
		
		loop:
		for(int i = 0 ; i < 10 ; i++) { // 숫자 생성용 반복문
			/*
				 	현재 i번째방에 채울 데이터를만들고
				 	i번째 보다 1 작은 방까지의 데이터를
				 	하나씩 꺼내서 중복이 되는지 검사할 예정이다.
			 */
			int no = (int)(Math.random() * (34-25+1) + 25);
			for(int j = 0 ; j < i ; j++) { // 검사용 반복문
				// 첫번째 방에서부터 i번째 이전방까지 하나씩 꺼내서
				// 비교해본다.
				int before = nums[j];
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
			nums[i] = no;
		}
		for(int i = 0 ; i < nums.length ; i++) {
		System.out.printf("[%2d]",nums[i]);
		}
		for(int i = 0 ; i < nums.length ; i++) {
			// 숫자 한개를 하나씩꺼내고
			int no = nums[i];
			// 찾을 숫자와 비교하고
			if(sno1 == no) {
				result = i;
				break; // 현재 실행중인 반복문을 즉시 종료하세요.
			}		
		}
		System.out.println();
		System.out.println("입력한 숫자 [" + sno1 + "] 은 "+(result + 1)+"번째에 있습니다.");
	}
}
