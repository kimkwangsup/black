package day20;

import java.util.*;
import java.util.Map.Entry;
public class Test04_Map {
/*
	Map
	==>
		데이터를 기억할 때
		그 데이터를 구분할 키값과 한쌍으로 만들어서
		데이터를 깅거하는 컬렉션
		
		사용할 경우에는 키값을 이용해서 데이터를 꺼낼 수 있다.
		
		Map 계열은 많은 양의 데이터를 보관하는 용도보다는
		데이터를 손쉽게 구분해서 사용할 목적으로 주로 사용된다.
		
		HashMap / Hashtable
		==>
			Hashtable 이 구 버전으로
			HashMap 이 새로운 버전이므로 주로 HashMap을 권장를 한다.
			
			내부적으로 키값을 해쉬테이블을 이용해서 정렬해서 보관한다.
			
			주요함수 ]
				
				put(Object key, Object value)
				==> 데이터를 입력하는 함수
				
				get(Object key)
				==> 데이터를 꺼내는 함수
				
				==> 데이터를 꺼내려면 키값을 알고 있어야 꺼낼 수 있다.
				
			참고함수 ]
				
				values()
				==> 데이터만 꺼내서 사용할 수 있다.
				
				keys
				==> 키값만 꺼내주는 함수
					Map 은 키값을 알아야 데이터를 꺼낼 수 있기 때문에...
					
				참고 ]
					keys() 로 꺼낸 데이터는 Enumeration 으로 반환된다.
					==> Enumeration 클래스는 Iterator 의 구버전이다.
						따라서 Iterator 와 사용법이 비슷하고
						순차적으로 데이터를 꺼낼 수 있다.
						
				참고 ]
					키값 꺼내는 함수
					Hashtable
							keys()	 : 반환값이 Enumeration
							keyset() : 반환값이 Set 타입
						
					HashMap
							keySet() 만 있다.
							
		참고 ]
			entrySet
			==> Map은 반드시 키값을 알아야 데이터를 꺼낼 수 있다.
				이 함수는 키값과 데이터를 VO 에 담아서 Set으로 반환해주는 함수다.
				
				Map은 항상 키값과 데이터가 한쌍이 되어야 입력할 수 있다.
				Set은 오직 한개만 저장한다.
				그래서 키값과 데이터를 기억시키는 VO를 만들어서 
				VO에 키값과 데이터를 저장시킨 후 Set에 저장해서 Set을 반환해준다.
				
--------------------------------------------------------------------------------------------------------
	TreeMap
	==> TreeSet 과 마찬가지로 내부에서 정렬하면서 데이터를 보관하는 Map
	
		이때, 정렬할 때에는 데이터를 이용해서 정렬하는 것이 아니고
		키값을 이용해서 정렬하게 된다.
		
		==> 
			키값이 정렬되지 않는 경우는 입력이 안된다.
 */
	public Test04_Map() {
		Hashtable map = new Hashtable();
		map.put("제니", 28);
		map.put("리사", 27);
		map.put("로제", 26);
		map.put("지수", 29);
		
		// 제니 데이터 꺼내서 출력
		int jennie = (int) map.get("제니");
		System.out.println(jennie);
		System.out.println();
		// 키값들만 추출해서 모든 데이터 출력
		Enumeration en = map.keys(); // map 에 기억된 키값들만 모두 꺼내주는 함수
		while(en.hasMoreElements()) {
			/*
				hasMoreElments() : 꺼낸 데이터가 있는 여부를 알려주는 함수
			 */
			Object o = en.nextElement();
			String key = (String)o;
			// 데이터 꺼내고
			Object data = map.get(key);
			// 출력
			System.out.println(key +"," +data);
			
		}
		System.out.println();
		System.out.println("################# keySet() #################");
		Set set = map.keySet();
		// 꺼내는 방법 1
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Object key = itor.next();
			Object value = map.get(key);
			// 출력
			System.out.println(key+ "-"+ value);
		}
		System.out.println();
		System.out.println("################# keySet() ==> ArrayList#################");
		ArrayList keys = new ArrayList(set);
		for(int i = 0 ; i < keys.size(); i++) {
			Object key = keys.get(i);
			Object value = map.get(key);
			// 출력
			System.out.println(key+"-"+value);
		}
		System.out.println("###########################################################");
		// entrySet()
		Set eset = map.entrySet();
		ArrayList list = new ArrayList(eset);
		for(int i = 0 ; i < list.size(); i++) {
			Map.Entry ent = (Map.Entry) list.get(i);
			String key = (String) ent.getKey();
			int value = (int) ent.getValue();
			// 출력하기
			System.out.println(key+"-"+value);
		}
		
		
	}

	public static void main(String[] args) {
		new Test04_Map();
	}

}
