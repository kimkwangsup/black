package day02;

public class Test05 {
	public final double PI = 3.14159;
		
	public static void main(String[] agrs) {
		// 상수를 만들어 보자.
		// 상수를 만드는 형식
		//		final 데이터타입 상수이름 = 데이터;
		// 의 형식으로 앞에  final 속성을 붙여주고
		// 반드시 초기화 까지 해줘야 한다.
//		final double MY_PI = 3.14;
		final double MY_PI;
		MY_PI = 3.14;
		
		System.out.println("나의 파이값 : " + MY_PI);
//		MY_PI = 3.1415;
		}
}
