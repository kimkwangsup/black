package proj.sql;

import java.text.*;
import java.util.Date;

public class FormatClass {

	/*
		형식화 클래스
		==> 데이터를 형식에 맞춰서 출력하기 위한 목적으로 사용되어지는 클래스
			형식이 지정된 문자열을 만들어주는 클래스
			
			1. DecimalFormat
			==> 숫자를 형식을 지정해서 문자열로 만들어주는 클래스
			
				생성방법 ]
					DecimalFormat(String pattern)
					==> 
						pattern : 숫자를 어떤 형태의 문자열로 만들것인지 형식을 지정
						
				주요함수 ]
					format(double number)
					==> 숫자를 형식에 맞춰서 문자열로 변환 시켜주는 함수
					
				참고 ]
					패턴 지정 방법
						0		- 한 자리 숫자를 의미하고 무효숫자도 표현
						#		- 한 자리 숫자를 의미하고 무효숫자는 표현하지 않는다.
						.		- 소수점 위치
						,		- 3자리마다 , 표시하도록
						-		- 음수일 경우 - 부호의 위치
						E		- 실수의 경우 지수 형태로 표현
						:		- 패턴을 구분
									(양수일 경우와 음수일 경우를 구분해서 처리 할 경우 사용)
						%		- 백분율
						\u00a4	- 화폐단위
			
			2. SimpleDateFormat
			==> 날짜 데이터를 원하는 형식의 문자열로 변환해주는 함수
			
				패턴
					G		: 연대 (AD | BC)
					y		: 년도
					M		: 월(1 ~ 12월)
					w		: 년의 몇번째 주(1 ~ 53주)
					W		: 월의 몇번째 주
					D		: 년의 몇번째 일(1 ~ 366)
					d		: 월의 몇번째 일(1 ~ 31)
					F		: 월의 몇번째 요일(1 ~ 5)
					E		: 요일
					a		: 오전 | 오후		
					H		: 시간(0 ~ 23)
					h		: 시간(1 ~ 12)
					K		: 시간(0 ~ 11)
					k		: 시간(1 ~ 24)
					m		: 분(0 ~ 59)
					S		: 1000분의 1초(0 ~ 999)
					s		: 초(0 ~ 59)
					Z		: TimeZone(RFC 822 Time Zone)
					z		: TimeZone(General Time Zone)
					'		: 이스케이프문자로 특수문자를 표현할 때 사용
					
					
					y		: 년도
					M		: 월(1 ~ 12월)
					d		: 월의 몇번째 일(1 ~ 31)
					H		: 시간(0 ~ 23)
					m		: 분(0 ~ 59)
					s		: 초(0 ~ 59)
					
			3. ChoiceFormat
			
			4. MessageFormat
	 */
	public FormatClass() {
		DecimalFormat form = new DecimalFormat("00,000,000.00");
		
		String snum = form.format(12345.6789);
		System.out.println(snum);
		
		SimpleDateFormat form2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String snow = form2.format(new Date());
		
		System.out.println("현재시간 : " + snow);
	}
	public static void main(String[] args) {
		new FormatClass();
	}
}
