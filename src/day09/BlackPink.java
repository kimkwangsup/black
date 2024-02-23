package day09;

public class BlackPink {
	private String name;
	private int age;
	private String tel;
	private char bType;
	
	// 생성자
	public BlackPink() {}
	public BlackPink(String name, int age, String tel, char bType) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.bType = bType;
	}
	/*
	 	이 클래스처럼 
	 	클래스 내부에 데이터를 기억 할 변수들로만 구성된 클래스를
	 	VO(Value Object) 클래스라 부른다.
	 	DTO(Data Transfer Object) 클래스라고 부르기도 한다.
	 	
	 	참고 ]
	 	
	 		VO 클래스 내부의 변수들은	
	 		생성할 때 원칙이 아무 곳에서나 접근해서 수정하거나 사용할 수 없게 해야 한다.
	 		
	 		형식 ]
	 			
	 			private 데이터타입 변수이름;
	 			
	 			이 때 private 는 식별자를 사용할 수 있는 접근권한 중 한가지이다.
		 			public		: 모든 곳에서 접근 가능
		 			protected	: 현재 패키지 내에서와 상속받은 클래스 내에서 접근 가능하다.
		 			생략		: 현재 패키지 내에서 어디서든 접근 가능
		 			private 	: 현재 클래스에서만 접근 가능
	 			네가지가 있다.
	 			
	 			이때 접근 지정자가 private 으로 설정이 되면 현재 클래스에서만 
	 			변수의 데이터를 셋팅하거나 읽을 수 있으므로 외부에서는 사용 못하게 된다.
	 			그래서 외부에서 사용가능하도록 해주는 방법이 함수를 만들어서
	 			값을 세팅하고 꺼내서 사용할 수 있도록 하고 있다.
	 			이 때 만들어지는 이 함수들을 getter, setter 함수라 한다.
	 			
	 		이렇게 프로그램에서 중요한 요소 변수를 접근지정자로 감춰놓는 것을
	 			은닉화
	 		라 부르고, 여러개의 변수와 그 변수를 사용할 수 있게 해주는 함수들을
	 		하나의 클래스로 감싸는 것을
	 			캡슐화
	 		라 부른다.
	 		
	 		**********
	 		은닉화/캡슐화
	 */
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public char getbType() {
		return bType;
	}
	public void setbType(char bType) {
		this.bType = bType;
	}
	
}
