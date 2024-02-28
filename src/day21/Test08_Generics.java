package day21;

import java.io.*;
import java.util.*;;
public class Test08_Generics {

	public Test08_Generics() {
		ArrayList<Figure> list = new ArrayList<Figure>();
		
		list.add(new Semo(3,5));
		list.add(new Nemo(4,7));
		
		// 출력
		for(Figure f : list) {
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
		new Test08_Generics();
	}

}
