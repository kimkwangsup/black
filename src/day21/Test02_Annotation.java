package day21;

import java.util.*;
public class Test02_Annotation {
/*
	어노테이션
	==> 내부적으로 약속된 실행을 자동으로 처리하도록 하는 명령의 일종이다.
	
		주로
			화면에 보여지는 실행이 아니고
			점검한다던지...
			
			선언적인 실행(이 클래스는 XXXX로 작동해야 한다.)
			의 의미를 가진 명령을 말한다.
			
		@Override
		@SuppressWarnings("rawtypes")
		
		@Controller
		@RequestMapping()
		등등...
 */

	public Test02_Annotation() {
	}

	public static void main(String[] args) {
		new Test02_Annotation();
	}
	
	@Override
	public String toString() {
		return "난 오버라이드된 함수 " ;
	}
}
