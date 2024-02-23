package day18;

/*
	
 */
import java.util.*;
public class Test03_ArrayList {

	public Test03_ArrayList() {
		// 블랙핑크 멤버를 ArrayList 에 저장해보자.
		// 리스트 준비
		ArrayList list = new ArrayList();
		// 데이터 추가
		list.add("제니");
		list.add("로제");
		list.add("지수");
		System.out.println(list);
		System.out.println();
		
		list.add(1, "리사");
		System.out.println(list);
		System.out.println();
		list.add(0, "euns");
		list.add(1, "choppa");
		System.out.println(list);
		System.out.println();
		
		// 수정
		list.set(1, "쵸파");
		System.out.println(list);
	}

	public static void main(String[] args) {
		new Test03_ArrayList();
	}

}
