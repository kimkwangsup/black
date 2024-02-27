package day20;

import java.util.*;
public class Test01_Comparable {

	public Test01_Comparable() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("쵸파");
		names.add("루피");
		names.add("조로");
		names.add("우솝");
		names.add("나미");
		names.add("상디");
		names.add("로빈");
		names.add("보아핸콕");
		// 학생들 정보 채울 리스트 준비
		ArrayList list = new ArrayList();
		for(int i = 0 ; i < names.size(); i++) {
			// 필요한 데이터 준비
			String name = names.get(i);
			// 번호
			int no = i + 1;
			// 점수
			int score = (int)(Math.random() * 41 + 60);
			
			Stud s = new Stud(name, no, score);
			// 학생 정보를 리스트에 채운다
			list.add(s);
		}
		// 결과확인
		for(Object o : list) {
//			System.out.println(o);
		}
		
		// list 를 TreeSet 으로 변환해보자.
		System.out.println("-----------------------------------------------------");
		TreeSet set = new TreeSet();
		for(int i = 0 ; i < names.size(); i++) {
			// 필요한데이터준비
			String name = names.get(i);
			// 번호
			int no = i + 1;
			// 점수
			int score = (int)(Math.random() * 41 + 60);
			Stud s = new Stud(name, no, score);
			// 학생 정보를 리스트에 채운다
			set.add(s);
		}
		
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
	}

	public static void main(String[] args) {
		new Test01_Comparable();
	}

}
