package day19;

import java.util.*;
public class Test01_ArrayList {

	public Test01_ArrayList() {
		// 멤버들을 기억할 리스트 만들고
		ArrayList blackPink = new ArrayList();
		// 리스트에 멤버들 데이터 채우고
		ArrayList names = new ArrayList();
		names.add("제니");
		names.add("리사");
		names.add("로제");
		names.add("지수");
		
		// 반복해서 채우기
		for(int i = 0 ; i < names.size() ; i++) {
			// 필요한 데이터 준비
			// 이름
			String name = (String) names.get(i);
			// 과목점수
			Random rand = new Random();
			int kor = rand.nextInt(41) + 60;
			int eng = rand.nextInt(41) + 60;
			int math = rand.nextInt(41) + 60;
			// 멤버 객체 만들어서 채워주고
			BlackPink memb = new BlackPink(name, kor, eng, kor);
			blackPink.add(memb);
		}
		
		for(int i = 0 ; i < blackPink.size(); i++) {
			// 데이터 꺼내고
			BlackPink memb = (BlackPink) blackPink.get(i);
			// 출력
			System.out.println(memb);
		}
		System.out.println("********************************************************************");
		
		// 순위 구하기
		for(int i = 0 ; i < blackPink.size() ; i++) {
			// 현재 멤버의 순위를 1로 셋팅
			BlackPink memb = (BlackPink) blackPink.get(i);
			memb.setRank(1);
			//((BlackPink) blackPink.get(i)).setRank(1);
			
			// 현재 멤버보다 점수가 높은 멤버가 있으면 랭크를 1올려준다.
			for(int j = 0 ; j < blackPink.size(); j++) {
				BlackPink next = (BlackPink) blackPink.get(j);
				// 다른 멤버 랭크
				int chong = next.getTotal();
				// 내 랭크
				int total = memb.getTotal();
				if(total < chong) {
					// 현재 내 랭크
					int rank = memb.getRank();
					memb.setRank(rank + 1);
				}
			}
		}
		
		// 정렬하기


		for(int i = 0 ; i < blackPink.size(); i++) {
			// 데이터 꺼내고
			BlackPink memb = (BlackPink) blackPink.get(i);
			// 출력
			System.out.println(memb);
		}
	}

	public static void main(String[] args) {
		new Test01_ArrayList();
	}

}
