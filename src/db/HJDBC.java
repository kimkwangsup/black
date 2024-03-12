package db;

import java.sql.*;

public class HJDBC {
/*
	이 클래스는 데이터베이스 작업에 필요한
	드라이버를 로딩하고
	커넥션, 명령전달도구, ... 
	이 필요하면 꺼내서 반환해주는 함수들로 이루어진 클래스
	
	따라서
	이 클래스가 필요한 시점은 
	데이터베이스 작업이 필요한 경우일 것이다.
	
	이 클래스를 사용할 때는
	먼저 이 클래스를  new 시켜서 사용할 것인데
	이때 new 될때 생성자를 호출할 것이고
	생성자 안의 드라이버 로딩하는 작업이 실행 될 것이다.
	
	따라서 이 클래스를 사용할 준비가 끝나면 
	드라이버 로딩은 이미 끝난 상태가 된다.
 */
	
	public HJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println("### 드라이버 로딩 실패 ###");
		}
	}
	
	// 접속할 데이터베이스가 우리가 만든 jennie 계정을 사용할 때 커넥션 얻는 함수
	public Connection getCon() {
		// 반환값 변수
		Connection con = null;
		
		// 접속에 필요한 정보 준비
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jennie";
		String pw = "12345";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {
			System.out.println("### 커넥션 확보 실패 ###");
			e.printStackTrace();
		}
		
		return  con;
	}
	
	// 정보를 알려주고 커넥션을 얻어내는 함수
	public Connection getCon(String url, String user, String pw) {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {
			System.out.println("### 커넥션 확보 실패 ###");
			e.printStackTrace();
		}
		
		return  con;
	}
	
	// Statement가 필요해서 만들어 달라고 요청하면 반환해주는 함수
	public Statement getStmt(Connection con) {
		Statement stmt = null;
		
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			/*
				Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {}
				
				==>
					resultSetType
						1. TYPE_FORWARD_ONLY	
							==> SCROLL이 불가능한 FORWARD ONLY 형
						2. TYPE_SCROLL_INSENSITIVE
							==> 스크롤이 가능하고 수정이 불가능하다.
						3. TYPE_SCROLL_SENSITIVE
							==> 스크롤이 가능하고 수정도 가능
						
					resultSetConcurrency
						1. CONCUR_READONLY
							==> RESULTSET 변경이 불가능
						2. CONCUR_UPDATABLE
							==> RESULTSET 변경이 가능
			 */
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return stmt;
	}
	
	// PreparedStatement 가 필요하다고 요청하면 반환해주는 함수
	public PreparedStatement getPstmt(String sql, Connection con) {
		// 반환값 변수
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return pstmt;
	}
	
	// 다 사용한 자원은 반환해주는 함수
	public void close(Object o) {
		/*
			이 함수는 
			사용이 끝난 
				Connection, Statement, PreparedStatement, ResultSet
			을 닫아주는 기능을 담당하는 함수이다.
			
			네가지 타입의 데이터를 입력받을 때
			모두를 받을 수 있는 타입은 Object이므로
			Object타입의 매개변수로 만들기로 한다.
		 */
		
		try {
			/*
				입력된 데이터가 어떤 타입의 데이터인지에 따라서
				강제 형변환 타입이 달라질 것이다.
				
				여기서는 instanceof 라는 연산자를 이용해서 
				조건 처리 하기로 한다.
			 */
			if(o instanceof Connection) {
				// 입력된 데이터가 Connection 인 경우
				((Connection) o).close();
			} else if(o instanceof Statement ) {
				// 입력된 데이터가 Statement 인 경우
				((Statement) o).close();
			} else if(o instanceof PreparedStatement ) {
				// 입력된 데이터가 Statement 인 경우
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet ) {
				// 입력된 데이터가 Statement 인 경우
				((ResultSet) o).close();
			}
		} catch(Exception e) {}
	}
}
