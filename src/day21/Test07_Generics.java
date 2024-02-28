package day21;

import java.util.*;
import java.io.*;
public class Test07_Generics {

	public Test07_Generics() {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("이름", "쵸파");
		map1.put("나이", "25");
		map1.put("주소", "싸우전드써니호");
		map1.put("직업", "의사");
		map1.put("종족", "순록");
		
		inGenerics(map1);
		
		// 제너릭스 없이 만드는법
		HashMap map2 = new HashMap();
		map2.put("이름", "쵸파");
		map2.put("나이", "25");
		map2.put("주소", "싸우전드써니호");
		map2.put("직업", "의사");
		map2.put("종족", "순록");
		
		// 출력
		System.out.println();
		nonGenerics(map2);
		
	}
	public void inGenerics(HashMap<String, String> map1) {
		Set<String> set = map1.keySet();
		ArrayList<String> keys = new ArrayList<String>(set);
		// 출력하기
		for(int i = 0 ; i < keys.size(); i++) {
			String key = keys.get(i);
			String value = map1.get(key);
			System.out.println(key +"-"+value);
		}
	}

	public void nonGenerics(HashMap map) {
		Set keys = map.keySet(); 
		// 제너릭스 선언이 되어있지 않으므로 키값, 밸류값이 모드 Object 타입으로 기억되어있다.
		ArrayList list = new ArrayList(keys);
		for(int i = 0 ; i < list.size(); i++) {
			String key = (String) list.get(i);
			String value = (String) map.get(key); // 나이에 해당하는 데이터가 int 타입이므로 에러가 발생한다.
			System.out.println(key+"-"+value);
		}
		
	}
	public static void main(String[] args) {
		new Test07_Generics();
	}

}
