package day06;

public class Test01_forEach {
/*
	향상된 for 명령
	
		형식 ]
		
			for(데이터타입 변수 : 배열) {
				실행문
			}
			
			참고 ]
				배열 : 같은 형태의 데이터 여러개를 하나로 관리할 목적으로
					   제공하는 자료 구조
					   
				형식 ] 
				
					데이터타입[] 변수이름 = new 데이터타입[관리할갯수];
					
					데이터타입 변수이름[] = {데이터1, 데이터2, ...};
				
				사용하는 방법 ]
					배열변수[위치값]
 */
	public static void main(String[] args) {
		int[] nos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(nos[i] + " - ");
		}
		
		System.out.println("*** 향상된 for 명령 ***");
		for(int no : nos) {
			System.out.print(no + " - ");
		}
		System.out.println();
	}
}
