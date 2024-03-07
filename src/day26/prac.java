package day26;

import java.sql.*;

public class prac {
    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private String sql;

    public static final int SEL_MEMB_NAMES = 1001;
    public static final int EDIT_MEMB_ANO = 2001;
    public static final int EDIT_MEMB_PW = 2002;
    public static final int ADD_MEMBER = 3001;

    public prac() {
        try {
            setCon();
            replacePw(1000, "0000");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }

    public void replacePw(int mno, String pw) throws SQLException {
        sql = prac.getSQL(prac.EDIT_MEMB_PW);
        pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        pstmt.setString(1, pw);
        pstmt.setInt(2, mno);
        int row = pstmt.executeUpdate();
        if (row == 1) {
            System.out.println("*** 비밀번호 변경에 성공했습니다. ***");
        } else {
            System.out.println("### 비밀번호 변경에 실패했습니다. ###");
        }
    }

    public void getNames() throws SQLException {
        sql = getSQL(prac.SEL_MEMB_NAMES);
        setStmt();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
        }
    }

    public void setCon() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "jennie";
        String pw = "12345";
        con = DriverManager.getConnection(url, user, pw);
        System.out.println("#### 데이터 로딩 완료 ###");
    }

    public void setStmt() throws SQLException {
        stmt = con.createStatement();
    }

    public void setPstmt() throws SQLException {
        pstmt = con.prepareStatement(sql);
    }

    public static void main(String[] args) {
        new prac();
    }

    public static String getSQL(int code) {
        StringBuffer buff = new StringBuffer();

        switch (code) {
            case SEL_MEMB_NAMES:
                buff.append("SELECT ");
                buff.append("    name ");
                buff.append("FROM ");
                buff.append("    member ");
                buff.append("WHERE ");
                buff.append("    isshow = 'Y' ");
                break;
            case EDIT_MEMB_ANO:
                buff.append("UPDATE ");
                buff.append("    member ");
                buff.append("SET ");
                buff.append("    ano = ? ");
                buff.append("WHERE ");
                buff.append("    mno = ? ");
                break;
            case EDIT_MEMB_PW:
                buff.append("UPDATE ");
                buff.append("    member ");
                buff.append("SET ");
                buff.append("    pw = ? ");
                buff.append("WHERE ");
                buff.append("    mno = ? ");
                break;
            case ADD_MEMBER:
                buff.append("INSERT INTO ");
                buff.append("    member(mno, name, id, pw, mail, tel, gen, avatar) ");
                buff.append("VALUES( ");
                buff.append("    ?, ?, ?, ?, ?, ?, ?, ? ");
                buff.append(") ");
                break;
        }
        return buff.toString();
    }
}