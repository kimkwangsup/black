package day21;

import java.util.*;

import day20.Student;
public class Test06_Generics {

	public Test06_Generics() {
		ArrayList list1 = new ArrayList();
		// 이 리스트에 저장할 수 있는 데이터는 Object 데이터 이고
		// 자바에서 보든 객체는 Object 타입으로 볼 수 있다.
		// 따라서 모든 데이터를 이 리스트에 채울 수 있다.
		list1.add("쵸파");
		list1.add(25);
		HashMap map = new HashMap();
		
		map.put("name", "짱구");
		map.put("age" , 34);
		
		list1.add(map);
		list1.add(new day20.Student());
		
		// 데이터 꺼내기
		String name = (String) list1.get(0);
		// list1 에서 Object 형태로 저장되어 있으므로
		// 꺼내서 사용할 때는 원래 형태로 강제 형변환 해줘야 한다.
		int age = (int) list1.get(1);
		HashMap jjang = (HashMap) list1.get(2);
		day20.Student stud = (day20.Student) list1.get(3);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("쵸파");
		list2.add("25");
		list2.add("짱구");
		list2.add("34");
		
		for(String s : list2) {
			// list 2 에는 문자열 데이터만 저장하도록 제너릭스 선언을 해 뒀으므로
			// 꺼낸 데이터는 당연히 문자열이다.
			// 따라서 강제 형변환이 필요없다.
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test06_Generics();
	}

}
