package day10;

/*
	1. 다음 변수를 가지는 Student 클래스를 제작하세요.
	
		String name
		int ban
		int no
		int kor
		int eng
		int math
		int total
		double avg
		
	2.  세 과목의 점수가 결정되면
		그 점수들을 이용해서 총점을 계산해서 세팅해주는 함수
		평균을 계산해서 세팅해주는 함수
	
	3. 이 클래스를 객체로 만들 수 있는 생성자를 정의하세요.
		1) 이름, 반, 번호를 알려주고 객체 만드는 방법
		
		2) 이름, 반, 번호, 각 과목 점수를 알려주면 객체를 만들 수 있는 방법
		
		3) 2) + 총점과 평균도 같이 세팅되게 객체가 만들어 지는 방법
		
		4) names 배열에 기억되어있는 이름들을 이용해서 5명의 데이터를 기억하는 
			배열을 만들고 정보를 출력하세요.
			반(1반), 번호(1번부터 차례대로)로 한다.
			점수는 랜덤하기 60 ~ 100 사이로 하기로 한다.
*/
public class Ex02_OOP {
	
	public Ex02_OOP() {
		// 여기에 실행할 내용들을 기술...
		String[] names = {"제니", "리사", "로제", "지수" , "광섭"};
				
		Student[] stud = new Student[5];
		// stud 배열은 현재 데이터가 아직 결정되어있지 않은 상태다.
		for(int i = 0 ; i < 5 ; i++) {
			int kor = (int)(Math.random() * 41 + 60);
			int eng = (int)(Math.random() * 41 + 60);
			int math = (int)(Math.random() * 41 + 60);
			stud[i] = new Student(names[i], 1, (i + 1), kor, eng, math);	
		}
		
		// 출력
		for(Student s : stud) {
			s.toprint();
		}
		
		
	}
	public static void main(String[] args) {
		new Ex02_OOP();
	}

}
