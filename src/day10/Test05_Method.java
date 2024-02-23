package day10;

/*
	랜덤하게 반지름을 만들어서 
	원의 둘레와 넓이를 계산해서 출력하세요.
	각 기능은 함수로 처리하세요.
	
	pi 값은 3.14로 하기로한다.
 */
public class Test05_Method {

	// 반지름 만들어주는 함수
	public int sno1() {
		int rad = (int)(Math.random() * 20 + 1);
		return rad;
	}
	// 둘레 계산해주는 함수
	public double sno2(int rad) {
		double arro = 2 * 3.14 * rad;
		return arro;
	}
	// 넓이 계산해주는 함수
	public double sno3(int rad) {
		double area = 3.14 * rad * rad;
		return area;
	}
	
	/*
			*****
			함수는 호출하지 않으면 절대로 실행되지 않는다.
			*****
	 */
	public static void main(String[] args) {
		Test05_Method t1 = new Test05_Method();
		// ==> 함수들을 사용할 준비만 해놓은 상태
		// 반지름 만들고
		int rad = t1.sno1();
		// 둘레 계산하고
		double arround = t1.sno2(rad);
		// 넓이 계산하고
		double area = t1.sno3(rad);
		// 출력하고
		System.out.printf("랜덤하게 발생한 원의 반지름 [%2d] 의 둘레는 [%5.2f] 이고 넓이는 [%5.2f] 이다.", rad, arround, area);
	}

}
