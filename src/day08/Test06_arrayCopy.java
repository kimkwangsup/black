package day08;

import java.util.Arrays;

public class Test06_arrayCopy {

	public static void main(String[] args) {
		int[] num = {1, 2, 3};
		// 얕은 복사
		int[] no = num;
		
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("no  : " + Arrays.toString(no));
		
		num[0] = 10;
		
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("no  : " + Arrays.toString(no));
		
		int[] soo = new int[3];
		for(int i = 0 ; i < num.length ; i++) {
			soo[i] = num[i];
		}
		soo[0] = 10000;
		System.out.println("num : " + Arrays.toString(num));
		System.out.println("no  : " + Arrays.toString(no));
		System.out.println("soo : " + Arrays.toString(soo));
		
		
	}

}
