package proj.dao;
/*
	이 클래스는
	게시판에 관련된 데이터베이스 작업을 전담해서 처리할 클래스
 */
import java.util.*;
import java.util.Date;
import java.util.ArrayList;
import java.sql.*;
import db.*;
import proj.vo.*;
import proj.sql.*;
public class BoardDao {
	private HJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	// 질의명령
	private String sql;
	
	public BoardDao() {
		/*
			이 클래스를 사용하려면
			먼저 new 시켜야 할 것이고
			new 를 시킨다는 것은
			게시판 관련 데이터베이스 작업이 필요하다는 의미이므로
			이 클래스가 메모리에 올려질 때
			데이터베이스를 사용할 준비가 끝나있으면 편할겅시다.
			따라서 생성자에서 그 기능을 하는 HJDBC를 new 시켜놓는다.
		 */
		
		db = new HJDBC();
		// 이제 오라클 드라이버 로딩은 끝난 상태가 된다.
	}
	// 게시글 리스트 조회 전담 처리함수
	public ArrayList<BoardVO> getAllList(){
		// 질의명령이 이미 완성이 되어있으므로
		// 전달 받아야 할 데이터도 없고
		// 명령 전달 도구도 Statement 를 준비하면 된다.
		
		// 할일
		// 1. 반환변수 준비
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		// 반환값 변수가 준비가 되어있으니 채워서 반환해주면 된다.
		
		// 2. 커넥션 꺼내오고
		con = db.getCon();
		// 3. 질의명령 꺼내오고
		sql = BoardSQL.getSQL(BoardSQL.SEL_ALL_LIST);
		// 4. 명령 전달도구 가져오고 
		stmt = db.getStmt(con); 
		try {
			// 5. 보내고 결과받고
				rs = stmt.executeQuery(sql);
			// 6. 결과에서 데이터 꺼내서 VO 채우고
			// 몇개의 데이터를 조회했는지 알 수 없으므로
			// 반복해서 처리한다
			while(rs.next()) {
				// 게시글 한개를 기억할 VO를준비한다.
				BoardVO vo = new BoardVO();
				// 데이터 꺼내고
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String id = rs.getString("id");
				Date wdate = rs.getDate("wdate");
				Time wtime = rs.getTime("wdate");
				int views = rs.getInt("views");
				// 꺼낸 데이터 VO에 채우고
				vo.setBno(bno);
				vo.setTitle(title);
				vo.setId(id);
				vo.setWdate(wdate);
				vo.setWtime(wtime);
				vo.setSdate();
				vo.setViews(views);
				// 가져온 데이터 모두 VO에 담았으니
				// list 에 담고
				list.add(vo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				db.close(rs);
				db.close(stmt);
				db.close(con);
		}
		
		
		// 리스트 반환하고
		return list;
	}

}
