package proj.sql;

import java.text.*;
import java.util.*;

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
			==> switch - case 등을 이용해야 하는 경우에 
				이것을 간소화시키기 위한 방법
				
				생성방법 ]
					ChoiceFormat(double[] limits, String[] formats)
					
						double[] limits  : 치환된 범위
						String[] formats : 치환할 문자 
				
			4. MessageFormat
			==> 특정 문자열에 특정 위치의 내용만 변경되는 경우
				문자열 전체를 다시 만들지 않고
				변경되는 내용만 변화시켜서
				문자열을 만들어주는 클래스
				
				예 ]
				 
					insert 명령의 경우
					
					"INSERT INTO board VALUES( brdSeq.NEXTVAL, '첫번째', '첫번째 내용') "
					"INSERT INTO board VALUES( brdSeq.NEXTVAL, '두번째', '두번째 내용') "
					"INSERT INTO board VALUES( brdSeq.NEXTVAL, '세번째', '세번째 내용') "
					
					자바에서 처리를 하려면
					매번 다시 문자열을 만들어야 하는데 불편함이 있다.
					이것을 해결해주는 클래스가 MessageFormat 클래스이다.
					
					참고함수 ]
						parse(String source)
						==> 주어진 문자열 중에서 실제 변화되는 데이터 부분만 
							알아내는 함수
					
	 */
	public FormatClass() {
		DecimalFormat form = new DecimalFormat("00,000,000.00");
		
		String snum = form.format(12345.6789);
		System.out.println(snum);
		
		SimpleDateFormat form2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String snow = form2.format(new Date());
		
		System.out.println("현재시간 : " + snow);
		
		// ChoiceFormat
		double[] limits = {0, 60, 70, 80, 90, 1001};
		/*
			주의사항 ]
				limits를 만들 때
				반드시 오름차순 정렬이 되어야 한다.
				
				formats를 만들때는
				반드시 limits 의 갯수와 동일한 갯수로 만들어야 한다.
		 */
		String[] formats = {"F", "D", "C", "B", "A", "S"};
		
		String pattern = "0#F|60#D|70#C|80#B|90#A|1000<S";
		/*
			60#D   ==> " <= " 의 의미 : 60보다 크거나 같으면 D
			1000<S ==> " < " 의 의미  : 1000보다 크면 S
		 */
		ChoiceFormat cForm = new ChoiceFormat(limits, formats);
		ChoiceFormat cForm2 = new ChoiceFormat(pattern);
		// 
		int score = 1000;
		int luffy = 3000;
		System.out.println("쵸파 : " + cForm2.format(score));
		System.out.println("루피 : " + cForm2.format(luffy));
		
		// MessageFormat
		/*
			문자열을 만드는데
				
				이름 : 지수, 나이 : 29
				
				이름 : 제니, 나이 : 28
				
				이름 : 로제, 나이 : 27
				
				이름 : 리사, 나이 : 26
		 */
		System.out.println("######################################################");
		MessageFormat mForm = new MessageFormat("이름 : {0}, 나이 : {1}");
		
		Object[] jisoo = {"지수", 29};	
		
		String jsoInfo = mForm.format(jisoo);
		System.out.println(jsoInfo);
				
				
		Object[][] data = {
				{"지수", 29},	
				{"제니", 28},	
				{"로제", 27},	
				{"리사", 26}	
		};
		String [] memb = new String[4];
		for(int i = 0 ; i < memb.length ; i++) {
			memb[i] = mForm.format(data[i]);
		}
		System.out.println("=====================================================");
		for(String s : memb) {
			System.out.println(s);
		}
		
		
	}
	public static void main(String[] args) {
		new FormatClass();
	}
}
