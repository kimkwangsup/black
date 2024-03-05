package day24;

import java.io.*;
public class Test04_BufferedReader {
/*
	Test02_FileReader.java
	파일을 읽어보자.
 */
	public Test04_BufferedReader() {
		// 문자 배열로 처리하지 않고 한 줄씩 읽어서 처리할 것이므로
		// 보조스트림 BufferedReader를 이용해보자.
		// 그러나 기본(타겟) 스트림은 반드시 필요하다
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 스트림 만들기
			fr = new FileReader("src/day24/Test02_FileReader.java");
			br = new BufferedReader(fr);
			
			// 한 행씩 읽어나갈 것이지만 몇행을 읽어야할지 모르므로.
			while(true) {
				String line = br.readLine(); // 줄 바꿈 기호를 찾으면 읽는것을 멈춘다.
				if(line == null	) {
					// 읽은 데이터가 없는 경우이므로
					break;
				}
				// 출력
				// 이때 줄바꿈 기호를 만나서 읽는 것을 멈춘 상태이기 때문에
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test04_BufferedReader();
	}

}
