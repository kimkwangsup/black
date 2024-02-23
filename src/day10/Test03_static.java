package day10;

public class Test03_static {

	public static void main(String[] args) {
		System.out.println("나이 : " + Memb.age);
		System.out.println("나이 : " + Memb.getAge());
//		System.out.println("이름 : " + Memb.setAge()); 
		// setAge() 함수는 아직 메모리에 올려져있지 않은 상태다.
		// 따라서 사용할 수 없다.
		
		
		
		// Memb 의 멤버를 사용하려면
		// 먼저 new 시켜서 메모리에 올려놓아야 사용할 수 있다.
		// 현재는 아직 new 시키지 않은 상태이므로
		// 대부분의 멤버를 사용할 수 없다.
		
		Memb memb = new Memb();
		// Memb() : 기본 생성자
		// 			생성자를 하나도 정의하지 않으면 JVM이 알아서 만들어주는 생성자
		memb.setAge();
		System.out.println("age1 : " + Memb.age);
		System.out.println("age2 : " + memb.getAge());
		System.out.println("이름 : " + memb.name);
		System.out.println("이름 : " + memb.getName());
	}

}

class Memb{
	String name = "제니";
	static int age = 28;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge() {
		age += 1;
		
	}
	public static int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}