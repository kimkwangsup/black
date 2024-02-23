package day17;

public class Test04_Clone {
/*
	Object 클래스의 멤버 함수로
		toString()
		equals()
		
		clone() : 객체 자기 자신을 깊은 복사해주는 함수.
					이 함수는 protected 함수이므로
					상속받은 클래스나 
					같은 패키지 내에서는 사용할 수 있다.
					
		hashCode() : 자바는 주소를 노출시키지 않기 위해서
					 해쉬테이블을 이용해서 주소를 관리한다.
					 그 해쉬코드를 반환해주는 기능의 함수
		
 */
	public Test04_Clone() {
		Stud s = new Stud(1, 90, 90, 90);
		
		Stud s1 = null;
		Stud s2 = s;
		
		
		try {
			s1 = (Stud)s.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(s.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s : " + s);
		System.out.println("s2 : " + s2);
		System.out.println(s1.hashCode());
		System.out.println(s1);
	}

	public static void main(String[] args) {
		new Test04_Clone();
	}

}
