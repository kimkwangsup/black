package day11;

/*
	속성으로 면적만 0.0으로 가지는 Figure 클래스를 만들고
	이 클래스를 상속받는 Semo 클래스를 정의해서
	Semo의 정보를 출력해보세요.
 */
public class Test02_extends {
	
	public Test02_extends() {

		Figure[] fig = new Figure[5];
		for(int i = 0 ; i < 5 ; i++) {
			int no = (int)(Math.random() * 3);
			int width = (int)(Math.random() * 20 + 1);
			int height = (int)(Math.random() * 20 + 1);
			switch(no) {
			case 0 :
//				int rad = (int)(Math.random() * 21);
				Circle won = new Circle(width);
				fig[i] = won;
				break;
			case 1 : 
				Semo samgak = new Semo(width, height);
				fig[i] = samgak;
				break;
			case 2 : 
				Nemo nem = new Nemo(width, height);
				fig[i] = nem;
				break;
			}
		}
		
		for(int i = 0 ; i < fig.length ; i++ ) {
			System.out.println((i + 1) + " : " + fig[i]);
		}
		
		/*
			0, 1, 2 를 랜덤하게 발생시켜서
			0 - Won
			1 - Semo
			2 - Nemo
			로 fig 배열에 채우세요.
		 */
	}

	public static void main(String[] args) {
		new Test02_extends();
	}

}
