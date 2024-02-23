package day10;

import day09.*;
public class Test01_ObjectArray {
/*
	함수 : 기능의 기본 단위
		   프로그램의 최소 단위
		   
		   형식 ]
		   
		   		[접근지정자] [속성] 반환값타입 함수이름(매개변수리스트){
		   			처리내용...
		   			
		   			return [데이터];
		   		}
		   		
		   		반환값타입 : 함수는 그 함수가 처리해야될 임무가 있다.
		   					 예를 들면 두 수를 더하는 작업 또는 이름을 알려주는 임무라든지...
		   					 그 임무가 수행이 되면 그 결과를 알려줘야 되는 경우가 생길 수 있다.
		   					 이 때 알려주는 데이터의 타입을 말한다.
		   					 
		   					 반환값이 없는 경우에는 생략하는 것이 아니고
		   					 반드시 반환값이 없다는 의미로 "void" 라고 적어야 한다.
		   					 
		   		return ]
		   			1. 현재 실행중인 함수를 즉시 종료하세요.
		   			2. 반환값이 있으면 반환해주고 실행중인 함수를 즉시 종료하세요.
 */
	public static void main(String[] args) {
		// Student 에 제니 데이터를 채워보자
		day09.Student jennie = new day09.Student("제니", 100, 100, 95); // 한명의 학생 데이터를 채울 준비
//		jennie.name = "제니"; 
		// 접근지정자가 생략된 경우이므로 
		// 같은 클래스 그리고 같은 패키지 내에서만 접근이 가능하다.
		
		
		System.out.println("이름 : " + jennie.getName());
		
		day09.Student kwang = new day09.Student("광섭", 100, 95, 100);
		
		// 내 이름 꺼내기
		System.out.println("이름 : " + kwang.getName());
		
	}

}
