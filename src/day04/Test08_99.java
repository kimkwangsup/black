package day04;

/*
 	3단 구구단을 출력해보자.
 		3 * 1 = 3
 		3 * 2 = 3
 		...
 		3 * 9 = 27
 */
public class Test08_99 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9 ; i++) {
			System.out.printf("3 x %d = %2d" + "\n", i, 3 * i);
			// System.out.println("3 x " + i + " = " + (3 * i));
		}
	}

}
