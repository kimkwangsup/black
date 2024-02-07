package day08;

import java.util.ArrayList;

public class Test01_index_lunch {
	public static void main(String[] args) {
		// 메뉴들을 기억할 배열을 만들고
		// 랜덤하게 메뉴를 꺼내서 출력해보자.
		String[] menus = {"짜장면", "라멘", "돈까스", "김밥", "햄버거", "치킨", "짬뽕", "보쌈", "순대국", "곰탕"};
	
		System.out.println(menus.length);
		
		// 일주일치 메뉴 정하기.
		for(int i = 0 ; i < 5 ; i++) {
			
		
		
		// 랜덤하게 위치값을 만들어준다
		int idx = (int)(Math.random() * 10);
		
		// 위치값을 이용해서 메뉴를 꺼내본다.
		String todayMenu = menus[idx];
//		System.out.println("오늘의 점심은 " + todayMenu +"입니다. 꼭 드세요.");
		System.out.println(i + 1 + "일차 점심은 " + todayMenu +"입니다. 꼭 드세요.");
	
		}
		/*
		ArrayList list = new ArrayList();
		list.add("짜장면");
		list.add("라멘");
		list.add("돈까스");
		list.add("김밥");
		list.add("곰탕");
		list.add("치킨");
		list.add("짬뽕");
		list.add("보쌈");
		list.add("순대국");
		list.add("햄버거");
		list.add(10);
		list.add('A');
		
		for(Object o : list) {
			System.out.println((String) o);
		}
		*/
	}
}
