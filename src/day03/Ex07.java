package day03;

/*
 	랜덤하게 숫자 하나를 발생시켜서
 	그 숫자에 가장 가까운 10의 배수를 찾아서 출력해주는 프로그램을 작성하세요.
 	
 */
public class Ex07 {
	public static void main(String[] args) {
		// 랜덤한 숫자 생성
		int num = (int)(Math.random() * (99- 1 + 1 ) + 1);
		// 10으로 나눈 나머지
		int rest = num % 10;
		// 10으로 나눈 몫
		int result = num / 10;
		
		// 조건처리
		/*
		  // 1. 삼항 조건 처리연산자
		 
		result = (rest >= 5) ? (result + 1) * 10 : result * 10;
		*/
		
		// 2. if
		/*		
				if(rest >= 5) {
					result = (result + 1) * 10;
				}
					result *= 10;
		*/
		
		// 3. if - else
		/*
		if(rest < 5) {
			result = result * 10;
		} else {
			result = (result + 1) * 10;
		}
		
		*/
		/*
		// if - else if - else
		if(rest < 5) {
			result = result * 10;
		} else if(rest >= 5) {
			result = (result + 1) * 10;
		} 
		
		*/
		
		
		
		// 5. switch - case
		
		switch(rest / 5) {
		case 0:
			result = result * 10;
			break;
		case 1:
			result = (result + 1) * 10;
			break;
		
		}
		// 결과 출력
		System.out.println("랜덤한 숫자      : " + num);
		System.out.println("가까운 10의 배수 : " + result);
		
		
		
		
		
		/*
		// int num2 = (num / 10) * 10;
		
		int num2 = ((num + 5) / 10) * 10;
		 
		// int num3 = num2 * 10;
		
		// System.out.println("랜덤한 숫자 " + num + "에 가장 가까운 10의 배수는 " + num2 + "입니다.");
		
		// System.out.print(num2);
		
		System.out.printf("랜덤한 숫자 %2d에 가장 가까운 10의 배수는 %2d 입니다.", num, num2);
		*/
		
		
		
	}
}
