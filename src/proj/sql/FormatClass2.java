package proj.sql;

import java.util.*;
import java.text.*;
public class FormatClass2 {

	public FormatClass2() {
		// 질의명령을 MessageFormat 클래스를 이용해서 완성해보자.
		
		String sql = "INSERT INTO board VALUES( brdSeq.NEXTVAL, {0}, {1})";
		
		MessageFormat form = new MessageFormat(sql);
		
		// 글 한개 
		Object[] cont = {
			"퍼가요", "ㅈㄱㄴ"	
		};
		String result = form.format(cont);
		System.out.println(result);
		
		Object[] var = null;
		try {
			var = form.parse(result);
			for(int i = 0 ; i < var.length ; i++) {
				System.out.println(var[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FormatClass2();
	}

}
