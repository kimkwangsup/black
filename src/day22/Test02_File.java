package day22;

import java.io.*;
public class Test02_File {
/*
 	1. 
 		D:\\ 폴더 하나를강제로 만든다
 		
 	2. 
 		D:\\ 경로가 있는 폴더를 강제로 만든다.
 		
 	3. 
 		만들어진 파일중 하나를 삭제한다.
 		(폴더도 파일로 간주하므로 폴더도 삭제 가능하다.)
 */
	
	public Test02_File() {
		/*
		// 만들고 싶은 폴더를 파일로 만든다.(없는 폴더도 상관없다.)
		// 1. 
		File file = new File("D:\\data");
		
		// 폴더로 만들어 본다.
		file.mkdir();
		*/
		/*
		// 2. D:\data\a\b 폴더를 만들어보자
		File file = new File("D:\\data\\a\\b");
		file.mkdirs();
		*/
		// 3. 
		File file = new File("D:\\data\\a\\b");
		file.delete();
		
		// 4. 특정 파일의 이름을 다른이름으로 저장해보자
		// 1) 현재 이름과 바꿀 이름의 파일을 둘 다 File 로 만들어둔다.
		File oldFile = new File("D:\\data\\a");
		File newFile = new File("D:\\data\\jennie");
		
		// 2) 바꿔준다. ===> renameTo()
		oldFile.renameTo(newFile);
		
		
	}

	public static void main(String[] args) {
		new Test02_File();
	}

}
