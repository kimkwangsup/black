package day08;
import java.util.ArrayList;
import java.util.Arrays;
/*
			1.
				79456 원을 지불하려 하는데
				위에 준비된 화폐 단위로 몇장씩 지불해야 하는지
				계산해서 출력해주는 프로그램을 작성하세요.
			
			2.
				지불될 화폐의 장수를 기억할 배열을 만들어서
				채우고 내용을 출력하세요.
				
			
 */

public class Ex01_payment {

	public static void main(String[] args) {
		int[] coin = {
				10000, 5000, 1000, 500, 100, 50, 10, 1
		};
		int[] pay = new int[coin.length];
		
		int money = 79456;
		int mon = money;
		// 1.
		System.out.println("1. ");
		System.out.println(money + "원을 지불할 때 필요한 화폐의 갯수는");
		
		for(int i = 0 ; i < coin.length ; i++) {
			pay[i] = mon / coin[i];
			mon = mon - (coin[i] * pay[i]);
			System.out.printf("%5d원 : %d개", coin[i], pay[i]);
			System.out.println();
		}	
		System.out.println("2.");
		System.out.println(Arrays.toString(pay));
		
	}
}
