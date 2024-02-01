package day04;

public class Test05_for_char {
	public static void main(String[] args) {
		// 랜덤하게 알파벳 소문자 10개를 만들어서
		// 단어를 만들어서 출력하세요.
		// char ch = (char)(no + 1)
		// 블럭 내에서 변수를 생성하게 되면
		// 블럭 밖에서 사용할 수 없기 때문에
		// 결과 값 변수를 미리 비어 있는 채로 만들어준다.
	
		
		
/*		
		for(int i = 0; i < 10; i++) {
		int no = 'a';
		int num = (int)(Math.random() * 26);
		char no1 = (char)(num + no);
		System.out.print(no1);
*/	
/*		
		for(int i = 0; i < 10; i++) {
		int no = 'A';
		int num = (int)(Math.random() * 26);
		char no1 = (char)(num + no);
		System.out.print(no1);
*/	
		
/*
		for(int i = 0; i < 10; i++) {
		char no = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		System.out.print(no);
*/	
		
		
/*
		for(int i = 0; i < 10; i++) {
		char no = (char)(Math.random() * ('z' - 'a' + 1) + 'a');
		System.out.print("내가 만든 단어 : " + no);
		
		}
	*/
	
		String result = "";
		for(int i = 0; i < 10; i++) {
		int num = (int)(Math.random()  * 26);
		char ch = (char)('a' + num);
		result += ch;
		}
		System.out.println("내가 만든 단어 : " + result);
	
	}
}
			
	


