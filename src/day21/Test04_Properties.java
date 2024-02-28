package day21;

import java.util.*;
import java.io.*;
public class Test04_Properties {

	public Test04_Properties() {
		// 맵 준비하기
		Properties prop = new Properties();
		// 파일 연결 도구 준비
		FileInputStream fin = null;
		
		try {
			// 연결도구 만들고
			fin = new FileInputStream("src/day21/jennie.txt");
			// Map에 옮겨담는다
			prop.load(fin);
			// 위 행이 실행이 되면 prop에 데이터가 채워지게된다.
			
			
			printProp(prop);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 모두 사용한 자원 반환해주고
				fin.close();
			}catch(Exception e) {}
		}
	}
	
	// Properties 를 입력해주면 내용을 출력해주는 함수
	public void printProp(Properties p) {
		String name = p.getProperty("name"); // 키값을 이용해서 데이터를 문자열로 꺼내는 함수
		String sage = p.getProperty("age");
		int age = Integer.parseInt(sage);
		char gen = ((String)p.get("gen")).charAt(0);
		String tel = (String)p.get("tel"); // 키값을 입력해서 데이터를 Object로 꺼내는 함수.
		String addr = p.getProperty("addr");
		
		//출력
		System.out.printf("이름 : %s\n나이 : %3d\n성별 : %c\n전화 : %s\n주소 : %s", name, age, gen, tel, addr);
	}
	
	public static void main(String[] args) {
		new Test04_Properties();
	}

}
