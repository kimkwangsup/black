package day19;

import java.util.*;
public class Test04_TreeSet {

	public Test04_TreeSet() {
		TreeSet set = new TreeSet();
		set.add("제니");
		set.add("지수");
		set.add("리사");
		set.add("로제");
		System.out.println(set);
		
		ArrayList list = new ArrayList(set);
		
		for(int i = 0 ; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
		TreeSet set1 = new TreeSet();
		Circle c = new Circle(20);
		set1.add(c);
		set1.add(new Circle(20));
		set1.add(new Circle(5));
		System.out.println(set1);
		
	}

	public static void main(String[] args) {
		new Test04_TreeSet();
	}

}
