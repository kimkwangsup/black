package proj.controller;

import java.util.*;
import java.util.Date;
import java.sql.*;
import proj.dao.*;
import proj.vo.*;
public class BoardController {
	// 데이터베이스 작업 전담 클래스 변수
	private BoardDao bDao;
	
	public BoardController() {
		bDao = new BoardDao();
		getList();
	}
	
	
	
	
	// 게시글 리스트 조회 처리함수
	public void getList() {
		// 데이터 가져오고
		ArrayList<BoardVO> list = bDao.getAllList();
		
		// 출력한다.
		for(int i = 0 ; i < list.size() ; i++) {
			BoardVO vo = list.get(i);
			int bno = vo.getBno();
			String title = vo.getTitle();
			String id = vo.getId();
			Date wdate = vo.getWdate();
			Time wtime = vo.getWtime();
			int views = vo.getViews();
			String sdate = vo.getSdate();
			System.out.printf("%4d ]%10s :  %s : %s  - %d\n", bno, id, sdate, title, views);
		}
	}

	public static void main(String[] args) {
		new BoardController();
	}
}
