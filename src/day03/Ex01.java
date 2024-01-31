package day03;

/*
 	1년 정확하게는 365.2426 이다.
 	이것은 몇일 몇시간 몇분 몇초인지 출력하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		double day, hour, min, sec;
		
		day = 365.2426;
		hour = day * 24;
		min = hour * 60;
		sec = min * 60;
		
		
		int sday, shour, smin, ssec;
		sday = (int)day;
		shour = (int)hour - ((int)day * 24);
		smin = (int)min - ((int)hour * 60);
		ssec = (int)sec - ((int)min * 60);
		
		
		
		// System.out.print("1년은 " + (int)day + "일 ");
		// System.out.print("");
		// System.out.println(hour);
		// System.out.print("1년은 ");
		// 시간
		
		
		System.out.println("1년은 " + sday + "일 " + shour + "시간 " + smin + "분 " + ssec + "초 입니다.");
		/*
		System.out.println("1년은 " + sday + "일");
		System.out.println("1년은 " + shour + "시간");
		System.out.println("1년은 " + smin + "분");
		System.out.println("1년은 " + ssec + "초");
		*/
		
		// 분
		
		// 초
		
		
	}
}
