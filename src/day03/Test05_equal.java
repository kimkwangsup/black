package day03;

public class Test05_equal {
	public static void main(String[] agrs) {
		/*
		 	비교연산자
		 		크기를 비교하는 연산자.
		 		>	: 크다.
		 		<	: 작다.
		 		>=	: 크거나 같다.
		 		<=	: 작거나 같다.
		 		==	: 같다.
		 		!=	: 같지 않다 / 다르다.
		 	***** 
		 	비교연산자의 결과는 논리형태의 데이터(true or false)가 만들어진다.
		 */
		int no1 = 10;
		int no2 = 11;
		
		System.out.println("no1  > no2 : " + (no1 > no2));
		System.out.println("no1  < no2 : " + (no1 < no2));
		System.out.println("no1 >= no2 : " + (no1 >= no2));
		System.out.println("no1 <= no2 : " + (no1 <= no2));
		System.out.println("no1 == no2 : " + (no1 == no2));
		System.out.println("no1 != no2 : " + (no1 != no2));

		/*
		 	참고 ]
		 		동등비교연산자(==)는 문자열 데이터도 비교할 수 있다.
		 */
		String jennie = "제니";
		String name = "제니";
		System.out.println("jennie == name : " + (jennie == name));
	
		String irum = new String("제니"); 
		// new 명령어를 붙히면 heap에 쌓이기 때문에 리터럴 풀에 기억된 기존 String 값과다르다.
		System.out.println("irum == name : " + (name == irum));
		
		System.out.println("name과 irum의 데이터 비교: " + name.equals(irum));
		
		/*
		 	참고 ]
		 		문자열의 비교는
		 		변수가 기억하는 주소를 비교하므로
		 		데이터를 비교하는 결과가 만들어지지 않는다.
		 		따라서 
		 		문자열을 비교할 때는 반드시
		 			equals()
		 		함수를 이용해서 비교해야 한다.
		 */
		
		String a = "abc";
		String b = "bcd";
		
//		System.out.println("a > b : " + (a > b));	
		// String 데이터는 > 연산자는 정의 되어 있지 않으므로 사용할 수 없다.
		
		}
}
