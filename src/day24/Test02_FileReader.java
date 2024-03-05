package day24;

import java.io.*;
public class Test02_FileReader {
/*
	FileWriter 로 저장한 파일을 읽어보자
 */
	public Test02_FileReader() {
		// 스트림 준비
		FileReader fr = null;
		try {
			// 스트림 만들고
			fr = new FileReader("src/day24/test.txt");
			// 데이터 읽고
			/*
			// 1. 한글자만 읽어보자.
			int ch = fr.read();
			// 출력하고
			System.out.println((char)ch);
			*/
			
			// 2. 여러글자 읽어보자
			// 문자배열 준비
			char[] buff = new char[1024];
			// 읽는다
			int len = fr.read(buff); // 반환값은 읽은 문자의 갯수
			// 문자열로 만들어준다.
			String str = new String(buff, 0, len);
			// 출력하기.
			System.out.println(str);
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02_FileReader();
	}

}
