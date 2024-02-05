package day06;


/* 
	25 ~ 34 까지의 수를 기억하는 배열 nums에서
	30 의 위치를 검색해서 출력하세요.
	
	보너스 ]
		찾을 숫자를 입력받아서
		위치값을 찾는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex01_search2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 숫자 입력 : ");
		int sno1 = sc.nextInt();

		int result = 0;
		// 배열 준비하고
		int nums[] = new int[10]; // int 데이터 10개를 기억할 배열 nums 를 준비
		// 배열 만들기
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = 25 + i;
		
			}		
		
		
		// 채워진 데이터 확인


		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = 25 + i;
			
			int no = nums[i];
			// 찾을 숫자와 비교하고
			if(sno1 == no) {
				result = i;
				break;
			}
		}
		System.out.println("입력된 숫자 [" + sno1 + "] 은 " + (result + 1) + "번째에 있습니다.");
	}
}
