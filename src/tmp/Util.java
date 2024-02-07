package tmp;

import java.util.Scanner;

public class Util {
	public static int inputInt(String s){
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
		int i = sc.nextInt();
		return i;
	}
}
