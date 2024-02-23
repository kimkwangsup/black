package day13;

import java.util.*;
public class Test02_Abstract {
/*
	추상 클래스 사용 방법
	==> 추상 클래스는 스스로 new 시킬 수 없다.
		즉, 추상 함수가 한 개라도 존재하면 강제로 추상클래스로 만들어야 하고
		추상함수가 한 개라도 있다는 말은
		아직 미완성인 함수가 존재한다는 의미이므로
		이 클래스를 객체로 만들기에는 부족하다는 이야기이다.
		
		해결방법 ]
			1. 다른 클래스에 상속해준 후 
				그 클래스의 객체를 받아서 사용하면 된다.
				
				예 ]
					Figure f = new Semo();
					f.getArea();
				
				==> 실무에서 이렇게 사용하는 경우는 10% 미만이다.
				
			2. API 에서 제공해주는 클래스들 중 추상 클래스를 사용하는 방법은
				해당 클래스 내부에
					속성이 static 이면서 반환값이 자기 자신인 함수가 존재하는데
				그 함수를 사용하면 된다.
				==> 이런 함수를 "공장함수" 라 칭한다.
					공장함수
						속성		: static
						반환값 타입 : 자기 자신
						
		참고 ]
			추상 클래스가 아님에도 불구하고 
			생성자 함수가 존재하지 않는 클래스가 있다.
			이런 클래스들은 생성자 함수가 없는 것이 아니고
			생성자 함수에 접근지정자를 private 으로 감춰놓은 클래스들 이다.
			따라서 이런 클래스들 역시 위의 2번 방법으로 사용하면 된다.
				
 */
	
	
	public Test02_Abstract() {
//		Calendar cal = new Calender(); 
		// Calendar 클래스는 추상 클래스 이므로 new 시킬 수 없다.
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR) + "년 " + 
							(cal.get(Calendar.MONTH) + 1) +  "월 " + 
							cal.get(Calendar.DATE) + "일");
		
		Moyang mo = Moyang.getInstance();
		
		Moyang m1 = new M1();
	
	}

	public static void main(String[] args) {
		new Test02_Abstract();
	}

}
