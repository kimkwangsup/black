package day13;

public class Test01_Abstract {
/*
	추상클래스
	
	==> 추상 함수를 0개 이상 가지고 있는 함수
		추상 함수가 1개도 없어도 추상클래스를 만들 수 있다.
		추상 함수가 1개라도 있으면 반드시 추상클래스로 만들어야 한다.
		
		추상함수란?
		==> 함수의 몸체(블럭, {})가 없는 함수.
			즉, 아직 기능이 정해지지 않은 함수.
			
			형식 ]
				
				[접근지정자] abstract 반환값타입 함수이름(매개변수리스트);
				
				예 ]
					Figure class
					public abstract double getArea();
					
					==> Semo class
					public double getArea(){
						return width * height * 0.5;
					}
					
					==> Nemo class
					public double getArea(){
						return width * height;
					}	
					
					==> Circle class
					public double getArea(){
						return rad * rad * 3.14;
					}
					
		추상 클래스 만드는 방법 ]
			
			형식 ]
				
				[접근지정자] abstract class 클래스이름 {
					변수
					일반함수(몸체(블럭, {})이 있는 함수)
					추상함수가 0개 이상
				}
		
		
 */
	public Test01_Abstract() {
		Figure[] fig = new Figure[10];
		// 랜덤하게 3, 4 를 발생시켜서 
		// 3은 세모, 4는 네모를 만들어서 배열에 추가
		for(int i = 0 ; i < fig.length ; i++) {
			// 도형 형태 정하기
			int t = (int)(Math.random() * 2 + 3);
			
			// 가로, 세로 랜덤하게
			int width = (int)(Math.random() * 20 + 1);
			int height = (int)(Math.random() * 20 + 1);
			
			if(t == 3) {
				// Semo 만들고
				fig[i] = new Semo(width, height); 
				// Semo 객체가 Figure 타입으로 자동형변환
			}else {
				// Nemo 만들고
				fig[i] = new Nemo(width, height);
				// Nemo 객체가 Figure 타입으로 자동형변환
			}
		}
		
		for(Figure f : fig) {
			System.out.println(f.toString());
		}
	}
	
	public static void main(String[] args) {
		new Test01_Abstract();
	}

}
