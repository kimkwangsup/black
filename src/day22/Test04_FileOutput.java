package day22;

import java.io.*;
public class Test04_FileOutput {

	public Test04_FileOutput() {
		// 파일에 내용을 저장하기 위해서는 외부장치인 파일에 연결할 기본 스트림(타겟스트림)이 필요하다.
		FileOutputStream fout = null;
		try {
			// 변수 초기화
			fout = new FileOutputStream("src/day22/data.txt");
			// 파일이 존재하지 않아도 상관없다. 자동으로 만들어진다.
			/*
			// 1. 1글자만 입력해보자.
			fout.write('a');
			*/
			/*
			// 2. 여러글자 입력해보자
			String str = "창문너머 어렴풋이 옛 생각이 나겠지요";
			byte[] buff = str.getBytes();
			// 전송한다
			fout.write(buff);
			*/
			// 문자열의 일부만 전송
			String str = "Initializes a newly created {@code String} object so that it represents an empty character sequence.";
			// byte[] 로 변환
			byte[] buff = str.getBytes();
			fout.write(buff, 12, str.length()-12);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 외부장치에 연결된 경우 해당 외부장치를 모두 사용한 후에는
			// 반드시 닫아 주는 것이 원칙이다.
			try {
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04_FileOutput();
	}

}
