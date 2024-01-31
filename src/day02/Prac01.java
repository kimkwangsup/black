package day02;

public class Prac01 {
	public static void main(String[] args) {
		// 유재석의 나이, 키, 몸무게, 종교, 병역, 소속사
		
		String name;
		int age;
		double height;
		double weight;
		String god;
		String army;
		String vid;
		
		name = "유재석";
		age = 51;
		height = 178.0;
		weight = 61.8;
		god = "불교";
		army = "제 52보병사단 상병 소집해제";
		vid = "안테나";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("무게 : " + weight);
		System.out.println("종교 : " + god);
		System.out.println("병역 : " + army);
		System.out.println("소속 : " + vid);
	}
}
