package day26;

import java.sql.*;
public class HJDBC {

	public HJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println("### 로딩 실패 ###");
		}
	}
	public Connection getCon(String url, String user, String pw) {
		Connection con = null;
		return con;
	}
	public Statement getStmt(Connection con) {
		Statement stmt = null;
		return stmt;
	}
}
