package day25;

import java.io.*;
public class Test00_Object {
/*
	제니 데이터를 저장해보자.
 */
	public Test00_Object() {
		// 기본스트림
		FileOutputStream fout = null;
		// 보조스트림
		ObjectOutputStream oout	= null;
		
		try {
			fout = new FileOutputStream("src/day25/jennie.txt");
			oout = new ObjectOutputStream(fout);
			
			// 데이터 준비
			BlackPink jennie = new BlackPink("제니", "010-1212-1212", "jennie@human.com", 28, 165.5);
			
			// 데이터 기록하고
			oout.writeObject(jennie);
			
			// 결과출력
			System.out.println("###저장완료###");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test00_Object();
	}

}
