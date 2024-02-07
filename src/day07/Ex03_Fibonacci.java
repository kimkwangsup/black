package day07;

/*
 	피보나치 수열의 숫자 10개를 기억하는 배열을 완성하고
 	출력하세요.
 */

public class Ex03_Fibonacci {
	public static void main(String[] args) {
		
		int nums[] = new int[10];
		
		nums[0] = 1;
		nums[1] = 1;
		for(int i = 2 ; i < 10 ; i++) {
//			int no1 = nums[i - 2];
//			int no2 = nums[i - 1];
//			nums[i] = no1 + no2;
			nums[i] = nums[i - 2] + nums[i - 1];
		}
		for(int no : nums) {
			System.out.printf("[%2d]", no);
		}
		
	}
}
