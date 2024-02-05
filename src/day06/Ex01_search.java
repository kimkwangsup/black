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
public class Ex01_search {
	public static void main(String[] args) {
		
		int target = 30;
		int result = 0;
		// 배열 준비하고
		int nums[] = new int[10]; // int 데이터 10개를 기억할 배열 nums 를 준비
		// 배열 만들기
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = 25 + i;
		
			}		
		
		
		// 채워진 데이터 확인
		for(int i = 0 ; i < nums.length ; i++) {
//			System.out.printf("[%2d]", nums[i]);
			
//			System.out.println("");
			
		}
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = 25 + i;
			
			int no = nums[i];
			// 찾을 숫자와 비교하고
			if(target == no) {
				result = i;
				break;
			}
		}
		System.out.println("배열 nums 에서 찾는 숫자 [ " + target + " ] 은 " + (result + 1) + "번째에 있습니다.");
	}
}
