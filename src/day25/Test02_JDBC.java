package day25;

import java.sql.*;
public class Test02_JDBC {

/*
	JDBC(Java DataBase Connector)
	==> 자바 프로그램을 이용해서 데이터베이스를 컨트롤 할 수 있는 외부 API 이다.
	
		데이터베이스는 그 데이터베이스가가진 DBMS 에 의해서 성능이 결정이 된다.
		이 말은 각각의 데이터베이스 마다 질의 명령을 처리하는 방법(DBMS)이 다르다는 것이다.
		
		이것은 개발자 입장에서 보면 데이터베이스 마다 
		그 데이터베이스의 DBMS 에 따라서 프로그램 방식을 다르게 해야한다는 것이 된다.
		
		따라서 해결 방법으로
		자바 안에 DBMS 을 만들어 놓았고
		개발자는 자바의 DBMS 에게만 명령을 전달 하도록 해 놓았다.
		(==> 개발자 입장에서 한 가지 방식으로 처리하도록 된 것이다.)
		자바 안에 있는 DBMS 가 실제 데이터베이스와 연결해서
		처리하도록 해 놓았다.
		
		이렇게 문제 해결을 위한 자바 내에 만들어진 DBMS 가 JDBC 이다.
		
		우리가 JDBC 를 배운다는 것은
		결국은 JDBC 에게만 명령을 보내면(한 가지 방식으로만 명령하면)
		JDBC 가 알아서 필요한 데이터베이스의 DBMS 에게 
		명령을 전달하게 된다.
		
		 참고 ]
		 	JDBC 와 실제 DBMS 를 연결하는 프로그램은
		 	해당 데이터베이스를 만든 회사에서 제공한다.
		 	
 	***
	자바 개발자(데이터베이스 처리를 원하는)가 가장 먼저 해야 할 일은
		1. 사용하려는 데이터베이스와 JDBC 를 연결하는 프로그램을 찾아내는 것이다.
			이 프로그램을 "JDBC Driver" 라고 부른다.
			
		2. 찾아낸 외부 API 를 이클립스(IDE) 에 등록해서 이클립스에서
			이 외부 API를 사용할 수 있도록 조치를 해야한다.
 */
	public Test02_JDBC() {
		
		try {
			/*
				1. JDBC 와 외부 데이터베이스를 연결할 드라이버를
					프로그램에서 가지고 와야한다.
					
					외부 클래스를 로딩하는 함수
					
						Class.forName();
					드라이버마다 외부 클래스의 이름이 조금씩 다르
					==> 검색을 이용해서 도움을 받자.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 위 행이 실행이 에러 없이 실행되면 드라이버 로딩은 끝난 상태가 된다.
			System.out.println("#### 드라이버 로딩 성공 ####");
			// JDBC 가 해당 드라이버를 이용해서 연결 시도한다.
			/*
				2. 오라클에 접속 시도
				
					각각의 데이터베이스 마다 접속하는 방법이 약간씩 다르다.
					
					방법을 찾았으면
					접속하는 명령어는 JDBC 에게 명령하면 된다.
					
					명령 ]
						
						DriverManager.getConnection(url, 계정, 비밀번호):
						==> 
							필요한 정보
								계정이름, 비밀번호, 서버주소, 포트번호, 데이터베이스 아이디
								
							==> 형식 ]
								"jdbc:oracle:thin:@서버주소:포트번호:데이터베이스아이디"
			 */
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "jennie";
			String pw = "12345";
			
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("## 접속 성공 @@");
			
			/*
			 	위 작업으로 접속을 하면 접속자를 관리하는 세션을 얻게 된다.
			 	JDBC 에서는 오라클에서 접속을 의미하는 Session 을 Connection 이라고 부른다.
			 	
			 	그리고 이 접속을 관리하는 클래스가 Connection 클래스이다.
			 	
			 	이때 인터페이스로 만들어 놓은 이유는
			 	세션을 관리하는 방법이 
			 	각각의 DBMS 마다 모두 다르므로
			 	접속하는 순간 함수의 기능을 거기에 맞도록 조절하기 위해서...
			 	
			 	----------------------------------------------------------------------------------
			 	여기까지가 데이터베이스마다 조금씩 달라지는 내용이다.
			 	이후는 모두 동일한 방법으로 명령을 보내고 받고 하면 된다.
			 */
			
			// 3. Statement 를 만든다. (명령 전달 도구)
			Statement stmt = con.createStatement();
			
			// 4. 질의명령 준비하고
			String sql = 
					"SElECT " +
					"	mno no, name, id, mail, tel, joindate jdate, gen, avatar ano "+
					"FROM " +
					"	member "+
					"WHERE " +
					"	mno = 1001"
			;
			
			// 5. 질의명령을 전달도구에 실어서 보내면 된다.
			ResultSet rs = stmt.executeQuery(sql);
			
			// 6. 데이터 꺼내서 저장하고
			// 작업 줄을 한 줄 내리고
			rs.next();
			// 데이터 꺼내기
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String id = rs.getString("id");
			String mail = rs.getString("mail");
			String tel = rs.getString("tel");
			Date jDate = rs.getDate("jdate");
			Time jTime = rs.getTime("jdate");
			String gen = rs.getString("gen");
			int ano = rs.getInt("ano");
			
			System.out.println(no + " | " + name + " | " + id + " | " + mail + " | " + tel + " | " + jDate + "." + jTime + " | " + gen + " | " + ano);
			
			// 작업이 완료되면 사용한 자원은 반환해준다.
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02_JDBC();
	}

}
