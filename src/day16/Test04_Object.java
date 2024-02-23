package day16;

import java.util.Arrays;

/*
	Object 클래스
	==> 자바에서의 최상위 클래스
	
		소속함수
			toString()	: 인스턴스의 해쉬코드 주소를 문자열로 반환해주는 기능
			equals()	: 주소를 비교하는 함수, 반환값은 true 또는 false
			
			참고 ]
				String 클래스가 가지고 있는 equals() 함수는 
				Object 클래스에서 물려받은 주소로 비교하는 equals() 함수를
				문자열 데이터를 비교하는 기능으로 고쳐서 오버라이드 한 함수이다.
				
				만약 우리가 어떤 클래스를 제작하고
				그 클래스의 내용이 같은지를 비교하도록 하려면
				equals()를 오버라이드 하면 된다.
 */
public class Test04_Object {

	public Test04_Object() {
		/*
		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		Object obj = new Object();
		System.out.println(obj);
		
		Cba c = new Cba();
		System.out.println(c);
		*/
		
		Box b1 = new Box(4, 5); // 면적 20.0
		Box b2 = new Box(2, 10);// 면적 20.0
		Box b3 = new Box(3, 5); // 면적 15.0
		
		String str1 = "Smith";
		String str2 = new String("Smith");
		System.out.println("str1 == str2      : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		
		System.out.println("b1과 b2는 [" + ((b1.equals(b2) ? "같은" : "다른")) + "] Box 입니다.");
		System.out.println("b1과 b3는 [" + ((b1.equals(b3) ? "같은" : "다른")) + "] Box 입니다.");
		
	}

	public static void main(String[] args) {
		new Test04_Object();
	}

}
class Cba {
	
}

//Box 클래스를 만드는데 면적이 같으면 같은 클래스가 되도록 클래스를 제작한다.
class Box{
	private int width, height;
	private double area;
	
	public Box() {}
	public Box(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		
	}
	// 면적 셋팅해주는 함수
	public void setArea() {
		area = width * height;
	}
	
	// 면적이 같으면 같은 Box가 되도록 기능 추가
	// 면적을 비교하는 기능으로 재탄생...
	@Override
	public boolean equals(Object o) {
		/*
		 	이 함수를 호출할 때 b3 를 입력하면서 호출하면
			매개변수 Object o 는
				Object o = b3;
			이때 b3는 Object보다 좁은 범위이므로
			Object 타입으로 자동 형변환된다.
			
			Object 클래스에는 getArea() 함수가 없으므로
			Object 타입인 채로는 우리가 사용하려는 함수를 사용할 수 없다.
			
			따라서 원래 형태로 강제 형변환 해줘야 그 기능을 사용할 수 있게 된다.
		 */
		Box b = (Box)o; // 강제형변환
		
		// b의 면적 꺼내고
		double bArea = b.getArea();
		
		// 면적 비교한 결과 만들고
		boolean result = area == bArea;
		
		return result;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
}