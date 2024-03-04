package day22;

import java.io.*;
import java.util.Arrays;
public class Test03_File {

	public Test03_File() {
		// 목록을 만들고 싶은 폴더를 File 로 만든다
		File f = new File("D:\\study\\db\\doc");
		
		/*
		String[] flist = f.list();
//		System.out.println(Arrays.toString(flist));
		for(String fname : flist) {
			System.out.println(fname);
		}
		*/
		/*
		File[] flist = f.listFiles();
		for(File file : flist) {
			// 파일이름 꺼내기
			String fname = file.getName();
			long len = file.length();
			System.out.println(fname +" : "+ len + "byte");
		}
		*/
		
		// 확장자가 pdf 파일들만 골라서 꺼내기
		/*
		String[] list = f.list(new MyFileFilter());
		for(String fname : list) {
			System.out.println(fname);
		}
		*/
		
		String[] list = f.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				/*
				boolean result = name.endsWith("pdf");
				return result;
				*/
				return name.endsWith("pdf");
			}
			
		});
		for(String fname : list) {
			System.out.println(fname);
		}
		
		}
	public static void main(String[] args) {
		new Test03_File();
	}

}
class MyFileFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		/*
			매개변수
				File dir 	: 현재 파일의 정보
				String name : 현재 파일의 이름
				
			이 함수는 자동 호출되는 함수이다.
			목록을 구하는 파일을 하나씩 발견할 때마다 
			이 함수가 호출된다.
			이 함수의 반환값이 true 면 리스트에 추가하고
								false 면 추가하지 않는다.
								
			참고 ]
				String.endsWith(String suffix) : 문자열이 입력한 문자열로 끝나는ㄴ지 여부를 반환해준다.
		 */
		boolean result = name.endsWith("pdf");
		return result;
	}
	
	
}