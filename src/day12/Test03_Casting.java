package day12;

public class Test03_Casting {
/*
	*****
	다형성
	==> 하나의 변수를 이용해서 여러 형태의 클래스를 사용할 수 있도록 하는 방법
 	
 	주소의 형변환(Casting)
 	==> 원칙적으로 주소는 다른 형태로 형변환이 불가능하다.
 		<== 즉, 주소는 Heap 형태에 따라 주소가 결정되므로
 			Heap 형태가 다르면 주소를 기억할 수 없다.
 			
 			예 ]
 				int[] no = new float[5];  ===> X
 				
 				Test t = new Semo();	  ===> X
 				
 		***		
 		딱 한가지 경우에 한해서 주소의 형변환이 가능하다.
 		상속 관계에 있는 클래스 끼리는 형변환이 가능하다.
 		<== is a 관계이기 때문에..
 		
 				자동형변환
 				==> 하위 클래스의 주소가 상위 클래스의 변수에 기억되는 것은
 					자동적으로 형변환이 된다.
 					
 					예 ]
 						class Father{}
 						class Son extends Father{}
 						
 						==>
 						Father f = new Son();
 						 					
 				강제형변환
 				==> 상위 클래스의 주소가 하위 클래스의 변수에 기억되는 것은
 					원칙적으로 불가능하지만
 					강제로 형변환은 가능하다.
 					
 					Son s = (Son)(new Father());
 					
 	참고 ]
 		상속받은 클래스에서 상위 클래스의 함수를 오버라이딩 하는 경우
 		하위 클래스의 인스턴스를 상위 클래스의 변수에 기억시켜서 사용할 때
 		상위클래스의 함수를 호출할 경우 하위 클래스의 오버로딩된 함수가 호출된다.
 		
 		
 참고 ]
 	어떤 함수의 반환값이 상위 클래스 형태로 되어있으면
 	그 반환값을 사용할 때는 반드시 하위 클래스 형태로 형변환 해서 사용해야 한다.
 	
 참고 ]
 	상속 관계의 클래스들의 경우
 	함수는 인스턴스쪽을 따르고
 	변수는 레퍼런스쪽을 따른다
 	
 	따라서 변수는 함부로 건드리지 마세요.
 				
 */
	public Test03_Casting() {
		Father f = new Son();		  // 자동형변환
//		Son s = (Son)(new Father());  // 강제형변환
		
		System.out.println(f);
		System.out.println((Son) f);
		
		System.out.println(abc(10));
		
		System.out.println(new int[10]);
	}

	public static void main(String[] args) {
		new Test03_Casting();
	}
	public Object abc(Object o) {
		int no = (int) o + 10;
		return no;

	}
	public Object abc() {
		return 3.14;
	}
}
class Father{
	@Override
	public String toString() {
		return "Father";
		
	}
}
class Son extends Father{
	@Override
	public String toString() {
		return "Son";
	}
}
	
