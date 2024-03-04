package day23;

import java.io.*;
public class Test07_Print {
/*
 	PrintStream
 		필터스트림의 일종
 		사용자 편의성, 기능향상을 동시에 만들어 놓은 보조스트림.
 		
 		기능
 			1. 내부적으로 BufferedOutStream 과 연결해 놓았다.
 			2. 사용자 편의를 위해서 자바의 데이터 타입을 그대로 출력할 수 있도록 해 놓았다.
 			3. 파일과 직접 연결하도록 해 놓았다.
 				==> 기본 스트림을 준비하지 않아도 사용할 수 있는 스트림이다.
 					<== 내부적으로 기본스트림이 만들어져서 사용되게 한다.
 					
 		단점 ]
 			한 쌍을 이루는 입력계열 스트림이 없다.
 */
	public Test07_Print() {
		// 시 한편을 저장해보자.
		// 스트림 준비
		PrintStream ps = null;
		try {
			// 스트림 만들고
			ps = new PrintStream("src/day23/poet.txt");
			// 이 스트림은 파일에 연결된 보조스트림 이다.
			// 따라서 이 스트림에 데이터를 쓰면 파일로 저장된다.
			ps.println("진달래꽃");
			ps.println("김소월");
			ps.println();
			ps.println("나 보기가 역겨워 가실 때에는");
			ps.println("말 없이 고이 보내 드리오리다.");
			ps.println();
			ps.println("영변 약산 진달래 꽃");
			ps.println("아름 따라 가실 길에 뿌리오리다.");
			ps.println();
			ps.println("가시는 걸음 걸음 놓인 그 꽃을");
			ps.println("사뿐히 즈려밟고 가시옵소서.");
			ps.println();
			ps.println("나보기가 역겨워 가실 때에는");
			ps.println("죽어도 아니 눈물 흘리오리다.");
			
			ps.flush();
			// 내부적으로 BufferedStream 을 사용하고 있으므로
			// Buffer 를 비워주는 명령이 필요하다.
			System.out.println("### 진달래 만들기 ###");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			}catch(Exception e) {}
			
		}
		
	}

	public static void main(String[] args) {
		new Test07_Print();
	}

}
