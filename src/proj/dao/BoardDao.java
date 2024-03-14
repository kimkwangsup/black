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
	
	// 게시글 번호 리스트 조회 전담 처리함수
	public ArrayList<Integer> getBnoList(){
		// 할일
		// 반환값 변수 만들고
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 커넥션 가져오고
		con = db.getCon();
		// 질의명령 가져오고
		sql = BoardSQL.getSQL(BoardSQL.SEL_BNO_LIST);
		// 명령전달도구 가져오고
		stmt = db.getStmt(con);
		try {
			// 명령전달도구에 질의명령 실어서 보내고 결과받고
			rs = stmt.executeQuery(sql);
			// 하나씩 꺼내서 리스트에 담고
			// 질의명령 실행의 결과가 몇행일지 모르므로 반복한다
			while(rs.next()) {
				// 글번호 꺼내고
				int bno = rs.getInt("bno");
				// 리스트에 채우고
				list.add(bno);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		// 리스트 반환해주고
		return list;
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
	
	// 내가 작성한 글번호리스트 조회 전담 처리함수
	public ArrayList<Integer> getMineBnoList(int mno){
		// 반환값 변수
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 위에 만든 리스트에 내가 작성한 글 번호들을 채워서 반환해주면 된다.
		// 할 일
		// 커넥션 꺼내오고
		con = db.getCon();
		// 질의명령 가져오고
		sql = BoardSQL.getSQL(BoardSQL.SEL_MIBNO_LIST);
		// 명령전달도구 꺼내오고
		pstmt = db.getPstmt(sql, con);
		try {
			// 질의명령 완성하고
			pstmt.setInt(1, mno);
			// 명령전달도구에 기억된 질의명령 보내고 결과받고
			rs = pstmt.executeQuery();
			// 꺼내고
			while(rs.next()) {
				int bno = rs.getInt("bno");
				// 리스트에 담고
				list.add(bno);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		// 리스트 반환
		return list;
	}
	
	// 게시글 본문 조회 전담 처리함수
	public String getBody(int bno) {
		// 반환값 변수
		String body = "";
		// 할일
		// 커넥션 꺼내오고
		con = db.getCon();
		// 질의명령 가져오고
		sql = BoardSQL.getSQL(BoardSQL.SEL_BNO_BODY);
		// 명령전달도구 준비하고
		pstmt = db.getPstmt(sql, con);
		try {
			// 질의명령 완성해주고 
			pstmt.setInt(1, bno);
			// 질의명령 보내고 결과받고
			rs = pstmt.executeQuery();
			// 꺼내서 기억시키고
			// 결과가 한 행만 조회되므로
			rs.next();
			body = rs.getString("body");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return body;
	}
	
	// 게시글 본문 수정 데이터베이스 작업 전담 처리함수
	public int editBody(int bno, String body) {
		// 반환값 변수 - 변경된 행의 수
		int cnt = 0;
		// 할일
		// 커넥션 꺼내오고
		con = db.getCon();
		// 질의명령 가져오고
		sql = BoardSQL.getSQL(BoardSQL.EDIT_BODY);
		// 명령전달도구 꺼내오고
		pstmt = db.getPstmt(sql, con);
		try {
			// 질의명령 완성하고
			pstmt.setString(1, body);
			pstmt.setInt(2, bno);
			// 질의명령 보내고 결과받고
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
	
	// 글 번호를 입력받아서 해당 글의 상세정보를 조회하는 데이터베이스 작업 전담 처리 함수
	public BoardVO getDetail(int bno) {
		// 반환값 변수
		BoardVO vo = new BoardVO();
		// 할일
		// 커넥션 꺼내오고
		con = db.getCon();
		// 질의명령 꺼내오고
		sql = BoardSQL.getSQL(BoardSQL.SEL_DETAIL);
		// 명령전달도구 만들고
		pstmt = db.getPstmt(sql, con);
		// 질의명령 보내고 결과 받고
		try {
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			// 데이터 꺼내서 VO에 담고
			// 작업 진행 중 한칸 내리고
			rs.next();
			// 데이터 꺼내고
			vo.setBno(rs.getInt("bno"));
			vo.setTitle(rs.getString("title"));
			vo.setBody(rs.getString("body"));
			vo.setId(rs.getString("id"));
			vo.setWdate(rs.getDate("Wdate"));
			vo.setWtime(rs.getTime("wdate"));
			vo.setSdate();
			vo.setViews(rs.getInt("views"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return vo;
	}
	
	// 조회수 증가 데이터베이스 작업 전담 처리
	public int addViews(int bno) {
		// 반환값 변수
		int cnt = 0;
		// 할 일
		// 커넥션
		con = db.getCon();
		// 질의명령
		sql = BoardSQL.getSQL(BoardSQL.ADD_VIEWS);
		// 명령전달도구
		pstmt = db.getPstmt(sql, con);
		try {
			// 질의명령 완성
			pstmt.setInt(1, bno);
			// 질의명령 보내고 결과받기
			cnt = pstmt.executeUpdate(); // executeUpdate() ==> 질의명령의 결과 변경된 행 수를 반환
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		// 반환값 반환해주고
		
		return cnt;
	}
	
	// 게시글 삭제 전담 처리 함수
	public int delBno(int bno) {
		// 반환값 변수
		int cnt = 0;
		// 할일
		// 커넥션 꺼내오고
		con = db.getCon();
		// 질의명령 꺼내오고
		sql = BoardSQL.getSQL(BoardSQL.DEL_BNO);
		// 명령 전달 도구 준비
		pstmt = db.getPstmt(sql, con);
		try {
			// 질의 명령 완성하고
			pstmt.setInt(1, bno);
			// 질의 명령 보내고 결과 받고
			cnt = pstmt.executeUpdate();
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			db.close(pstmt);
			db.close(con);
		}
		// 반환해주고
		
		return cnt;
	}
	
}
