package day03;

public class Test08 {
	public static void main(String[] args) {
		// 논리연산
		int no1 = 10;
		int no2 = 10;
		
		boolean result = (no1++ > no2) & (++no1 > no2);
		
		System.out.println("(no1++ > no2) & (++no1 > no2) : " + result);
		System.out.println("no1 : " + no1);
		
		// &&, || : 논리연산자로 절삭연산을 한다.
		//		==> 앞의 결과값으로 모든 연산의 결과가 결정되는 경우
		//			뒤쪽은 읽어보지 않는다.
		int no3 = 10;
		int no4 = 10;
		
		boolean result1 = (no3++ > no4) && (++no3 > no4);
		
		System.out.println("(no3++ > no4) && (++no3 > no4) : " + result1);
		System.out.println("no3 : " + no3);		
	}
}
