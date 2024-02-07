package day07;
import java.util.*;
/*
	랜덤하게 알파벳 소문자('a' ~ 'j') 100개를 만들어서
	각 문자가 몇번씩 만들어졌는지 출력하세요.
 */

public class Test05_count {
	public static void main(String[] args) {
		// 배열 준비
		char[] ch = new char[10];
		// 알파벳 채우고
		// 'a' <-- (char)('a' + 0)
		// 'b' <-- (char)('a' + 1)
		// ...
		// 'j' <-- (char)('a' + 9)
		for(int i = 0 ; i < 10 ; i++) {
			ch[i] = (char)('a' + i);	
		}
		/*
		// 1. 변수 10개를 이용하는 방법
		// 변수 선언
		int a, b, c, d, e, f, g, h , i, j;
		// 변수 초기화
		a = b = c = d = e = f = g = h = i = j = 0;
	
		for(int z = 0 ; z < 100 ; z++) {
			// 랜덤하게 문자만들기
			char tmp = (char)('a' + Math.random() * 10);
			
			switch(tmp) {
			case 'a':
				a += 1;
				break;
			case 'b':
				b += 1;
				break;
			case 'c':
				c += 1;
				break;
			case 'd':
				d += 1;
				break;
			case 'e':
				e += 1;
				break;
			case 'f':
				f += 1;
				break;
			case 'g':
				g += 1;
				break;
			case 'h':
				h += 1;
				break;
			case 'i':
				i += 1;
				break;
			case 'j':
				j += 1;
				break;
			}
		}
		// 출력
		System.out.print(ch[0] + " : ");
		for(int k = 0 ; k < a ; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(ch[1] + " : ");
		for(int k = 0 ; k < b ; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(ch[2] + " : ");
		for(int k = 0 ; k < c ; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(ch[3] + " : ");
		for(int k = 0 ; k < d ; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(ch[4] + " : ");
		for(int k = 0 ; k < e ; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(ch[5] + " : ");
		for(int k = 0 ; k < f ; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(ch[6] + " : ");
		for(int k = 0 ; k < g ; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(ch[7] + " : ");
		for(int k = 0 ; k < h ; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(ch[8] + " : ");
		for(int k = 0 ; k < i ; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(ch[9] + " : ");
		for(int k = 0 ; k < j ; k++) {
			System.out.print("*");
		}
		System.out.println();
		*/
		// 문자들의 카운트를 기억할 배열
		// 'j' 카운트 인덱스 : 'j' - 'a' = 9;
		int[] count = new int[10];
		
		for(int i = 0 ; i < 100 ; i++) {
			char tmp = (char)('a' + Math.random() * 10);
			// 만들어진 문자의 카운트 인덱스
			// 'a' - 'a' = 0
			// 'b' - 'a' = 1			
			int idx = tmp - 'a';
			count[idx] = count[idx] + 1;
		}
		/*
		// 출력
		for(int i = 0 ; i < ch.length ; i++) {
			// 문자 꺼내서 출력
			System.out.print(ch[i] + " : ");
			// 카운트 만큼 별출력
			for(int j = 0 ; j < count[i] ; j++) {
				System.out.print("*");
			}
			// 카운트만큼 별이 출력이 됐으니 줄바꿈 해준다.
			System.out.println();
		}
		*/
		
		// 두 개를 한 개의 배열에 저장해서 처리하는 방법
		int[][] arr = new int[2][10];
		
//		arr[0] = ch; // heap 타입이 달라서 에러..
		for(int i = 0 ; i < 10 ; i++) {
			arr[0][i] = 'a' + i;
			}
		/*
		  	참고 ] 
		  		위 배열에서 꺼내온 데이터들의 형태
		  		
		  			arr 		: 2차원 배열(배열안에 배열이 채워져 있는 형태)
		  			arr[0] 		: arr 첫번째 방에 들어있는 데이터 10개를 기억하는 배열
		  			arr[0][0]	: arr 첫번째 방의 배열의 첫번째 숫자 
		  			 
		  			
		 */
		
		
		
		arr[1] = count;
		
		// 출력
		for(int i = 0 ; i < 10 ; i++) {
			// 문자 꺼내고 출력
			System.out.print((char)arr[0][i] + " : ");
			// 카운트만큼 별 출력
			for(int j = 0 ; j < arr[1][i] ; j++) {
				System.out.print("*");
			}
			
			// 줄바꿈
			System.out.println();
			
		}
		
 	}
}


