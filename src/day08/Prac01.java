package day08;

import java.util.Arrays;

public class Prac01 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		int[] nums1 = {1, 2, 3, 4, 5};
		int[] nums2 = {1, 2, 3, 4, 5};
		int[] nums3 = {1, 2, 3, 4, 5};
		int[][] num = new int[4][5];
		num[0] = nums;
		num[1] = nums1;
		num[2] = nums2;
		num[3] = nums3;
		System.out.println(Arrays.toString(num[0]));
		for(int[] ar : num) {
			System.out.println(Arrays.toString(ar));
		}
		
	}

}
