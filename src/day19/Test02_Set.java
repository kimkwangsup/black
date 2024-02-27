package day19;

import java.util.*;
/*
	Set 계열
		특징 ]
			1. 입력 순서를 보장하지 않는다.
			2. 중복 데이터를 허용하지 않는다.
			
		==> 데이터를 기억할 때 자기 자신의 규칙을 가지고
			입력 데이터를 정렬해서 기억한다.
			그런데 정렬한 위치는 알려주지 않는다.
			
			*****
			따라서 데이터를 꺼낼 수 있는 함수가 없고
			다른 형태로 변환시켜서 꺼내야 한다.
			
		1. HashSet
		==> HashCode를 이용해서 정렬해서 보관하는 Set
			따라서 우리가 생각하는 정렬은 이루어지지 않는다.
			
			생성자 ]
				
				HashSet(int initialCapacity, float loadFactor)
				==> 
					float loadFactor : 해쉬코드값을 만들 규칙에 사용할 상수값
										사용자가 지정하면서 해쉬테블을 만들어서 사용하게 된다.
					
		2. TreeSet
		==> 내부적으로 Tree Sort 라는 알고리즘을 이용해서 데이터를 정렬해서 보관
			우리가 알고 있는 정렬 방식을 사용한다.
			
			참고 ]
				TreeSet 에는 정렬되지 않는 데이터는 입력할 수 없다.
				
			생성자 ]
				
				TreeSet(Comparator comparator)
				==> 정렬 방식을 정해서 생성하는 방법
				
				TreeSet(SortedSet<E> s)
				==> TreeSet을 이용해서 다시 TresSet을 만드는 방법
				
		참고함수 ]
		
			subSet()
			==> 하나의 Set 에 담긴 내용 중에서 특정 부분만 골라서 새로운 Set을 만드는 방법
			
			headSet(E toElement)
			==> 처음부터 지정한 부분까지 골라서 새로운 Set 을 만드는 방법
			
			tailSet(E fromElement)
			==> 지정한 부분부터 마지막까지 꺼내서 새로운 Set 을 만드는 방법
	
 */
public class Test02_Set {

	public Test02_Set() {
		HashSet set = new HashSet();
		set.add("제니");
		set.add("리사");
		set.add("로제");
		set.add("지수");
		
		// Set 에는 꺼내는 함수가 없다.
		System.out.println(set);
		System.out.println();
		
		// 순차적으로 꺼내는 함수가 없기 때문에 순차적으로 꺼내는 타입으로 변환시켜야 된다.
		// 방법 1 ]
		Iterator itor = set.iterator();
		// Iterator - 버퍼메모리에 기억되고 꺼내는 순간 삭제하는 타입
		while(itor.hasNext()) {
			Object o = itor.next(); // 순차적으로 데이터를 꺼낸다.
			String name = (String) o ;
			System.out.println(name);
			
		}
		System.out.println();
		
		// 방법 2 ]
		// ArrayList 로 변환해서 꺼내는 방법
		ArrayList list = new ArrayList(set);
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println((String)list.get(i));
		}
	}

	public static void main(String[] args) {
		new Test02_Set();
	}	

}
