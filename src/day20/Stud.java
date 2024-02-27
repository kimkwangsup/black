package day20;

public class Stud implements Comparable {
	private int no, score;
	private String name;
	
	public Stud() {}
	public Stud(String name, int no) {
		this.name = name;
		this.no = no;
	}
	public Stud(String name, int no, int score) {
		this(name, no); // 위에서 정의한 이름과 번호를 입력하는 생성자 호출.
		this.score = score;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "***\n\t이름 : " + name + "\n\t번호 : " + no + "\n\t점수 : " + score;
	}
	@Override
	public int compareTo(Object o) {
		// 점수 기준으로 비교 가능하게 구현
		/*
		 	Stud s1 = new Stud();
		 	Stud s2 = new Stud();
		 	일 경우
		 	s1에서 이 함수를 사용할 때는
		 		s1.compareTo(s2);
		 	의 형식으로 이 함수를 호출할 것이다.
		 	이 때, s2를 입력해주는 순간 Stud 타입이 Object 타입으로 자동 형변환 할 것이다.
		 	그래서 함수 내부에서는 Object 타입으로 사용 될 것이다.
		 	
		 	따라서 우리는 이 클래스가 가지고 있는 멤버를 사용하려면 
		 	원래 형태 Stud 타입으로 강제 형변환 해줘야 한다.
		 */
		Stud s = (Stud) o;
		int other_score = s.getScore();
		
		return -(score - other_score);
		/*
		 	이 경우 반환값이 음수인 경우는 위치를 바꾸지 않고
		 	양수인 경우는 바꾸고
		 	0인 경우는 같은 클래스로 처리하게 된다.
		 */
	}
}
