package day24;

import java.io.*;
public class Test05_BufferedReader {
/*	
	byte 단위 기본 스트림에
	char 단위 보조스트림을 연결해서
	Test02_FileReader.java
	를 출력하세요.
 */
	public Test05_BufferedReader() {
		FileInputStream fs = null;
		InputStreamReader is = null;
		BufferedReader br = null;
		try {
			fs = new FileInputStream("src/day24/Test02_FileReader.java");
			is = new InputStreamReader(fs);
			br = new BufferedReader(is);
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				is.close();
				fs.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05_BufferedReader();
	}

}
