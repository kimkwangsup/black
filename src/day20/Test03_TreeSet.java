package day20;

import java.util.*;
public class Test03_TreeSet {

	public Test03_TreeSet() {
		TreeSet set = new TreeSet(new Comparator() {
			// 정렬 불가능한 객체를 TreeSet에 저장할 때
			// 정렬 기준을 정해서 TreeSet에 만드는 방법.
			@Override
			public int compare(Object o1, Object o2) {
				return ((Nemo)o1).getArea() - ((Nemo)o2).getArea();
			}
		});
		Nemo nemo = new Nemo(5,10);
		set.add(nemo);
		set.add(new Nemo(4,8));
		System.out.println(set);

		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
			System.out.println("--------------------------------------");
		}
	}
	

	public static void main(String[] args) {
		new Test03_TreeSet();
	}

}
