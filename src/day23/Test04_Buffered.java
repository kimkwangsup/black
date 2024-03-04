package day23;

import java.io.*;
public class Test04_Buffered {
/*
	프로그램에서 작성한 내용을 파일에 저장하는 프로그램을 제작하세요.
 */
	public Test04_Buffered() {
		// 1. 반드시 장치에 연결되는 타겟(기본)스트림은 필요하다.
		FileOutputStream fout = null;
		// 2. 필요에 따라서 보조(필터)스트림을 연결해서 사용한다.
		BufferedOutputStream bout = null;
		
		try {
			// 기본 스트림 만들고
			fout = new FileOutputStream("src/day23/buffered.txt");
			// 보조 스트림 만들고
			bout = new BufferedOutputStream(fout);
			
			// 기록할 내용을 만든다.
			String str = "와 스 트 림 너 무 재 미 있 다 ! ";
			
			// 내용을 기록한다.
			
			// 버퍼에 기록하면 그 내용이 파일에 흘러 들어가서 기록된다.
			// 데이터를 바이트 단위로 변환해준다.
			byte[] buff = str.getBytes(); // 문자열을 byte 배열로 변환시켜서 반환해주는 함수.
			// 데이터를 흘려보낸다.
			bout.write(buff);
			
			/*
			 	참고 ]	
			 		버퍼메모리는 다 채워지지 않으면 데이터가 흘러가지 않는다.
			 		아직 데이터가 버퍼에 다 채워지지 않았으므로
			 		파일에 저장은 안된 상태가 된다.
			 		
			 		반드시 습관적으로 버퍼메모리를 비워주는 명령을 실행해주는것이 좋다.
			 		
			 			flush();
			 */
			
			bout.flush();
			
			System.out.println("#### 파일저장완료 ####");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bout.close();
				fout.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test04_Buffered();
	}

}
