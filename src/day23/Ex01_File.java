package day23;

import java.io.*;
public class Ex01_File {

	/*
		day22.Test02_File.java
		파일을 읽어서 준비된 변수에 모두 채워서 출력하세요.
	 */
	public Ex01_File() {
		// 스트림 준비
		FileInputStream fin = null;
		
		// 읽은내용 기억 기억할 변수
		String result = "";
		StringBuffer buffer = new StringBuffer(result);
		try {
			fin = new FileInputStream("src/day22/Test02_File.java");
			
			while(true) {
				byte[] buff = new byte[256];
				int len = fin.read(buff);
				if(len == -1) {
					break;
				}
				result = new String(buff, 0, len);
				/*
				1)
				System.out.print(result);
				*/
				buffer.append(result);
			}
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch(Exception e) {}
		}
		System.out.println(buffer.toString());
	}

	public static void main(String[] args) {
		new Ex01_File();
	}
}