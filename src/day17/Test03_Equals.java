package day17;

/*
	번호가 같으면 같은 학생으로 해서
	중복된 학생 없이 10명의 학생의 과목정보를 입력하고
	내용을 출력하세요.
 */
public class Test03_Equals {

	public Test03_Equals() {
		Stud[] stud = new Stud[10];
		
		// 10명 채워준다.
		loop:
		for(int i = 0 ; i < stud.length ; i++) {
			// 번호만들고
			int no = (int)(Math.random() * 15 + 1);
			// 과목점수
			int kor = (int)(Math.random() * 41 + 60);
			int eng = (int)(Math.random() * 41 + 60);
			int math = (int)(Math.random() * 41 + 60);
			Stud s = new Stud(no, kor, eng, math);
			
			// 중복검사
			for(int j = 0 ; j < i ; j++) {
				Stud tmp = stud[j];
				if(s.equals(tmp)) {
					// 중복된 경우
					i--;
					continue loop;
				}
			}
			
			stud[i] = s;
		}
		
		// 정보출력
		for(Stud s : stud) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test03_Equals();
	}

}

class Stud implements Cloneable{
	private int no, kor, eng, math, total;
	private double avg;
	public Stud() {}
	public Stud(int no) {
		this.no = no;
	}
	public Stud(int no, int kor, int eng, int math) {
		this(no); 
		// 이 함수는 위의 번호를 입력받는 생성자를 호출하는 방법
		// 이 함수는 반드시 생성자 내부에서만 호출할 수 있고
		// 이 때, 반드시 생성자의 첫 문장, 첫 명령으로 사용해야 한다.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
		setAvg();
	}
	// getters & setters
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() { // 오버로딩
		total = kor + eng + math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setAvg() { // 오버로딩
		avg = total / 3.0;
	}
	@Override
	public boolean equals(Object o) {
		return no == ((Stud)o).getNo();
	}
	@Override
	public String toString() {
		return "번호 : " + no + ", 총점 : " + total + ", 평균 : " + avg + "\n\t" + 
					"국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		/*
			이 클래스 내에는 clone() 가 있다.
			하지만 다른 클래스에서는 내가 가진 clone() 사용할 수 없다.
			이 함수의 접근지정자가 protected 이기 때문이다.
			그러면 이 함수의 접근지정자를 public 으로 고쳐쓰면 
			다른 곳에서도 사용가능해질 것이다. (오버라이딩 규칙 2)
			
			문제는 오버라이딩을 하는 순간 상위클래스가 가졌던 기능은 사라지게 된다.
			그러면 이 함수 내에서 자기 자신을 복제해주는 기능을 구현해줘야 된다.
			상속 받은 클래스에서 상위 클래스의 멤버를 강제로 사용하는 방법이 하나 있다.
				super
			라는 약속된 변수를 사용하면 된다.
		 */
		Object o = super.clone(); // 상위클래스의 기능으로 
		
		return o;
	}
	
}