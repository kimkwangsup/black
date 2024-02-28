package day21;

import java.util.*;
public class Test01_Generics {
/*
 	제너릭스(Generics)
 	==> 
 		컬렉션은 모든 형태의 데이터를 입력받을 수 있다.
 		그런데 실무에서는 한 가지 형태로 입력하는 것을 원칙으로 한다.
 		그런데 꺼낼때는 항상 강제 형변환을 해서 꺼내야 한다.
 		<== 그래야 원래 기능을 사용할 수 있으니까...
 		입력하는 사람이 한 가지 형태로 결정해서 데이터를 입력해 놓았는데
 		꺼낼때는 자동 형변환이 안되기 때문이다.
 		왜냐하면 컬렉션은 기본값으로 입력되는 모든 데이터를 Object 형태로 관리하기 때문이다.
 		매개 변수도 Object로 되어있고 반환값 타입도 Object 형태로 되어있다.
 		그래서 항상 강제 형변환을 해줘야 한다.
 		
 		==> 
 			컬렉션에 입력하는 데이터의 형태를 미리 정해놓고
 			나중에 꺼내서 사용할 때 좀 더 편하게(형변환 없이) 꺼내서 사용할 수 있도록 해주는 것이
 			제너릭스이다.
 			
 		형식 ]
 			
 			ArrayList<String> list = new ArrayList<String>();
 			
 		참고 ]
 			컬렉션마다 모두 제너릭스 선언을 해 줘야 한다.
 		
 		*****
 		참고 ]
 			제너릭스는 전파되지 않는다.
 			하나의 컬렉션에서 제너릭스 선언이 되어 있더라도
 			그 컬렉션을 이용하는 다른 컬렉션은 제너릭스가 사라지게 된다.
 			따라서 다시 선언 해줘야 한다.
 			
 	참고 ]
 		 특수한 제너릭스
 		 	원래 제너릭스는 특정 클래스(타입)만 입력받을 목적으로 사용한다.
 		 	
 		 	형식 ] ==> 나중에 꼭 공부하세요.
 		 		<? super 클래스이름>
 		 		==> 지정한 클래스를 포함한 상위클래스까지 허락
 		 		
 		 		<? extends 클래스이름>
 		 		==> 지정한 클래스부터 하위 클래스까지 허락
 		 		
 		 		
 		 	
 		 	
 */
	
	public Test01_Generics() {
		ArrayList<String> list = new ArrayList<String>();
		// 이 리스트는 문자열만 관리하는 리스트
		list.add("쵸파");
		list.add("루피");
		
		System.out.println(list);
		
		String choppa = list.get(0);
		// 문자열만 관리할 리스트에서 데이터를 꺼내면 당연히 문자열일 것이다.
		
		Vector<String> vec = new Vector<String>(list);
		String name = vec.get(0);
		
	}

	public static void main(String[] args) {
		new Test01_Generics();
	}

}
