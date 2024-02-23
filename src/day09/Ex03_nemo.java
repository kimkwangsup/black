package day09;

import java.util.Arrays;

public class Ex03_nemo {
/*
	Nemo 클래스 제작하고
	랜덤 10개를 기억할 배열을 만들어서 채우고
	정보를 출력하세요
 */
	public static void main(String[] args) {
		Nemo[] squ = new Nemo[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			int ga = (int)(Math.random() * (10 - 1 + 1) + 1);
			int se = (int)(Math.random() * (10 - 1 + 1) + 1);
			Nemo n = new Nemo(ga, se);
			n.setArea();
			squ[i] = n;
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			
			System.out.printf("%2d번째\n네모의 가로 : %2d, 세로 : %2d, 넓이 : %4d\n",
					i + 1, squ[i].garo, squ[i].sero, squ[i].area);
		}
	}

}
