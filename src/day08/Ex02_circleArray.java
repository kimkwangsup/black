package day08;
import java.util.ArrayList;
import java.util.Arrays;

/*
	1.
		반지름(1 ~ 20) 5개를 기억할 배열을 만들고
		랜덤하게 반지름을 채워서
		원의 넓이, 둘레를 출력하는 프로그램을 작성하세요.
	
	2. 
		double[][] circle = new double[3][5];
		의 배열에
			반지름,
			둘레,
			넓이
		를 기억시키고 출력하세요.
		
	3. 
		2번에서 완성한 2차열 배열을
				
			double[][] dongl = new doubl[5][3];
					
		dongl 배열에 채워넣으세요.
 */
public class Ex02_circleArray {

	public static void main(String[] args) {
		double[][] circle = new double[3][5];
		double pi = 3.14;
		double[] won = new double[5];
		double[] won1 = new double[won.length];
		double[] won2 = new double[won.length];
		double[][] dongl = new double[5][3];
		
		// 1.
		System.out.println("1. ");
		for(int i = 0 ; i < won.length ; i++) {
			won[i] = (int)(Math.random() * (20 - 1 + 1) + 1);
			won1[i] = won[i] * pi * 2;
			won2[i] = pi * won[i] * won[i];
			System.out.printf("반지름이 [%3.2f]인 원의 둘레는 [%3.2f]이고, 그 넓이는 [%4.2f]입니다.", won[i], won1[i], won2[i]);
			System.out.println();
			circle[0][i] = won[i];
			circle[1][i] = won1[i];
			circle[2][i] = won2[i];

		}
		
		System.out.println();
		System.out.println("2. ");
		for(int i = 0 ; i < 3; i++) {
		System.out.println(Arrays.toString(circle[i]));
		
		
		}
		System.out.println("3. ");
		
		
//		double abs = 0;
//		for(int i = 0 ; i < 3 ; i++) {
//			for(int j = 0 ; j < 5 ; j++) {
//				circle[i][j] = abs;
//				abs = dongl[j][i];
//			}
//		}	
//		System.out.println(dongl[1][2]);
		
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				dongl[j][i] = circle[i][j];
			}
		}
	
		for(double[] dg : dongl) {
			System.out.println(Arrays.toString(dg));
		}
	}
}
