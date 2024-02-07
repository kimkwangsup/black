package tmp;

import java.util.*; // java/util/ 있는 모든 클래스를 사용할 준비.
public class Test06_binarySearch {
/*
	이진탐색(Binary Search)
	: "정렬된 자료구조" 에서 사용할 수 있는 탐색 알고리즘.
	 	성능이 순차 탐색보다 효율적이다.
 */
	public static void main(String[] args) {
		// 배열을 준비해준다.
		int nums[] = new int[10];
		// 데이터 채워주기( 1 ~ 10 )
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = i + 1;
		}
		
		// 배열 내용 출력
		for(int no  : nums){
			System.out.printf("[%2d]", no);
		}
		System.out.println();
		
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력 메시지 출력
		System.out.print("찾을 숫자 : ");
		// 숫자 입력 받아 기억하기
		int target = sc.nextInt();
//		int target = 3;
		// 결과값 변수
		int result = -1;
		// 시작, 종료 인덱스 변수
		int start = 0;
		int end = 9;
		
		int cnt = 0;
		for(int i = 0;; i++) { // for 명령에서 (;;) 에 아무것도 기술하지 않으면 항상 true로 처리된다.
			// 중간 인덱스 만들고
			int mid = (start + end) / 2;
			
			// 데이터를 꺼낸다.
			int no = nums[mid];
			// 비교한다.
			if(target > no) {
				start = mid + 1;
			}else if(target < no) {
				end = mid - 1;
			}else {
				// mid 인덱스에 원하는 숫자가 기억되어있다.
				result = mid;
				cnt = i + 1;
				break;
			}
		}
		System.out.printf("정렬된 배열 %s 중 [%d] 의 위치값은 [%d] 입니다.%n%d 번 만에 찾았습니다.", Arrays.toString(nums), target, result, cnt);
	}
}
