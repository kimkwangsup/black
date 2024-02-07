package day08;

import java.util.*;

public class Test09_stringArray {

	public static void main(String[] args) {
		ArrayList[] news = new ArrayList[5];
		
		for(int i = 0 ; i < news.length ; i++) {
			news[i] = new ArrayList();
		}
		
		news[0] = new ArrayList(); // 첫 번째 방에만 ArrayList 를 만들어서 채워넣는다.
		news[0].add(1);
		
		System.out.println("news[0].get(0) : " + news[0].get(0));
	}

}
