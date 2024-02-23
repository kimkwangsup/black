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
public class Student {
	String name;
	int kor, eng, math, total, ban, no;
	double avg;
	
	// 총점 계산해서 셋팅해주는 함수
	public void setTotal() {
		// 이 함수는 국어, 영어, 수학 점수가
		// 입력이 끝난 상태에서 실행 되는 함수
		total = kor + eng + math;
	}
	
	// 평균 계산해서 셋팅해주는 함수
	public void setAvg() {
		// 이 함수 역시 총점 계산이 끝난 후에 호출되는 함수
		// 총점이 계산되어있다 라는 가정 하에서 함수의 내용을 작성하면 된다.
		avg = total / 3.0;
	}
	// 1. 
	public Student() {}
	
	// 2.
	public Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	// 3. 
	public Student(int ban, int no, String name, int kor, int eng, int math) {
		this(name, ban, no); // 2번 생성자 호출
		/*
		this.name = name;
		this.ban = ban;
		this.no = no;
		*/
		/*
			this()
			==> 생성자 함수는 여러개 정의될 수 있고
				이 때 각 생성자의 기능은 비슷할 수 있다.
				그런데 생성자는 원칙적으로 일반 함수처럼 호출해서 사용할 수 없다.
				유일하게 생성자를 호출할 수 있는 방법이
				this() 
				이다.
				
				*****
				이 함수 호출은 
				1. 반드시 생성자의 내에서만 호출할 수 있고
				2. 생성자의 첫 번째 행에서만 호출할 수 있다.
		 */
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
		setAvg();
	}
	// 가변인자를 이용해서 처리하는 방법
	public Student(String name, int ... info) {
		this(info[0], info[1], name, info[2], info[3], info[4]); // 3번 생성자 호출
		/*
		// new Student("제니", 1, 1, 90, 100, 95) 
		this.name = name;
		this.ban = info[0];
		this.no = info[1];
		this.kor = info[2];
		this.eng = info[3];
		this.math = info[4];
		setTotal();
		setAvg();
		*/
	}
	
	// 정보 출력해주는 함수
	public void toprint() {
		System.out.printf("%s | %d반 | %d번 | 국어 : %3d, 영어 : %3d, 수학 : %3d, 총점 : %3d, 평균 : %5.2f\n",
							name, ban, no, kor, eng, math, total, avg);
	}
}
