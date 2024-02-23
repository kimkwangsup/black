package day18;

/*
	package 와 import
	
		package
		==> 자바프로그램 소스코드가 들어있는 폴더를
			자바에서 부르는 용어
			
			자바는 오픈소스이다.
			모든 사람이 자신이 만든 프로그램을 배포할 수 있고
			그 배포된 프로그램을 모든 사람이 자유롭게 사용할 수 있는 언어이다.
			
			이러다보니 문제가 발생할 수 있다.
			사용하는 프로그램에서 충돌이 발생할 수 있다.
			이런 문제를 해결하기 위해서 만들어 놓은 한가지 규칙이 바로 패키지이다.
			
			소스를 만든 사람이 그 프로그램이 포함된 폴더 이름까지 정해서 프로그램을 만들도록 해 놓았다.
			
			결론적으로
				자바로 프로그램을 만들 때는 반드시 이 프로그램이 어떤 폴더에 저장되는지를 알려줘야 한다.
				
			명령 ]
				package 폴더이름;
				
			참고 ]
				패키지 이름을 만드는 권장사항
				
					도메인을 거꾸로 기술한다.
						
						예 ]
							human.com
							==> 
							com.human.jennie
	
								human.co.kr
								==> 
								kr.co.human.jennie
								
			import
			
			==> 자신이 사용할 클래스가 어느 위치에 있는 클래스인지를 밝혀주는 명령
			
				예 ]
					
					sample/Test.java
					
					jennie/Test.java
					
					로 클래스가 만들어져 있는 경우
					
					sample 에 있는 Test.java 를 사용할 경우
					==> import sample.Test;
			형식 ]
				
				import 패키지이름.클래스이름;
			
			참고 ]
				특정 패키지 내의 모든 클래스를 사용할 준비를 하는 방법
				
				형식 ]
					import 패키지이름.*;
					
				주의 ]
					이 때 사용 가능한 클래스는 해당 패키지 바로 아휘에 있는 클래스만 가능하다.
					
						
						a-------
								|
								| ------- A
								| ------- ab -----
								| 				 |
								| 				 |----- Ab
								|				 |----- Cd
								| ------- B
						
						인 경우
						import a.*;
						로 임포트 하는 경우 사용가능한 클래스는 A, B 만 사용가능하다.
						만약 Ab, Cd 클래스를 사용하려면
							import a.ab.*;
			참고 ]
				임포트 하지 않아도 클래스 이름 앞에 경로를 밝혀주면 해당 클래스를 사용할 수 있다.
				
				new a.ab.Ab();
				
		참고 ]
			static import
			==> Static 멤버는 원칙적으로 임포트 하지 않아도 사용할 수 있다.
				이때, 반드시 클래스 이름을 밝혀줘야 한다.
					클래스이름.함수이름();
				의 형태로 사용할 수 있다.
				
				그런데 앞에 붙여지는 클래스이름도 생략해서 사용할 수 있는 방법이
				static import 이다.
				
				형식 ]
				 
					import static 패키지이름.클래스이름.*;
		
 */
import java.util.*;
import static java.lang.Math.*;
public class Test02_Vector {

	public Test02_Vector() {
//		int no = (int)(random() * 20 + 1);
//		double pi = PI;
		
		// blackpink 멤버들의 이름을 벡터에 기억시켜보자.
		Vector vec = new Vector();
		// 데이터 추가
		vec.add("제니");
		vec.add("로제");
		vec.add("지수");
		
		System.out.println(vec);
		vec.add(1, "리사");
		System.out.println(vec);
		vec.add(0, "euns");
		System.out.println(vec);
		vec.insertElementAt("choppa", 1);

		System.out.println(vec);
		
		ArrayList list= new ArrayList(vec); // Collection  끼리는 서로 형변환이 가능하다.
		System.out.println("list : " + list);
		
		Vector v1 = (Vector)((AbstractList)list); 
		// 강제로 형변환은 가능하다. 사용은 별개의 문제...
		// Vector 와 ArrayList 는 형제관계이기 때문에 강제로 형변환은 가능하지만
		// 상속 관계가 아니기 때문에 사용할 때 문제가 생길 수 있다.
		
//		System.out.println("v1 : " + v1));

	}

	public static void main(String[] args) {
		new Test02_Vector();
	}

}
