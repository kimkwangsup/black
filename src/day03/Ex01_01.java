package day03;

/*
	1년 정확하게는 365.2426 이다.
	이것은 몇일 몇시간 몇분 몇초인지 출력하세요.
*/
public class Ex01_01 {
	public static void main(String[] args) {
		double exYear = 365.2426;
		
		// 년도는 exYear 를 정수로 변환하면 된다.
		
		int days = (int)exYear;
		
		// 일을 제외한 데이터
		double calData = exYear - days;
		
		/* 
		 	방법 ] 
		 		일 수를 제외한 숫자를 초 단위로 변환한다.
		 		그 다음 초부터 잘라서 기억해 나간다.		
		*/
		// 초 단위로 변환
		// 하루를 초로 변환하면 24 * 60 * 60 가 된다.
		int tmp =(int)(calData * 24 * 60 * 60);
		// calData가 double이므로 연산 결과를 강제형변환 해줘야한다.
		// 초
		int sec = tmp % 60;
		tmp = tmp / 60 ; // 분으로 변환. => tmp /= 60;
		// 분
		int min = tmp % 60;
		tmp = tmp / 60; // 시간으로 변환
		// 시간
		int hour = tmp;
		// 출력
		
		System.out.println("1년은 정확하게");
		System.out.println("일   : " + days);
		System.out.println("시간 : " + hour);
		System.out.println("분   : " + min);
		System.out.println("초   : " + sec);
	}
}
