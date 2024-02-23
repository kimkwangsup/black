package day17;

public class Test02_Equals {

	public Test02_Equals() {
		Figure[] fig = new Figure[7];
		
		loop:
		for(int i = 0 ; i < fig.length ; i++) {
			// 반지름 만들기
			int rad = (int)(Math.random() * 10 + 1);
			
			fig[i] = (new Figure() {
				public int rad;
				public double area, arround;
				@Override
				public double setArea() {
					area = rad * rad * 3.14;
					return area;
				}
				@Override
				public int getRad() {
					return rad;
				}
				@Override
				public Figure setRad(int rad) {
					this.rad = rad;
					area = rad * rad * 3.14;
					arround = 2 * rad * 3.14;
					
					return this;
				}
				@Override
				public boolean equals(Object o) {
					Figure f = (Figure)o;
					int r = f.getRad();
					return rad == r;
				}
				@Override
				public String toString() {
					return "반지름이 [" + rad + "]인 Circle";
				}
			}).setRad(rad);
			// 반지름 셋팅
//			fig[i].setRad(rad);
			
			// 중복검사
			for(int j = 0 ; j < i ; j++) {
				Figure f = fig[j];
				if(fig[i].equals(f)) {
					// 중복된 원이 있는 경우
					i--;
					continue loop;
				}
			}
		} // 배열에 채우기 완료
		
		// 정보 출력
		for(Figure f : fig) {
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
		new Test02_Equals();
	}

}
