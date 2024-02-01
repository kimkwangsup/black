package day03;

/*
 	증감 연산자
 		++ : 뒤에 오는 변수를 1 증가시켜주는 연산자
 		-- : 뒤에 오는 변수를 1 감소시켜주는 연산자 
 */
public class Test03_plus {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 10;
		System.out.println("1. ++no1 : " + ++no1 + " | no1 : " + no1 + " | no2 : " + no2);
		System.out.println("2. no1-- : " + no1-- + " | no2 : " + no2);
		System.out.println("3. no1 : " + no1);
	}
}
