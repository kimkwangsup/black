package day23;

import java.io.*;
import java.util.Arrays;
public class Test01_FileInput {
/*
	FileOutputStream 으로 저장한 data.txt 파일을 읽어보자.
 */
	public Test01_FileInput() {
		// 할일
		// 1. 외부장치(파일)과 연결할 타겟스트림(기본스트림)을 준비한다.
		FileInputStream fin = null;
		
		// 문제 ] 아래변수에 읽은 데이터를 모두 채워주세요.
		String result = "";
		
		try {
			// 2. 스트림을 파일과 연결한다.
			fin = new FileInputStream("src/day23/data.txt");
			// 3. 데이터를 읽는다.
			
			/*
			// 1) 한글자만 읽기
			int ch = fin.read(); 
			//이 함수는 반환값이 읽은 문자의 아스키코드를 반환해준다.
			// 출력
			System.out.println((char)ch);
			*/
			/*
			// 2) 한 행 데이터 모두 읽어보자.
			// 2-1. 기억할 배열준비
			byte[] buff = new byte[256];
			// 2-2. 내용을 읽어서 배열에 기억시킨다.
			int len = fin.read(buff); 
			// 읽은 문자의 데이터 수를 반환해준다. 이때 읽은 데이터는 buff 배열에 기억이 된다.
			
			// 2-3. 읽은 데이터를 문자열로 만든다.
			String str = new String(buff,0,len);
			// 출력
			System.out.println("읽은 데이터 : "+str);
			*/
			// 3. 여러 행으로 저장된 파일을 읽어보자. : day22.Test02_File.java
			// 1) 언제 끝날지 모르니까 반복해서 처리한다.
			// 스트림 다시 준비하고
			fin.close();
			fin = new FileInputStream("src/day22/Test02_File.java");
			while(true) {
				// 일단 한번에 적당량을 읽어보자.
				byte[] buff = new byte[256];
				// 읽는다. 배열의 갯수만큼 읽어준다.
				int len = fin.read(buff);
				if(len == -1) {
					// read() 읽은 데이터가 없는 경우 -1 을 반환해준다.
					// 읽기 작업이 모두 끝난 후이다.
					// 따라서 반복 작업을 종료해준다.
					break;
				}
				// 문자열로 변환
				String msg = new String(buff, 0, len);
				
				// 출력
				System.out.print(msg); 
				// 줄바꿈 기호도 문자이므로 배열에 기억될 것이고 
				// 여기서 println() 함수를 호출하면 
				// 함수 자체적으로 줄 바꿈 기능이 있기 때문에 문서의 내용과는 무관하게 줄바꿈이 될 것이기 때문이다.
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 스트림 사용이 끝났으므로 닫아 반환해준다.
			try { 
				fin.close();
			}catch(Exception e) {}
		}
		/*
		int[] nums = new int[5];
		setArr(nums);
		System.out.println(Arrays.toString(nums));
	*/
	}
	public int setArr(int[] no) {
		for(int i = 0 ; i < no.length; i++) {
			no[i] = i + 1;
		}
		return no.length;
	}
	

	public static void main(String[] args) {
		new Test01_FileInput();
	}

}
