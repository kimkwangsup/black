package day16;


public class Test05_Equals {

	public Test05_Equals() {
		// Box 5개를 중복없이 기억할 배열을 만들고
		// 내용을 출력해보자
		Box[] box = new Box[5];
		
		// 아직 배열 안에 채워진 것이 없기 때문에 Box를 만들어서 채워준다.
		int cnt = 0; // 카운트 확인용 변수
		loop:
		for(int i = 0 ; i < box.length ; i++) {
		
			// Box 객체를 만들어서 채워준다
			// 가로 세로를 랜덤하게 만든다
			int width = (int)(Math.random() * 3 + 1);
			int height = (int)(Math.random() * 3 + 1);
			
			Box b = new Box(width, height);
			System.out.println(++cnt + "번째 시도");
			
			// 이전에 채워놓은 박스와 같은 박스가 있는지 검사한다.
			for(int j = 0; j < i; j++ ) {
				Box b1 = b;
				Box b2 = box[j];
				
				if(b1.equals(b2) == true) {
					// 면적이 같은 박스가 이미 채워져 있는 경우이므로
					// 이번 방의 박스를 다시 만들어야한다.
					
					// 카운트 1감소시키고
					i--;
					continue loop;
				}
			}
			// 이 행을 실행하는 경우는 같은 면적의 박스가 없는 경우이다. 따라서 채워준다.
			box[i] = b;
		}
		// 출력
		for(Box b : box) {
			System.out.println("면적이 " + b.getArea() + " 인 Box");
		}
	}

	public static void main(String[] args) {
		new Test05_Equals();
	}

}
