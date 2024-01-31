package day02;

/*
 	main 함수를 작성하고
 	실행 내용은 
 	
 		오늘 데이터
 			날짜					문자열
 			수업시작후 일 수		정수
 			오늘 수업 시간 수		정수
 			오늘 요일				문자
 			오늘 출석 여부			논리형
 		를 기억할 변수를 만들고
 		그 변수들을 출력하세요.
 */

public class Ex01 {
	public static void main(String[] args) {
		String today = "2024년 01월 31일";
		int day = 3;
		int time = 8;
		char week = '수';
		boolean check = true;
		
		
			System.out.println("오늘 데이터");
			System.out.println("오늘 날짜 : " + today);
			System.out.println("수업 일수 : " + day + "일");
			System.out.println("수업 시간 : " + time + "시간");
			System.out.println("오늘 요일 : " + week + "요일");
			System.out.println("출석 여부 : " + check);
			
		
	}
}
