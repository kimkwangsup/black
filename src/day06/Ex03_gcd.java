package day06;

/*
	문제 3 ]
		두 정수를 입력받아서
		두 수의 최대 공약수를 구해서 출력하세요.
		
		참고 ]
			최대 공약수 :
				두 수의 약수 중 제일 큰 수
 */
import java.util.*;
public class Ex03_gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sno1 = 0;
		System.out.print("첫 번째 정수 입력 : ");
		sno1 = sc.nextInt();
		int sno2 = 0;
		System.out.print("두 번째 정수 입력 : ");
		sno2 = sc.nextInt();
		
		
		int tmp, max, min;
		if(sno1 > sno2) {
			max = sno1;
			min = sno2;
		}else {	
			max = sno2;
			min = sno1;
		}
		int i = 1;
		int tri = 0;
		while(i <= sno1 && i <= sno2){
			if(sno1 % i == 0 && sno2 % i == 0) { //두수가 모두 0으로 나누어떨어지는 경우
				tri = i;
			}
			i++;
		}
		System.out.println("두 수의 최대공약수 : "+tri);
		

	}
}