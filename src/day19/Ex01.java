package day19;

/*
	ArrayList 에 BlackPink 멤버들의 정보를 기억시키세요.
	단, 리스트에 채우는 인스턴스는 기본 생성자를 사용하세요.
 */
import java.util.*;
public class Ex01 {

	public Ex01() {
		// 리스트준비
		ArrayList<BlackPink> list = new ArrayList<BlackPink>();
		// list 에는 BlackPink 데이터만 채울 수 있다
		// 꺼낼 때는 BlackPink 데이터로 꺼내와진다
		
		Random rand = new Random();
		// 이름 준비
		ArrayList<String> names = new ArrayList<String>();
		// names 에는 String 데이터만 채울 수 있다.
		names.add("제니");
		names.add("리사");
		names.add("로제");
		names.add("지수");
		
//		String name = names.get(0);
//		System.out.println(name);
		for(int i = 0 ; i < names.size() ; i++) {
			BlackPink black = new BlackPink();
			list.add(black);
			/*
			// BlackPink 채우고
			list.add(new BlackPink());
			
			// 데이터 셋팅
			BlackPink black = list.get(i);
//			list.get(i).setName(names.get(i));
			*/
			// 이름
			black.setName(names.get(i));
			// 과목점수
			black.setKor(rand.nextInt(41) + 60);
			black.setEng(rand.nextInt(41) + 60);
			black.setMath(rand.nextInt(41) + 60);
			
			// 총점
			black.setTotal();
			// 평균
			black.setAvg();
			// 순위
			black.setRank(1);
		}
		// 출력
		for(BlackPink black : list) {
//			System.out.println(black);
		}
		
		// 순위계산
		for(int i = 0 ; i < list.size(); i++) {
			for(int j = 0 ; j < list.size(); j++) {
				if(list.get(i).getTotal() < list.get(j).getTotal()) {
					/*
					// i번째 순위를 1 추가시킨다.
					list.get(i).setRank(list.get(i).getRank() + 1);
					*/
					// 현재 멤버 정보 꺼내고
					BlackPink black = list.get(i);
					int rank = black.getRank();
					black.setRank(rank + 1);
				}
				
			}
		}
		System.out.println();
		// 출력
		for(BlackPink black : list) {
			System.out.println(black);
		}
		// 정렬하기
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		for(int i = 0; i < list.size() - 1 ; i++) {
			for(int j = i + 1 ; j < list.size() ; j++) {
				int me = list.get(i).getRank();
				int order = list.get(j).getRank();
				if(me > order) {
					BlackPink tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
		for(BlackPink black : list) {
			System.out.println(black);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
