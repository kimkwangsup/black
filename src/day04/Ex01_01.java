package day04;

/*
	랜덤하게 0 ~ 100 까지의 숫자를 세개를 발생시켜서 
	1. 큰 숫자만 출력해주는 프로그램을 작성하세요.		
*/
public class Ex01_01 {
	
	public static void main(String[] args) {
		// 랜덤한 숫자 세개 만들기
		int no1 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (100 - 1 + 1) + 1);
			
		
//		System.out.println("랜덤숫자 세개 : "+no1 + " , " +no2+" , "+ no3 );
		
		int max, mid, min;
		max = mid = min = -1;
		
		if(no1 > no2) {
			// no1 이 no2 보다 큰 경우
			if(no1 > no3) {
				// no1 은 no2 보다는 당연히 크고 no3 보다도 큰 경우
				// no1 이 세 수 중에 제일 큰 경우
				max = no1;
				// 그런데 아직 mid 와 min 은 아직 결정되지 않은 상태
				// min 와 mid 를 판별해 줘야 한다.
				if(no2 > no3) {
					mid = no2;
					min = no3;
				}else {
					mid = no3;
					min = no2;
				}
			} else {
				// no1 이 no2 보다 크고 no3 보다 작거나 같은 경우
				// no2 < no1 <= no3
				max = no3;
				mid = no1;
				min = no2;
			}
		} else {
			// no2 가 no1 보다 크거나 같은 경우
			// no2 >= no1
			if(no2 > no3) {
				// no2 가 no1 보다 크거나 같고 no3 보다 큰 경우
				max = no2;
				if(no1 > no3) {
					mid = no1;
					min = no3;
				} else {
					mid = no3;
					min = no1;
				}
			} else {
				// no2 가 no1 보다 크거나 같고
				// no3보다 작거나 같은 경우
				// no1 <= no2 <= no3
				max = no3;
				mid = no2;
				min = no1;
			}
		}
			
		System.out.printf("랜덤하게 발생한 세 수 %3d, %3d, %3d 중 %n"+
						"제일 큰수는 %3d 이고 %n"+"중간 숫자는 %3d 이고 %n"+
						"작은 숫자는 %3d 이다. %n", no1, no2, no3, max, mid, min);
//		System.out.println("순서대로 나열 : " +max +  " , " +mid+" , "+ min );
		
	}
		
		
	
  }




	
