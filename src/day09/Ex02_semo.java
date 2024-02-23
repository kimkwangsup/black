package day09;

public class Ex02_semo {
/*
 	삼각형의 정보를 기억할 
 	Semo 클래스를 제작하고
 	이 클래스를 이용해서
 	랜덤한 10개의 삼각형을 기억하고 정보를 출력하세요.
 */
	public static void main(String[] args) {
		Semo[] sam = new Semo[10];
		// Semo 클래스를 10개 기억할 방만 준비되어 있는 상태
		// 따라서 매방마다 Semo를 만들어서 채워줘야 한다.
		/*
		for(int i = 0 ; i < 10 ; i++) {
			int ga = (int)(Math.random() * (10 - 1 + 1) + 1);
			int se = (int)(Math.random() * (10 - 1 + 1) + 1);
			Semo n = new Semo(ga, se);
			n.calcArea();
			sam[i] = n;
			System.out.printf("%2d번째 세모의 가로 : %2d, 세로 : %2d, 넓이 : %4.2f\n",
					i + 1, n.garo, n.sero, n.area);
		}
		*/
		/*
		for(int i = 0 ; i < 10 ; i++) {
			sam[i] = new Semo();
		}
		*/
		
		Semo[] samgak = new Semo[10];
		// 열 개의 세모를 만들어서 채워넣는다.
		for(int i = 0 ; i < 10 ; i++) {
			// 밑변과 높이를 랜덤하게 만들고
			int garo = (int)(Math.random() * 20 + 1);
			int sero = (int)(Math.random() * 20 + 1);
			// 세모를 밑변과 높이를 입력해서 만들어준다.
			samgak[i] = new Semo(garo, sero);
		}
		for(Semo s : samgak) {
			System.out.printf("밑변 : %2d, 높이 : %2d, 넓이 : %5.1f\n", 
					s.garo, s.sero, s.area);
		}
	}

}
