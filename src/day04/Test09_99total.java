package day04;

/*
 	구구단을 모두 출력해보자
 	
 		참고 ]
 			반복문도 중첩해서 사용할 수 있다.
 			이때 주의 사항으로 카운터 변수가 중복되지 않도록 한다.
 			
 			for(int i = 0 ; i < 100; i++) {
 				for(int j = 0 ; j < 10 ; j++) {
 				
 				}
 			}
 			
 			2 x 1 = 2
 			...
 			2 x 9 = 18
 			
 			3 x 1 = 3
 			...
 			3 x 9 = 27
 			
 			4 x 1 = 4
 			...
 			
 */
public class Test09_99total {
	public static void main(String[] agrs) {
		
		for(int dan = 2 ; dan < 10 ; dan++) {
			for(int gop = 1; gop < 10; gop++) {
				System.out.println(dan + " x " + gop + " = " + dan * gop);
			}
			System.out.println(); // 공백 출력
		}
		
		
		
	}
}
