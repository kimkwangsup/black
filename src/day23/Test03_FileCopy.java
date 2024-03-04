package day23;

import java.io.*;
public class Test03_FileCopy {
/*
	이미지 파일을 복사해보자.
 */
	public Test03_FileCopy() {
		// 복사기능이므로 들어오는 스트림과 나가는 스트림이 필요하다.
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			// 스트림 연결하고
			fin = new FileInputStream("src/day23/chopper.jpg");
			fout = new FileOutputStream("src/day23/chopper01.jpg");
			
			// 배열변수 준비
			byte[] buff = new byte[256];
			while(true) {
				int len = fin.read(buff);
				if(len == -1) break;
				
				// 파일 기록하고
				fout.write(buff, 0, len);			
				
			}
			// 메세지 출력
			System.out.println("### 파일 복사 완료 ###");
			
			// 몇개를 읽을지 모르므로 반복해서 처리
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03_FileCopy();
	}

}
