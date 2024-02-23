package day17;

public class Test01_Equals {
/*
	Figure 를 상속받아서 
	반지름, 넓이, 둘레를 가지는 클래스를 7개 채우는 배열을 완성하세요.
	단, 중복은 없도록 채우세요. 
 */
	public Test01_Equals() {
		Figure[] fig = new Figure[7];

		loop:
		for(int i = 0 ; i < fig.length ; i++) {
			int rad = (int)(Math.random() * 10 + 1);
			
			Circle c = new Circle(rad);
			// 중복검사
			for(int j = 0 ; j < i ; j++) {
				Circle c1 = (Circle)fig[j];
				if(c.equals(c1)) {
					// 중복된 원이 이미 추가된 경우
					i--;
					continue loop;
				}
			}
			// 이 행을 실행하는 경우는 중복검사를 통과한 경우
			// 중복된 원이 없는 경우
			fig[i] = c;
		}
		// 정보출력
		for(Figure f : fig) {
			System.out.println(f);
		}
	}	
	public static void main(String[] args) {
		new Test01_Equals();
		
		/*
		Figure[] f = new Figure[5];
		// 무명 내부 클래스로 객체 채우기
		for(int i = 0 ; i < 5 ; i++) {
			f[i] = new Figure() {

				@Override
				public double setArea() {
					return 0;
				}

				@Override
				public int getRad() {
					return 0;
				}
				
			};
		}
		for(Figure ff : f) {
			System.out.println(ff.getRad());
		}
		*/
	}	
	
	public class Circle implements Figure{
		private int rad;
		private double area, arround;
		public Circle() {}
		public Circle(int rad) {
			this.rad = rad;
			setArea();
			setArround();
			
		}
		
		@Override
		public double setArea() {
			return rad * rad * 3.14;
		}
		@Override
		public int getRad() {
			return rad;
		}
		public double getArea() {
			return area;
		}
		public void setArea(double area) {
			this.area = area;
		}
		public double getArround() {
			return arround;
		}
		public void setArround(double arround) {
			this.arround = arround;
		}
		public void setArround() {
			arround = 2 * rad * 3.14;
		}
		public Figure setRad(int rad) {
			this.rad = rad;
			return this;
		}
		@Override
		public boolean equals(Object o) {
			Circle c = (Circle)o;
			int r = c.getRad();
			
			return (rad == r);
		}
		@Override
		public String toString() {
			return "반지름이 [" + rad + "] 인 원";
		}
	}
}

interface Figure{
	double setArea();
	int getRad();
	Figure setRad(int rad);
}
