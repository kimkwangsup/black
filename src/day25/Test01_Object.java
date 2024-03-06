package day25;

import java.io.*;
public class Test01_Object {
	// BlackPink 객체를 입력받아서 내용을 출력해주는 함수
	public void toPrint(BlackPink b) {
		// 데이터 꺼내고
		String name = b.getName();
		String tel = b.getTel();
		String mail = b.getMail();
		int age = b.getAge();
		double height = b.getHeight();
		
		// 출력
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + tel);
		System.out.println("메일 : " + mail);
		System.out.println("나이 : " + age);
		System.out.println("  키 : " + height);
		
	}
	public Test01_Object() {
		// ObjectOutputStream 을 이용해서 저장한 파일 
		// jennie.txt 파일을 읽어서 출력해보자.
		
		// 스트림 준비
		// 기본(타겟)스트림 준비
		FileInputStream fin = null;
		// 필터(보조)스트림 준비
		ObjectInputStream oin = null;
		
		try {
			// 기본스트림 만들고
			fin = new FileInputStream("src/day25/jennie.txt");
			// 보조스트림 만들고
			oin = new ObjectInputStream(fin);
			
			// 데이터 읽고
			BlackPink jennie = (BlackPink) oin.readObject();
			/*
			// 데이터 준비
			String name = jennie.getName();
			String tel = jennie.getTel();
			String mail = jennie.getMail();
			int age = jennie.getAge();
			double height = jennie.getHeight();
			// 출력하고
			System.out.println("이름 : " + name);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("나이 : " + age);
			System.out.println("  키 : " + height);
			*/
			// 함수로 만들어서 처리해보자.
			
			toPrint(jennie);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oin.close();
				fin.close();
			}catch(Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
		new Test01_Object();
	}
	
	public int kyosi = 7;
	public String tname;
}
