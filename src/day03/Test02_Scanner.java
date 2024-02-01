package day03;


/*
 	두개의 숫자를 입력 받아서
 	첫번째 숫자를 가로로 하고
 	두번째 숫자를 세로로 하는
 	사각형의 넓이를 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;
public class Test02_Scanner {
	
	/*
	 	키보드를 이용해서 데이터 입력받기
	 		
	 		1.  클래스를 만들기 전에 
	 			import java.util.*;
	 			라고 java 폴더내의 util 폴더 안의 모든 클래스를 사용할 준비를 한다.
	 			
			2.	main 함수 내에서 작성된 내용을 실행할 것이므로
				main 함수 내에서 
					Scanner sc = new Scanner(System.in);
				라는 명령으로 키보드를 통해서 입력받을 도구를 준비한다.
				
			3. 변수 = sc.nextXXXX(); 
				라는 명령으로 데이터를 입력받으면 된다.
				
				이때 XXXX는 입력받을 데이터의 종류에 따라서 달라진다.
				
					예 ]
						문자열을 입력 받는 경우
							sc.nextLine();
						정수를 입력 받는 경우
							int 변수이름 = sc.nextInt();
						실수를 입력 받는 경우
							float 변수이름 = sc.nextFloat();
							
				* 여기서는 문자열로 숫자를 입력 받아서 
				  문자열을 정수로 변환해서 
				  연산을 하고 그 결과를 출력해 보기로 하자.
	 */
	
	public static void main(String[] args) {
		// 데이터 입력받을 도구를 준비.
		Scanner sc = new Scanner(System.in);
		
		// 데이터를 문자열을 입력받고
		String sno1, sno2;
		// int sno1, sno2;
		System.out.print("가로 입력 : ");
		sno1 = sc.nextLine(); // 입력 된 내용을 문자열로 읽어오는 함수.
		// sno1 = sc.nextInt(); 
		System.out.print("세로 입력 : ");
		sno2 = sc.nextLine();
		// sno2 = sc.nextInt();
		// 숫자 형태의 문자열을 정수로 변환해준다.
		int garo = Integer.parseInt(sno1);
		int sero = Integer.parseInt(sno2);
		
		// 정수로 변환된 가로, 세로를 이용해서 면적계산
		
		int area = garo * sero;
		
		System.out.println("입력된 가로 : " + garo);
		System.out.println("입력된 세로 : " + sero);
		
		
		/*
		 	참고 ] 
		 		문자열에서 사용할 수 있는 연산자는 + 가 유일하다.
		 		+ 는 원래 숫자 데이터에서 사용할 수 있는 연산자이다.
		 		하지만 문자열을 처리할 때 결합하는 기능이 필요해서
		 		자바에서는 + 를 String 데이터에서는 결합연산자로 사용할 수 있도록 해 놓은 것이다.
		 		따라서 다른 클래스 타입의 데이터에서는 + 연산자를 사용할 수 없다.
		 		그리고 + 이외의 다른 연산자( - , * , / , % )는 문자열에서 정의 해놓지 않았기 때문에 정의 할 수 없다.
		 */
		
		/*
		 	숫자 형태의 문자열을 숫자로 변환하는 방법
		 	
		 		1. 정수
		 			int no = Integer.parseInt(정수형태의 문자열);
		 		2. 실수
		 			double no = Double.parseDouble(실수형태의 문자열);
		 */
		System.out.println("사각형의 넓이 : "  + area);
	}
}
