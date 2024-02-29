package day22;

import java.io.*;
import java.util.Arrays;
public class Test01_IO {
/*
	IO( Input, Output: 외부 장치와의 통신에 필요한것들을 모아놓은 패키지)
	
		스트림(Stream)
		==> 자바는 외부 장치와 데이터를 주고받는 방법을
			하나의 방법으로 통일시켜 놓았다.
			그 방법이 Stream 이다.
			
			스트림은 빨대와 같다.
			
			즉, 스트림을 데이터를 주고 받을 외부장치에 꽂기만 하면
			나는 빨대를 흡입만 하면(같은 함수를 이용한다.)
			외부장치의 데이터가 들어온다.
			
			참고 ]
				스트림은 단방향이다.
				즉, 하나의 스트림은 한 방향으로만 데이터가 전송이 된다.
				만약 같은 외부장치에 데이터를 주기도 하고 받기도 하려면
				스트림이 2개가 필요하다.
				
	스트림의 종류
	
		방향성에 대한 분류
			1. 프로그램으로 데이터가 들어오는 방향
				InputStream, Reader
			
			2. 프로그램에서 나가는 방향
				OutputStream, Writer
				
		데이터의 양에 대한 분류
			1. byte 단위 : 1바이트씩 처리를 하므로 조금 느리다.
							그런데 기계어도 처리가 가능하다.
							실행파일도 전송가능하다.
							
				InputStream, OutputStream
				
			2. 문자단위(Char 단위, 2byte) : 속도는 조금 빠르다. 오직 문자만 처리 가능하다.
			
				Reader, Writer
				
			참고 ]
				byte가 char로 합쳐지는 순간
				운영체제에 따라서 비트순서가 뒤바뀔 수도 있다.
				따라서 실행파일이나 이미지 파일 등은 문자단위로 전송하면 안된다.
				
		대상에 따른 분류

			1. 타겟스트림(기본스트림, Target Stream)
				==> 외부장치에 직접 연결되는 스트림
					따라서 외부장치와 통신을 하려면
					이 기본 스트림이 필수적이다.
			
			2. 필터스트림(보조스트림, 
				==> 스트림의 성능향상, 기능향상, 편의성 제공을 위해서
					스트림에 연결되는 보조적인 스트림이다.
					
			참고 ]
				기본스트림은 필수적이고
				보조스트림(필터스트림)은 필요에 따라서 선택적으로 연결해서 사용한다.
				
		
	1. InputStream
		
		주요함수 ]
			
			int read()
			==> 오직 한 문자만(1byte) 읽어들이는 함수
			
				반환값 : 읽은 문자
				
			int read(byte[] b)
			==> 여러 바이트를 읽어들이는 함수
				읽은 결과는 byte[] b에 저장이 된다.
				
				반환값 : 읽은 바이트의 갯수
				
				==> 비어있는 바이트 배열을 입력해서 실행하면
					읽은 바이트 수를 반환해주고
					비어있는 배열에 읽은 데이터를 채워준다.
					
			int read(byte[] b, int off, int len)
			==> 여러 바이트를 읽어들이는 함수
				단, 배열의 지정한 부분부터 지정한 갯수만큼만 읽어준다.
				
				반환값 : 읽은 바이트 수
				
	2. FileInputStream
		==> 파일에 연결되는 스트림
			
			생성방법 ]
				FileInputStream(String name)
				==> 스트림을 연결할 파일의 이름을 이용해서 스트림을 연결한다.
				
	3. FileOutputStream
		==> 파일로 연결된 내보내는 방향의 스트림
		
			기본함수 : OutputStream 의 함수들과 같다
			
				void write(int b)
				==> 한 글자만 내보내는 함수
				
				void write(byte[] b)
				==> 여러 글자를 내보내는 함수
				
				void write(byte[] b, int off, int len)
				==> 여러 글자를 내보내는 함수
					단, 지정한 부분만 내보내는 함수
					
					int off : 내보낼 배열의 시작위치
					int len : 내보낼 데이터 갯수
					
 -------------------------------------------------------------------------------------------------------------
 	File
 	==> 이것은 스트림은 아니다.
 		(데이터를 입출력하는 기능은 없다.)
 		다만, 우리가 외부 장치 중에서 가장 빈번하게 많이 사용하는 외부장치가 
 		파일(파일도 외부장치로 취급한다.)이다 보니 그 파일에 대한 정보를 처리하기 위한 클래스
 		
 		생성방법 ]
 			File(String pathname)
 			==> 파일의 경로와 이름을 지정해서 만든다.
 			
 			File(File parent, String child)
 			==> 파일의 정보를 이용하고 파일의 이름을 다시 지정해서 만드는 방법
 			
 			참고 ]
 				자바에서 파일은 폴더 자체도 파일로 인정한다.
 				
 					예 ]
 						File f = new File("c:\\");
 						
 			File(URI uri)
 			==> 네트워크상에서 다른 시스템에 있는 파일의 정보를 만든다.
 			
 			참고 함수 ]
 				1. 정보를 알아내는 함수
 					getName()	: 파일의 이름만 알아내는 함수
 					getParent()	: 폴더 이름만 알아내는 함수
 					exists()	: 파일의 존재여부를 알아내는 함수
 					length()	: 파일의 크기를 알아내는 함수
 					....
 					
 				2. 외부적인 작업을 하기 위한 함수
 					==> 데이터 입출력 이외에 파일 전체에 대해서 필요한 작업을 할 수 있는 함수들...
 					
 					delete()	: 파일 삭제
 					mkdir()		: 폴더를 만드는 함수(폴더 하나만 만든다.)
 					mkdirs()	: 폴더를 만드는데 입력한 경로의 모든 폴더를 만든다.
 					renameTo()	: 파일 이름 변경
 					list()		: 폴더에 있는 파일의 목록을 구하는 함수
 					....
 			
 			참고 ]
 				String[] list()		: 이름만 알아내는 함수
 				File[] listFiles()	: 정보를 알아내는 함수
 				==> 일반적인 파일의 목록을 알아내는 방법
 				
 				String[] list(FilenameFilter filter)		
 				File[] listFiles(FileFilter filter)		
 				File[] listFiles(FilenameFilter filter) 
 				==> 필터링을 해서 리스트를 구하는 함수
 					즉, 내가 필요한 파일만 골라서 리스트를 구할 수 있다.
 					
----------------------------------------------------------------------------------------------------------- 					
 	필터스트림(보조스트림)
 	==>
 		1. 기본 스트림에 기능을 추가하던지
 		2. 사용자의 편의를 제공하기 위한
 			보조적인 기능을 하는 스트림이다.
 			
 		주의 ]
 			반드시 기본 스트림은 존재해야 하고
 			필터 스트림은 필요에 따라서 선택적으로 연결해서 사용한다.
 			
 		참고 ]
 			필터스트림 역시 방향성을 가지고 있으며
 			반드시 같은 방향끼리만 연결해서 사용할 수 있다.
 			
 	*****
 	1. BufferedInputStream / BufferedOutputStream
 		==> 사용자 편의 기능은 없고
 			스트림의 성능을 향상시키는 역할을 한다.
 			
 			*****
 			주요함수 ]
 				
 				flush()
 				==> 버퍼의 내용을 강제로 꺼내오는 함수
 	
 	2. DataInputStream / DataOutputStream
 		==> 많이 사용하는 스트림은 아니다.
 			기능 향상은 없고
 			보통 스트림은 반드시 byte[] 로 데이터를 처리한다.
 			문자 데이텉가 아닌 다른 형태의 데이터는
 			문제가 있을 수 있다.
 			==> 자바의 데이터형을 byte[] 로 변환하지 않고
 				직접 외부 장치에 입출력 간으한 기능을 가지고 있다.
 				
 			많이 사용하지 않는 이유 ]
 				DataOutputStream 으로 내보낸 데이터는 반드시 DataInputStream 을 이용해서 읽어야한다
 				그리고 꺼낼 때 순서도 지켜야 한다.
 				(저장할 때 int, float, char ==> 읽을때도 int, float, char 순서로 읽어야한다.)
 				
 */
	
