package day23;

/*
	day22.Test03_File.java
	파일을 복사해서
	CopyFile.txt
	파일로 만들어보자.
 */
import java.io.*;
public class Test02_FileCopy {
/*
	할일
		스트림은 단방향이다.
		그런데 복사 기능은 데이터가 프로그램으로 들어와서 
		다시 나가는 형태로 구현이 되어야 한다.
		따라서 스트림은 들어오는 방향과 나가는 방향이 모두 필요하다.
		
 */
	public Test02_FileCopy() {
		// 스트림 준비
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			// 스트림만들고
			fin = new FileInputStream("src/day22/Test03_File.java");
			fout = new FileOutputStream("src/day23/CopyFile.txt");
			
			// 먼저 읽어서 읽은 데이터를 내보내면 된다.
			// 몇번 반복해야 할지 모르므로..
			// 배열 준비
			byte[] buff = new byte[512];
			while(true) {
				// 데이터 읽고
				int len = fin.read(buff);
				if(len == -1) {
					break;
					// 읽은 데이터를 파일에 쓰면 된다.
				}
				fout.write(buff, 0, len);
			}
			System.out.println("*** 파일 저장 완료! ***");
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
		new Test02_FileCopy();
	}

}
