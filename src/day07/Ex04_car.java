package day07;

/*
 	마티즈과 그랜져가 치킨게임을 한다. 
 	마티즈는 1.5km/m 으로 진행하고
 	그랜져는 반대 방향에서 2.41km/m 으로 진행한다.
 	
 	과연 두 차량은 언제 사고가 났는지 분을 계산해서 출력하세요.
 	
 	단, 두 차량의 처음 간격은 10km로 한다.
 */
public class Ex04_car {

	public static void main(String[] args) {
		int dist = 10;
		double mt = 1.5;
		double gd = 2.41;
		
		int min = 1;
		while(true) {
			
			if(mt * min > dist - gd * min) {
				// 만난 후 이므로 즉시종료
				break;
				
			}
			min++; // 시간 증가
		}
		System.out.println("두 차량은 " + min + " 분 후 만났습니다.");
		
	}
}
