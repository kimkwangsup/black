package day08;

import java.util.ArrayList;
import java.util.Arrays;
public class Test05_array {
	public static void main(String[] args) {
		String[] blackPink = {"제니", "리사", "로제", "지수"};
		
		ArrayList[] list = new ArrayList[5];
		
		Samgak[] semo = new Samgak[10]; // 삼각형 클래스 10개를 모아서 관리할 배열
		
		char[] ch = {'a', 'b'};
		
//		int[] nums = ch; // Heap Type이 달라서 안된다.
		
		int[] no1 = new int[10];
		int[] no2 = {1, 2, 3};
		
		int[] num;
		
		num = no1;
		num = no2;
		
		System.out.println(Arrays.toString(num));
//				toString(num)); // "[1, 2, 3]" 를 Arrays.toString() 함수가 반환해준다.
	}
}

class Samgak {
	int width;
	int height;
	
	public double getArea() {
		return width * height / 2.0;
	}
}
