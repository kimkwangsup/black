package day08;

import java.util.Arrays;

/*
	문제 ] 
		위 문자열을 문자 배열로 바꾸고
		만들어진 문자 배열과 같은 크기의 배열을 만든 후
		공백을 기준으로 문자들을 바꿔서 배열에 저장하세요.
		
		깊은 복사로 해결하세요.
		System.arraycopy() 이용하세요.
 */
public class Ex03_deepCopy {

	public static void main(String[] args) {
		String blackPink = "Black Pink";
		char[] before ;
		before = blackPink.toCharArray();
		char[] after; 
		after = new char[before.length];
		after[4] = ' ';
		System.arraycopy(before, 0, after, 5, 5);
		System.arraycopy(before, 6, after, 0, 4);
		System.out.println(Arrays.toString(after));
		
		
		
		
	}

}
