package day08;

public class Ex04_substring {

	public static void main(String[] args) {
		String blackPink = "Black Pink";
		/*
			substring() 함수를 이용해서 한 글자씩 추출해서 출력하세요.
		 */
		
		for(int i = 0 ; i < blackPink.length() ; i++) {
			System.out.print("[" + blackPink.substring(i, i+1) + "]");
		}
		
	}

}
