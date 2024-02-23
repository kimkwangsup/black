package day16;

/*
	강제 예외 던지기
	==> JVM은 예외로 인정하지 않는데
		( ==> 예외처리가 전혀 필요하지 않는데..)
		프로그램의 목적상 예외로 인정해야 하는 경우가 있을 수 있다.
		
		예 ]
			나이는 음수로 입력하면 안된다.
			이런 경우에 사용자가 이것은 문제가 있다고
			JVM 에게 강제로 알려주는 방법
			
		형식 ]
			throw new 예외클래스();
			
		주의 ]
			예외전이	: throws 예외클래스
			예외던지기 	: throws new 예외클래스();
 */
public class Test02_Exception {

	public Test02_Exception() {
		System.out.println("강제 예외 발생 전");
		
		try {
			throw new Exception();
			// 이 행은 반드시 예외가 발생하는 행...
			// 그대로 두면 문제가 있다고 JVM이 판단할 것이다.
		} catch(Exception e) {
			System.out.println("예외발생");
		}
		System.out.println("예외처리 후");
	}

	public static void main(String[] args) {
		new Test02_Exception();
	}

}
