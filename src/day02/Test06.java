package day02;

public class Test06 {
	public static void main(String[] agrs) {
		double pi = 3.1415;
		float pi1; 
		// 작은 형태의 데이터를 기억할 변수에 
		// 큰 형태의 데이터를 기억하는 경우는 에러가 발생한다.
		// 담을 그릇이 더 크기 때문에 넘쳐나서 문제가 된다.
		// 이때 해결 방법은 
		//	1. 강제형변환. 2. 리터널 형변환 이 있다.
		
		// 리터널 형변환
		pi1 = 3.14F; // 이 경우 3.14는 float 형태로 리터널 풀에 기억하게 된다.
		
		// 강제 형변환
		float pi2 = (float) pi; 
		// 이 경우는 pi에 기억된 데이터는 double 형태의 데이터이기 때문에 안된다.
		// 강제로 데이터의 형태를 변형해서 기억시키는 방법이 강제 형변환이다.
		
		long no = 10L;
		
		int no1;
		no1 = (int) no;
		
		short no2;
		no2 = (short) no;
		
		System.out.println(pi);
		
		
	}
}
