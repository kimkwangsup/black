package day17;

import java.util.*;
public class Test05_StringTokenizer {

	public Test05_StringTokenizer() {
		String str = "The string tokenizer class allows" + "an application to break a string into tokens.";
		
		StringTokenizer token = new StringTokenizer(str);
		// 잘라진 단어를 배열에 저장해보자.
		// 배열은 만들 때 저장할 형태와 갯수를 지정해줘야 만들 수 있다.
		int len = token.countTokens(); // 잘려진 갯수 반환해주는 함수
		String[] words = new String[len];
		int idx = 0;
		while(token.hasMoreTokens()) {
			// hasMoreTokens() : 꺼내올 문자열(String)이 있는지를 반환해주는 함수(boolean)
			// hasMoreElements() : 꺼내올 객체(Object)가 있는지를 반환해주는 함수(boolean)
			String word = token.nextToken();
			words[idx++] = word;
			System.out.println(word);
		}
		// 배열 내용 확인
		System.out.println(Arrays.toString(words));
		
		
		/*
		token = new StringTokenizer("010-1212-1212", "-");
		while(token.hasMoreTokens()) {
			String word = token.nextToken(); // 버퍼메모리에서 꺼낸 데이터를 문자열로 반환
			Object o = token.nextElement();
			String word = (String)o;
			
			System.out.println(word);
		}
		*/
	}

	public static void main(String[] args) {
		new Test05_StringTokenizer();
	}
	
	

}
