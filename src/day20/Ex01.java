package day20;

/*
 	학생들의 이름, 국어, 영어, 수학, 총점, 평균 을 기억할 VO클래스 Student 클래스를 제작하고
 	TreeMap에 학생의 이름을 키값으로 하고
 	 해당학생의  Student 객체를 데이터로 하는
 	 Map을 완성해서 출력하세요.
 	 출력할 때는 키값들을 꺼내서 출력하는 방식으로 처리하세요.( keySet() 사용하세요 )
 */
import java.util.*;
public class Ex01 {
	// 변수 준비
	Random rnd;
	public ArrayList<String> names;
	TreeMap<String, Student> stud;
	
	public Ex01() {
		rnd = new Random();
		setNames();
		setStud();
		toPrint();
		System.out.println();
		System.out.println("### 총점기준 오름");
		sumSortPrint();
	}
	
	public void setNames() {
		names = new ArrayList<String>();
		names.add("쵸파");
		names.add("루피");
		names.add("조로");
		names.add("상디");
		names.add("우솝");
		names.add("나미");
		names.add("로빈");
		names.add("보아핸콕");
	}
	
	public void setStud() {
		// 데이터 채울 공간 만들고
		stud = new TreeMap<String, Student>();
		
		// 데이터 채우고
		for(int i = 0 ; i < names.size(); i++ ) {
			// 키값으로 사용할 이름꺼내고
			String name = names.get(i);
			// 과목점수만들고
			int ko = rnd.nextInt(41) + 60;
			int en = rnd.nextInt(41) + 60;
			int mt = rnd.nextInt(41) + 60;
			
			// 학생 객체 만들고
			Student s = new Student(name, ko, en, mt);
			
			// 맵에 채우고
			stud.put(name, s);
		}
	}
	
	// 출력함수
	public void toPrint() {
		ArrayList<String> list = new ArrayList<String>(names);
		list.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				String s1 = (String) o1;
				String s2 = (String) o2;
				int result = s1.compareTo(s2);
				return -result; // 이름을 기준으로 내림차순 정렬할 경우에는 s1 - s2 의 결과를 - 붙여서 부호를 바꾸면 된다.
			}
		});
	
		
		for(String s : list) {
			System.out.println(stud.get(s));
		}
	}
	
	// 입력된 내용기준으로 출력순서를 정해서 출력해주는 함수
	
	
	// 총점기준 내림차순 정렬해서 출력해주는 함수
	public void sumSortPrint() {
		// 총점을 키값으로 하는 맵
		/*
			아래 Comparator를 구현하는 코드는 
			중복된 데이터도 표현되는 코드가 된다.
			
			그런데 
			Map은 같은 키값으로 여러개의 데이터를 기억할 수 없고
			하나의 유일한 키값으로 한개의 데이터를 기억하는 컬렉션이다.
			
			따라서 아래처럼하게 되면 안된다.
		 */
		TreeMap map = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int n1 = (int) o1;
				int n2 = (int) o2;
				
				int result = (n1 == n2) ? -100 : (n2 - n1);
				
				return result;
			}
		});
		
		for(String name : names) {
			// 데이터 꺼내고
			Student s = stud.get(name);
			// 키값 꺼내고
			int total = s.getSum();
			map.put(total, s);
		}
		
		// 키값만 모두 꺼낸다.
		Set keys = map.keySet();
		Collection c = map.values();
		System.out.println("-----------------------------------------------------------------");
		/*
		for(Object o : c) {
			System.out.println(o);
		}
		*/
		
		Set<Map.Entry> set = map.entrySet();
		
		Iterator<Map.Entry> itor = set.iterator();
		
		while(itor.hasNext()) {
			Map.Entry ent = itor.next();
			
			int total = (int) ent.getKey();
			Student s = (Student) ent.getValue();
			System.out.println("***" + total + " ***\n" + s);
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}