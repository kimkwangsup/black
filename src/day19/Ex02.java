package day19;

/*
	Semo 클래스를 정의하고
	ArrayList 에 Semo 7개를 랜덤하게 만들어서 기억시키고
	넓이 기준 오름차순 정렬해서
	출력하세요.
 */
import java.util.*;
public class Ex02 {

	public Ex02() {
//		Random rand = new Random();
//		Semo se = new Semo();
//		ArrayList semo = new ArrayList();
//		for(int i = 0 ; i < 7; i++) {
//			int width = (int)(rand.nextInt(41) + 60);
//			int height = (int)(rand.nextInt(41) + 60);
//			Semo s = new Semo(width, height);
//			semo.add(s);	
//			
//		}
//		for(int i = 0 ; i < semo.size() - 1; i++) {
//			for(int j = i ; j < semo.size(); j++) {
//				double fst = (double)((Semo)semo.get(i)).getArea();
//				double sec = (double)((Semo)semo.get(j)).getArea();
//				if(fst > sec) {
//					Semo sem = (Semo)semo.get(i);
//					semo.set(i, semo.get(i));
//					semo.set(j, sem);
//				}
//			}
//		}
//		for(int i = 0 ; i < semo.size(); i++) {
//			Semo semo1 = (Semo)semo.get(i);
//			System.out.println(semo1);
//		}
		ArrayList list = new ArrayList();
		Random rnd = new Random();
		for(int i = 0 ; i < 7 ; i++) {
			// Semo 준비
			// 밑변 높이 랜덤하게 만들기
			int w = rnd.nextInt(20) + 1;
			int h = rnd.nextInt(20) + 1;
			Semo tmp = new Semo(w, h);
			// 준비된 Semo를 리스트에 채워준다
			list.add(tmp);
		}
		for(int i = 0 ; i < list.size(); i++) {
			Object o = list.get(i);
			System.out.println(o);
			
		}
		
		for(int i = 0 ; i < list.size() - 1; i++) {
			for(int j = i + 1 ; j < list.size() ; j++) {
				Semo s1 = (Semo) list.get(i);
				Semo s2 = (Semo) list.get(j);
				double a1 = s1.getArea();				
				double a2 = s2.getArea();
				if(a1 > a2) {
					// 임시변수
					Object tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
		System.out.println("---------------------------------");
		
		for(Object o : list) {
			System.out.println(o);
		}
	}
		
	public static void main(String[] args) {
		new Ex02();
		
	}

}
