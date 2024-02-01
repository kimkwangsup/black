package day04;

/*
 	1 ~ 99 까지의 랜덤한 숫자 하나를 만들어서
 	나이라고 가정하고
 	나이대가 어떻게 되는지 판별해주는 프로그램을 작성하세요.
 	나이대는
 		유년기
 		10대
 		20대
 		30대
 		40대
 		장년기
 	로 구분 처리하세요.
 */
public class Test01_if_switch {
	public static void main(String[] args) {
		int age = (int)(Math.random() * (99 - 1 + 1) + 1);
		
		String result = "";
		/*
		if(age >= 50) {
			if(age > 80) {
			
			} else {
				// 50 <= age & age < 80
				// 참고 ]
				// 		대소 비교를 할 때 동시에 두개의 연산자를 처리할 수 없다.
				//		50 <= age < 80   <===== X
			}
			result = "장년기" ;
		} else if(age >= 40) {
			result = "40대";
		} else if(age >= 30) {
			result = "30대";
		} else if(age >= 20) {
			result = "20대";
		} else if(age >= 10) {
			result = "10대";
		} else {
			result = "유년기";
		}
		*/
		
		
		
		switch(age / 10) {
		case 0:
			result = "유년기";
			break;
		case 1:
			result = "10대";
			break;
		case 2:
			result = "20대";
			break;
		case 3:
			result = "30대";
			break;
		case 4:
			result = "40대";
			break;
		default:
			result = "장년기";
		}
		
		System.out.printf("랜덤하게 만든 나이 %2d세는 %3s 입니다.", age, result);
		// System.out.println("1 ~ 99 까지의 랜덤한 나이는 : " + age);
		// System.out.println("나이대 : " + result);
		
	}
}
