package day26;

import java.sql.*;
public class Test01_JDBC {
	// 커넥션
	private Connection con;
	// 명령 전달 도구
	private Statement stmt;
	private PreparedStatement pstmt;
	// 결과 저장 객체
	private ResultSet rs;
	// 질의명령
	private String sql;
	
	// 질의명령 코드 상수 정의
	public static final int SEL_MEMB_NAMES = 1001;
	
	public static final int EDIT_MEMB_ANO = 2001;
	public static final int EDIT_MEMB_PW = 2002;
	
	public static final int ADD_MEMBER = 3001;
	
	
	public Test01_JDBC() {
		try {
			setCon();
			// 이 함수의 기능은 전역변수 con을 셋팅해주는 기능
			// 이 함수는 예외를 전이하는 함수이므로
			// 반드시 함수를 호출하는 곳에서 예외처리를 해줘야 한다.
			
//			getNames();
			replacePw(1000, "0000");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
//				rs.close();
//				stmt.close();
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}
	// 회원번호와 비밀번호를 입력해주면 회원의 비밀번호를 변경해주는 함수
	public void replacePw(int mno, String pw) throws SQLException {
		// 질의명령 가져오고
		sql = Test01_JDBC.getSQL(Test01_JDBC.EDIT_MEMB_PW);
//		System.out.println("SQL : " + sql);
		// 명령 전달 도구 준비
		pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		// 그런데 아직 질의명령이 완성되지 않았으므로
		// 질의명령을 완성해준다.
		
		pstmt.setString(1, pw);
		pstmt.setInt(2, mno);
		
		// 질의명령이 완성됐으므로 질의명령을 보내고 결과를 받으면 된다.
		// 그런데 지금 보내는 질의명령은 update 질의명령이고
		// 이런 질의명령을 보내고 결과를 받는 함수는 
		// execute(), executeUpdate(), ..
		int row = pstmt.executeUpdate();
		// 이 함수의 반환값은 변경된 행의 수를 반환해준다.
		
		if(row == 1) {
			System.out.println("*** 비밀번호 변경에 성공했습니다. ***");
		} else {
			System.out.println("### 비밀번호 변경에 실패했습니다. ###");
		}
	
		
	}
	
	// 회원이름 꺼내서 출력해주는 함수.
	public void getNames() throws SQLException{

		// 질의명령 꺼내오기
		sql = getSQL(Test01_JDBC.SEL_MEMB_NAMES);
//		System.out.println("sql : "+sql);
		// 질의명령이 준비됐으므로 이 질의명령을 전달할 도구가 필요하다
		setStmt();
		
		// 전달도구가 준비됐으므로 질의명령을 실어서 보내고
		// 결과를 받으면 된다.
		// 이때 결과는 JDBC가 SELECT 질의명령의 결과를 ResultSet 객체로 반환해준다
		
		rs = stmt.executeQuery(sql);
		// 질의명령의 결과는 rs에 담겨있고
		// 이 때, 커서는(작업진행줄) BOF에 있다.
		// 그래서 데이터를 꺼내려면 BOF 다음의 첫 행으로 작업진행줄을 이동시켜야 한다.
		// 그 명령이 rs.next() 이고 이 함수의 반환값은 
		// 		true : 이동이 성공한 경우(EOF 가 아닌 경우)
		//     false : 이동한 행이 EOF인 경우
		
		// 조회 결과가 몇행이 될지 알수 없으므로
		while(rs.next()) {
			// 작업진행줄을 한 행 내리는 작업이 성공한 경우에만 반복을 진행
			String name = rs.getString("name");
			// 결과행에서 name 컬럼의 데이터를 꺼내서 변수에 기억해준다.
			
			// 출력
			System.out.println(name);
		}
	}
	public void setCon() throws ClassNotFoundException, SQLException {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 연결에 필요한 데이터 준비
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "jennie";
			String pw = "12345";
			
			// 커넥션(세션) 을 연결한다.
			con = DriverManager.getConnection(url, user, pw);

			System.out.println("#### 데이터 로딩 완료 ###");
	}
	// 명령 전달 도구 셋팅해주는 함수
	public void setStmt() throws SQLException {
		stmt = con.createStatement();
	}
	
	// 명령 전달 도구 2 셋팅해주는 함수
	public void setPstmt() throws SQLException{
		pstmt = con.prepareStatement(sql);
	}
	
	public static void main(String[] args) {
		new Test01_JDBC();
	}
	// 코드를 입력하고 실행하면 그 코드에 해당하는 질의명령 반환해주는 함수
	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
	
		switch(code) {
		case SEL_MEMB_NAMES:
			buff.append("SELECT ");
			buff.append("	name ");
			buff.append("FROM");
			buff.append("	member ");
			buff.append("WHERE");
			buff.append("	isshow = 'Y' ");
			break;
		case EDIT_MEMB_ANO:
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	ano = ? ");
			buff.append("WHERE ");
			buff.append("	mno = ? ");
			break;
		case EDIT_MEMB_PW:
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	pw = ? ");
			buff.append("WHERE ");
			buff.append("	mno = ? ");
			break;
		case ADD_MEMBER:
			buff.append("INSERT INTO ");
			/*
				주의사항 ]
					StringBuffer를 이용해서 append()를 이용해서 문자열을 결합하는 경우
					두개의 문자열이 구분이 없이 결합될 수 있으므로 항상 주의해야 한다.
					
					잘못된 예 ]
						
							buff.append("SELECT");
							buff.append("name");
							buff.append("FROM");
							buff.append("member");
							
							==> 이렇게 결합을 하게되면 결과는
									SELECTnameFROMmember
								의 결과로 모든 문자들이 공백없이 결합된 형태로 만들어진다.
								이런 경우는 데이터베이스에서 오류가 발생할 것이다.
								따라서 결합 때 각 문자열 데이터 맨 뒤에 공백을 습관적으로
								추가해주도록 한다.		 

					올바른 예 ]
							
							buff.append("SELECT ");
							buff.append(" 	name");
							buff.append("FROM ");
							buff.append("	member");
			 */
			
			buff.append("	member(mno, name, id, pw, mail, tel, gen, avatar) ");
			buff.append("VALUES( ");
			buff.append("	?, ?, ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
			
		
		}
		return buff.toString();
	}

}
