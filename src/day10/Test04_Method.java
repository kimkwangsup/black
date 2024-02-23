package day10;

/*
	랜덤하게 숫자 두개를 발생시켜서
	두 수의 계산 결과를 반환해주는 프로그램을 작성하세요.
	처리는 함수를 제작해서 처리하는 것으로 하세요.
	
	해결 방법 ]
		1. 랜덤하게 정수 두개를 발생시키는 기능
		
		2. 발생된 두 수를 입력하고 연산기호를 입력해주면 그 결과를 반환해주는 기능
		
			+, -, *, /, %
			각각 하나의 기능이 된다.
			
 */
import java.util.*;
public class Test04_Method {
	// 랜덤하게 두개의 정수 만들어주는 함수
	public int[] getNums() {
		// 반환값 변수
		int[] result = new int[2];
		// 배열에 랜덤한 숫자를 채운다.
		// 반복문으로 채운다.
		for(int i = 0 ; i < 2 ; i++) {
			int no = (int)(Math.random() * 20 + 1);
			result[i] = no;
		}
		
		// 반환하고 
		return result;
	}
	// 더하기
	public int hap(int no1, int no2) {
		int result = no1 + no2;
		return result;
	}
	// 빼기
	public int minus(int no1, int no2) {
		int result = no1 - no2;
		return result;
	}
	// 곱하기
	public int gop(int no1, int no2) {
		int result = no1 * no2;
		return result;
	}
	// 나누기
	public double div(int no1, int no2) {
		double result = (double)no1 / no2;
		return result;
	}
	// 나머지
	public int rest(int no1, int no2) {
		int result = no1 % no2;
		return result;
	}
	
	// 계산해주는 함수
	// calc(10, '+', 20)
	public double calc(int no1, char giho, int no2) {
		// 결과값 변수
		double result = 0.0;
		// 처리
		switch(giho) {
	
		case '+':
			result = hap(no1, no2);
			break;
		case '-':
			result = minus(no1, no2);
			break;
		case '*':
			result = gop(no1, no2);
			break;
		case '/':
			result = div(no1, no2);
			break;
		case '%':
			result = rest(no1, no2);
			break;
		}
		return result;
	}
	
	// 배열과 연산기호를 입력해서 실행하면 결과를 반환해주는 함수
	public double calc(int[] no, char giho) {  // 함수의 중첩(overloading)
		// calc({10, 20}, '+');
		int no1 = no[0];
		int no2 = no[1];
		// 결과값 변수
		double result = 0.0;
		// 처리
		switch(giho) {
	
		case '+':
			result = hap(no1, no2);
			break;
		case '-':
			result = minus(no1, no2);
			break;
		case '*':
			result = gop(no1, no2);
			break;
		case '/':
			result = div(no1, no2);
			break;
		case '%':
			result = rest(no1, no2);
			break;
		}
		return result;
	}	
	
	// 기호를 랜덤하게 만들어주는 함수
	public char getGiho() {
		char[] ch = {'+', '-', '*', '/', '%'};
		char result = 0;
		
		// 랜덤하게 인덱스를 만들어 주고
		int idx = (int)(Math.random() * 5);
		result = ch[idx];
				
		return result;
	}
	public static void main(String[] args) {
		// 위에서 제작한 함수는 static 멤버가 아니므로 
		// 아직 메모리에 올려져 있는 상태가 아니다.
		// 그래서 아직 사용할수 없다.
		// 사용하려면 객체로 만들어서 사용하면 된다.
		Test04_Method t1 = new Test04_Method();
		
		//  3 + 4 
//		System.out.println(t1.hap(3, 4));
		
		// 두 개의 정수를 랜덤하게 발생해서 반환해주는 함수 실행
		int[] num = t1.getNums();
//		System.out.println(Arrays.toString(num));
		// 기호 만들고
		char giho = t1.getGiho();
//		System.out.println("연산기호 : " + giho);
		// 계산 결과
		double result = t1.calc(num, giho);
		// 결과 출력
		System.out.printf("랜덤하게 발생된 두수 [%2d] 와 [%2d] 의 [%c] 연산은 [%4.2f]입니다."
				, num[0], num[1], giho, result);
		System.out.println();
		
		// 입력받은 데이터로 처리
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("첫번째 숫자 : ");
		// 입력 받은 숫자1
		int no1 = sc.nextInt();
		// 메세지 출력
		System.out.print("두번째 숫자 : ");
		// 입력 받은 숫자2
		int no2 = sc.nextInt();
		// 메세지 출력
		System.out.print("부호 입력   : ");
		// 입력 받은 연산기호
		sc.nextLine();
		char buho = sc.nextLine().charAt(0);
		sc.close();
		
		// 계산
		double result1 = t1.calc(no1, buho, no2);
		// 결과출력
		System.out.printf("입력받은 두 수 [%2d] 와 [%2d] 의 [%c] 의 연산은 [%5.2f] 입니다.", no1, no2 , buho, result1);
	}

}
