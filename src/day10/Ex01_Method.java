package day10;

/*
	가로와 세로를 입력받아서
	사각형의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
	각 기능은 함수를 만들어서 처리하세요.
 */
import java.util.*;
public class Ex01_Method {
	Scanner sc;
	int width, height, area;
	
	// 생성자
	public Ex01_Method() {
		sc = new Scanner(System.in); // 변수 초기화
	}
	// 가로 세로를 입력받아서 기억시키는 함수
	public void setLen() {
		System.out.print("가로입력 : ");
		width = sc.nextInt();
		System.out.print("세로입력 : ");
		height = sc.nextInt();
		sc.close();
	}
	// 넓이 계산해서 셋팅해주는 함수
//	public void setArea() {
//		area = width * height;
//	}
	public void setArea() {
		area = width * height;
	}
	// 사각형 정보를 출력해주는 함수
	public void toPrint() {
		System.out.printf("가로가 [%d]이고 세로가 [%d]인 사각형의 넓이는 [%d] 입니다.", width, height, area);
	}
	
	public static void main(String[] args) {
		Ex01_Method e1 = new Ex01_Method();
		e1.setLen();
		e1.setArea();
		e1.toPrint();
	}

}