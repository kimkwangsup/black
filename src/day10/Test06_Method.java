package day10;

import java.util.Arrays;

public class Test06_Method {
/*
	가변인자
	==> 함수를 제작할 때
		그 함수를 실행할 때 입력해야 할 데이터의 갯수에 따라서
		매개변수 리스트의 형태가 달라진다.
		
		[접근지정자] [속성] 반환값타입 함수이름(매개변수리스트) {}
 		
 		그 함수가 가지고 있는 매개변수와 동일한 갯수, 형태, 순서를 이용해서
 		함수를 호출해야 한다.
 		
 		만약 데이터의 갯수를 정할 수 없는 경우에는???
 		==> 이런 경우에 사용할 수 있는 문법
 		
 			형식 ]
 				[접근지정자] [속성] 반환값타입 함수이름(데이터타입 ... 변수이름){
 					실행내용...
 				}
 				
 			예 ]
 				public int sum(int ... no){ // sum(1, 2, 3) --- O
 					처리내용...
 				}
 				==> 이때 매개변수로 만들어진 no는 배열변수가 된다.
 					== (int[] no) <=== sum(1, 2, 3) --- X
 					
 		참고 ]
 			가변인자는 자동 배열 변수가 된다.
 			따라서 배열처럼 사용하면 된다.
 			
 		참고 ]
 			가변인수 뒤에는 다른 매개변수가 오면 절대 안된다.
 			가변인수 앞에는 다른 매개변수가 와도 상관없다.
 			
 			예 ]
 				int calcSum(int a, int b, int c){} --- O
 				
 				int calcSum(int a, int ... b){}    --- O
 				
 				int calcSum(int ... a, int b){}    --- X
 */
	public static void main(String[] args) {
		Test06_Method t1 = new Test06_Method();
		t1.abc(28, "제니");
//		t1.abc("제니", 28); // 매개변수의 순서가 달라서 에러...
		
		System.out.println(t1.sum(1, 1, 1, 4, 6));
		// 배열 만들기
		int no[] = {2,4,6,8,10};
		
		System.out.println("no 의 합계 : " + t1.sum(no));
	}
	
	public void abc(int age, String name) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	public int sum(int ... no) {
		// 이 때 no는 배열변수
		// 따라서 갯수만큼 꺼내서 누적해주면 된다.
		System.out.println(Arrays.toString(no));
		int result = 0;
		for(int n : no) {
			result += n;
		}
		// 반환만 해주면 된다.
		return result;
	}

}
