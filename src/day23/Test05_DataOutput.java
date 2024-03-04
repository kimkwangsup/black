package day23;

import java.io.*;
public class Test05_DataOutput {
/*
	파일에 친구의 정보를 저장해보자.
		이름		: String
		나이		: int
		키			: double
		성별		: char
		전화번호	: String
		메일주소	: String
		
		
 */
	public Test05_DataOutput() {
		// 스트림 준비
		// 기본스트림
		FileOutputStream fout = null;
		// 보조스트림
		DataOutputStream dout = null;
		
		try {
			// 기본스트림 만들고
			fout = new FileOutputStream("src/day23/friend.txt");
			// 보조스트림 만들고
			dout = new DataOutputStream(fout);
			// 데이터 준비
			String name = "jennie";
			int age = 28;
			double height = 165.5;
			char gen = 'F';
			String tel = "010-1212-1212";
			String mail = "jennie@human.com";
			// 준비된 데이터를 보조스트림에 흘려보내면 된다.
			// DataInput/Output 의 특징은 자바의 데이터를 변환 없이 사용할 수 있다는 점이다.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(height);
			dout.writeChar(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
			System.out.println("### 파일 저장 완료 ###");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05_DataOutput();
	}

}
