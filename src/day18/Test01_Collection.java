package day18;

/*
	컬렉션(Collection)
	==> 많은 양의 데이터를 손쉽게 보관할 수 있는 클래스들을 부르는 단어
	
		배열을 이용하면 많은 양의 데이터를 관리할 수 있지만
		
		배열의 단점 ]
			1. 크기를 변경할 수 없다.
				==> 한 번 크기를 결정하면 크기를 수정할 수 없다.
				
			2. 데이터의 입출력에 많은 제약 사항이 있다.
				==> 반드시 데이터의 위치를 알아야 꺼낼 수 있다.
				
		종류 ]
			
			1. LIST 계열
				특징 ]
					1. 입력 순서를 보장한다.
						(처리 속도는 느리다.)
					2. 중복 데이터의 입력을 허용한다.
						
			2. SET 계열
				특징 ]
					1. 입력 순서를 보장하지 않는다.
						(자신만의 규칙을 이용해서 데이터를 정렬해서 보관한다.
							처리 속도는 빠르다.)
					2. 중복 데이터가 입력이 되면 먼저 저장된 데이터는 삭제한 후
						저장한다.
						==> 중복 데이터를 허용하지 않는다. 중복 데이터는 한 번만 저장한다.
			
			-------------------------------------------------------------------------
			3. MAP 계열
				특징 ]
					1. 데이터를 그 데이터를 구분하는 "키값"과 한 쌍으로 만들어서 저장한다.
					2. 입력 순서는 보장하지 않는다.
					3. 같은 키값으로 데이터가 입력이 되면 
						먼저 입력된 데이터는 삭제된다.
						==> 데이터는 같아도 되지만 키값은 같으면 안된다.
		
		정리 ]
			LIST 계열과 SET 계열은 상위 클래스가 같지만
			MAP 계열은 위 두 계열과는 다른 상위 클래스를 가지고 있다.
			==> 
				LIST 와 SET 은 다형성 처리가 가능하지만
				MAP 은 안된다.
				MAP 은 상위 클래스가 다르므로 LIST 나 SET 으로 형 변환이 불가능하다.
				
----------------------------------------------------------------------------------------------------------
	1. LIST 계열
	
		1) Vector
			==> 내부적으로 배열의 형태를 만들어서 데이터를 보관하는 컬렉션의 일종이다.
			
				단점 ]
					중간에 데이터가 추가하거나 데이터를 삭제하는 속도가 느리다.
				장점 ]
					입력속도와 검색속도가 빠른편이다.
					
				결론 ]
					데이터의 변화가 거의 없는 프로그램에서 많이 사용된다.
			
			생성 방법 ]
				Vector()
					==> 배열의 크기가 10으로 정한 상태에서 벡터를 만들어 준다.
						11번째 데이터가 입력되는 순간 크기가 20으로 변경을 하고
						21번째 데이터가 입력되는 순간 크기가 40으로 변경되는 형태로 크기를 조정한다.
				
				ArrayList(Collection<? extends E> c)
					==> 다른 컬렉션과 데이터를 복사해서 벡터를 만들어준다. 
				
				Vector(int initialCapacity)
					==> 처음 배열의 크기를 정해서 벡터를 만드는 방법
						예 ]
							new Vector(5);
							==>        						5
								6번째 데이터입력 --------> 10
								11번째 데이터 입력 ------> 20
								...
								
				Vector(int initialCapacity, int capacityIncrement)
					==> 처음 배열의 크기와 증가되는 크기를 지정해서 벡터를 만든다.
						<**<< 권장 형식 >>**>
						
				참고 ]
					컬렉션은 데이터의 양에 관계 없이 언제나 데이터를 입력받을 수 있다.
					이 때, 데이터를 입력받을 수 있는 공간은 확보되어야 하는데
					공간을 확보하는 규칙은
						현재공간 * 2
					의 형태로 공간을 확보하게 된다.
					
			주요함수 ] - 컬렉션은 클래스이므로 함수를 이용해서 데이터를 처리한다.
			
				1. 데이터를 입력하는 함수
					***
					add(Object o)						 --> 데이터를 추가하는 함수
					add(int index, Object element) 		 --> 위치를 지정해서 데이터를 추가하는 함수
					addAll(Collection c) 				 --> 컬렉션의 데이터를 모두 추가하는 함수
					addAll(int index, Collection c) 	 --> 추가할 위치를 지정해서 컬렉션 데이터 추가
					***
					addElement(Object o) 			
					insertElementAt(Object o, int index) --> 위치를 지정해서 데이터를 추가
					
				2. 데이터를 수정하는 함수
					set(int index, Object element)			--> 지정한 위치의 데이터를 입력 데이터로 수정하는 함수
					setElementAt(Object element, int index) --> 지정한 위치의 데이터를 입력 데이터로 수정하는 함수
				
				3. 데이터를 꺼내는 함수
					get(int index)		 --> 위치값 지정해서 데이터 추출
					elementAt(int index)
					firstElement()		 --> 처음 데이터 추출
					lastElement()		 --> 마지막 데이터 추출
					elements()			 --> 모든 데이터 추출
					
				참고 ]
					E, V, K 라고 표현된 타입들이 보이는데
					이것은 Object 를 의미하는 것으로 제너릭스 용어이다.
					
		2) ArrayList
			==> Vector 의 신버젼으로
				배열의 형태로 데이터를 관리하기 때문에
				Vector 의 특징을 그대로 가지고 있다.
				그러나 쓰레드에서 동기화 처리를 자동으로 해주기 때문에
				요즘은 Vector 보다는 ArrayList 를 선호하는 경향이 있다.
				
				사용방법(함수) 또한 벡터와 유사하다.
				
				참고 ]
					List 계열의 변수를 출력하면
					데이터가 추출된 것 처럼 보인다.
					하지만, 절대로 데이터를 추출한 것이 아니고
					데이터들을 모아서 문자열로 만들어서 출력해주는 것일 뿐이다.
					역시 Arrays.toString() 함수와 마찬가지로
					toString() 함수를 오버라이드 해 놓았을 뿐이다.
					절대로 데이터 추출함수가 아니다.
			
		3) LinkedList
			==> 내부적으로 이중 연결 리스트 방식으로 데이터를 보관하는 컬렉션의 일종이다.
				
				장점 ]
					데이터를 중간에 끼워 넣는 작업, 삭제 작업은 속도가 빠른편이다
				
				단점 ]
					데이터를 누적시키는 작업은 느린편이다.
					
	참고 ]
		Iterator
		==> 컬렉션은 많은 클래스들의 집합이고 형태도 모두 다르다.
			사용할 때 이들이 서로 혼용되어서 사용될 수 있다.
			이 때, 데이터를 꺼내는 방식은 서로 다를 수 있다.
			List 계열에서 꺼내는 함수를 Set 계열에서는 사용할 수 없는 것이 그 예이다.
			==> 데이터에 따라서 꺼내는 방식이 달라질 수 있다는 말이다.
			
			이런 불편함을 해결하기 위해서 만들어진 클래스가 
			Iterator 이다.
			List 계열이든 Set 계열이든 Iterator 타입으로만 만들어 주면 
			꺼내는 함수는 Iterator 멤버 함수로 꺼내면 된다.
			
			따라서 List 계열과 Set 계열에 모두 Iterator() 함수가 있고
			이 함수의 반환값은 Iterator 타입이 된다.
			
			참고로 Iterator 도 StringTokenizer 과 마찬가지로
			버퍼 메모리에 기억되고 순차적으로 꺼내고 
			사용하는 순간 해당 데이터를 메모리에서 지우게 된다.
 */

import java.util.*;
public class Test01_Collection {

	public Test01_Collection() {
		Vector vec = new Vector(); // 데이터를 기억할 공간은 10개 확보
		System.out.println("vec capacity : " + vec.capacity());
		System.out.println();
		// 데이터를 11개 추가하고 추가할 때마다 저장공간을 출력
		for(int i = 0 ; i < 11 ; i++) {
			vec.add(i); // 벡터에 데이터 추가하는 함수
			System.out.println("vec capacity : " + vec.capacity());
		}
		System.out.println();
		for(int i = 0 ; i < 10 ; i++) {
			vec.add(i);
			System.out.println("vec capacity : " + vec.capacity());
		}
		
		System.out.println();
		
		
		for(int i = 0 ; i < vec.size() ; i++) {
			// size() : 저장된 데이터의 갯수를 반환해주는 함수
			// capacity() : 저장할 수 있는 공간의 수를 반환해주는 함수
			Object o = vec.get(i);
			
			System.out.println((int)o);
		}
		System.out.println(vec); // 오버라이드된  toString() 가 자동 호출된다.
	}

	public static void main(String[] args) {
		new Test01_Collection();
	}

}
