package day05;

/*
 	주사위 2개를 던져서 
 	합이 7이 나오는 경우를 모두 출력하세요.
 */
public class Ex02 {
	public static void main(String[] args) {
		
		System.out.println("두 주사위의 합이 7인 경우는 :");
		
		for(int i = 1 ; i <= 6 ; i++) {
			for(int j = 1 ; j <= 6 ; j++) {
				if(i + j == 7) {
					System.out.printf("[%d] ,[%d]%n", i, j);
					
				}
			}
		}
		
	}

}
