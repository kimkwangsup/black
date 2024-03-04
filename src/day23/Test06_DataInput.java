package day23;

import java.io.*;
public class Test06_DataInput {
/*
	참고 ]
		DataOutputStream 으로 저장한 파일은 반드시 
		DataInputStream 을 이용해서 열어야 하고,
		저장한 순서도 일치시켜서 읽어야 한다.
 */

	public Test06_DataInput() {
		// 스트림 준비
		// 기본스트림
		FileInputStream fin = null;
		// 보조스트림
		DataInputStream din	= null;
		
		try {
			// 기본스트림 만들고
			fin = new FileInputStream("src/day23/friend.txt");
			// 보조스트림 만들고(보조스트림은 기본스트림에 연결해서 사용한다.)
			din = new DataInputStream(fin);
			// 데이터 읽고
			// 저장할 때 이름, 나이, 키, 성별, 전화번호, 이메일 
			// 순으로 저장했으므로 읽을 때도 이 순서를 반드시 지켜야 한다.
			String name = din.readUTF();
			int age = din.readInt();
			double height = din.readDouble();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			// 출력
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("키   : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				din.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test06_DataInput();
	}

}
