package day03;

/*
	1년 정확하게는 365.2426 이다.
	이것은 몇일 몇시간 몇분 몇초인지 출력하세요.
*/
public class Ex01_02 {
	public static void main(String[] args) {
		double year = 365.2426;
		
		int day = (int) year;
		double tmp = year - day;
		
		// 시간
		int hour = (int)(tmp * 24);
		tmp = tmp * 24 - hour;
		
		// 분
		int min = (int)(tmp * 60);
		tmp = tmp * 60 - min;
		
		// 초
		int sec = (int)(tmp * 60);
		
		System.out.println("1년은 정확하게");
		System.out.println("일   : " + day);
		System.out.println("시간 : " + hour);
		System.out.println("분   : " + min);
		System.out.println("초   : " + sec);
	}
}