	public Test01_IO() {
		/*
			키보드 역시 대표적인 외부장치이다.
			자주 사용하는 외부장치이기 때문에
			이미 스트림을 준비한 변수가 존재한다.
			그것이
				System.in 
			이다.
		 */
		// 변수준비
		int ch = 0;
		try {
			
		}catch(Exception e) {
			
		}finally {
			try {
				/*
				// 1. 한글자 읽기
				System.out.print("한글자 입력 : ");
				ch = System.in.read();
				System.out.println("입력한 문자 : " + (char)ch);
				System.out.println("입력한 문자 : " + ch);
				*/
				
				/*
				// 2. 여러글자 읽기
				// 작업 순서
				// 메세지 출력
				System.out.print("문장 입력 : ");
				// 		1) 여러글자를 입력할 배열(byte[])를 준비
				byte[] buff = new byte[256];
				// 256 은 한번에 읽을 수 있는 문자의 갯수를 의미한다.
				int len = System.in.read(buff);
				// 읽은 결과를 출력
				// String(byte[] bytes, int offset, int length)
				// ==> 바이트 배열을 입력하고 꺼낼 위치와 갯수를 입력해주면서 문자열 만드는 방법
				String result = new String(buff,0,len);
				// 출력
				System.out.println("읽은 내용 : " + result);
				*/
				
				// 3. 주로 네트워크 처리에서 많이 사용되는 방법
				byte[] buff = new byte[256];
				Arrays.fill(buff, (byte)'A');
				// 메세지 출력
				System.out.print("내용입력 : ");
				String result = new String(buff,0,buff.length);
//				System.out.println(result);
				int len = System.in.read(buff, 10, 100);
				// 준비된 배열인 buff 에 10번방부터 읽은 내용을 기억하세요.
				// 최대 100개 까지만 읽으세요.(100 글자만 입력받는다.)
				result = new String(buff, 10, len);
				String result1 = new String(buff, 0, 256);
				System.out.println("읽은내용 : "+ result);
				System.out.println(result1);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

	public static void main(String[] args) {
		new Test01_IO();
	}

}
