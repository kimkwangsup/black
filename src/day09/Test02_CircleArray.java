package day09;

public class Test02_CircleArray {
/*
	Circle 타입의 데이터를 5개 관리하는 배열을 만들어서
	정보를 출력해보자.
	
 */
	public static void main(String[] args) {
		Circle[] won = new Circle[5];
		
		// 각 방에 Circle 을 만들어서 채워넣는다.
		for(int i = 0 ; i < 5 ; i++) {
			// 원의 반지름 준비
			int r = (int)(Math.random() * 20 + 1);
			// 원 만들기
			Circle c = new Circle(r);
			// 원의 둘레 세팅
			c.setArround();
			// 원의 면적 세팅
			c.setArea();
			// 배열의 각 방에 채워넣는다.
			won[i] = c;
			
		}
		
		// 정보 출력
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("%d번째 원의 반지름 : %2d, 둘레 %6.2f, 넓이 : %7.2f\n",
								i + 1, won[i].rad, won[i].arround, won[i].area);
		}
	}

}
