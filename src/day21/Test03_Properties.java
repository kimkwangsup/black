package day21;

import java.io.*;
import java.util.*;
public class Test03_Properties {
/*
 	Properties
 	==> Map의 역할을 하는 클래스이다.
 	
 		일반 Map과의 차이점은
 		파일(외부장치)을 이용해서 직접 데이터를 읽어서 Map처럼 저장할 수 있고
 		Map에 저장된 데이터를 직접 파일(외부장치)로 출력해서 저장할 수 있다.
 		
 		주의 ]
 			파일의 내용을 읽을 때 인코딩이 안된다.
 			==> 한글 파일의 경우 한글 자체에서 인코딩 처리를 해줘야 한다.
 				그렇게 하지 않으면 데이터가 한글인 경우 깨져서 돌아온다. 
 				
 		참고 ]
 			한글이 포함된 파일을 Properties 에서 사용하기 위해서
 			인코딩 하는 방법
 				1. cmd 창을 연다
 				2. [path 를 JAVA_HOME 으로 설정한다.]
 				3. native2ascii 명령을 이용해서 인코딩해준다.
 				
 					형식 ]
 						native2ascii 지금파일경로&이름 저장할 파일 경로&이름
 						
 		참고 ]
 			Properties 클래스는 오직 문자열로만 키값과 데이터를 처리한다.
 			
 		참고 ]
 			Properties 는 이외에도
 			현재 프로그램의 정보를 Map으로 자동 처리하는 기능을 가지고 있다.
 */
	public Test03_Properties() {
		Properties prop = new Properties();
		/*
		 	choppa.txt 파일과 연결할 예정이다.
		 */
		FileInputStream fin = null ;
		
		try {
			fin = new FileInputStream("src/day21/choppa_re.txt");
			// 파일과 연결
			
			// 파일의 내용을 위에 만든 Map(prop)에 기억시킨다.
			prop.load(fin);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {}
		}
		String name = (String) prop.get("name");
		
		String result = "";
		try {
			result = new String(prop.getProperty("name").getBytes("ms949"), "utf-8");
		} catch (UnsupportedEncodingException e) {}
		// 출력하기
		System.out.println("name : " + result);
		
	}

	public static void main(String[] args) {
		new Test03_Properties();
	}

}
