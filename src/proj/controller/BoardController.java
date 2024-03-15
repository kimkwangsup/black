package proj.controller;

import java.util.*;
import java.util.Date;
import java.sql.*;
import proj.dao.*;
import proj.vo.*;
public class BoardController {
	// 데이터베이스 작업 전담 클래스 변수
	private BoardDao bDao;
	private Scanner sc;
	
	// 클라이언트 회원번호 변수
	private int mno = 1000;
	
	public BoardController() {
		bDao = new BoardDao();
		sc = new Scanner(System.in);
		menu();
	}
	
	// 메뉴 출력 함수
	public void menu() {
		// 할 일
		loop:
		while(true) {
			// 메세지 출력
			System.out.print("r : 조회기능\nu : 수정기능\nc : 게시글 입력\nd : 게시글 삭제\nq : 프로그램 종료 \n메뉴를 선택하세요. : ");
			// 입력받고
			String scode = sc.nextLine();
			// 입력값 비교
			switch(scode) {
			case "r": // 조회기능
				selectFunc();
				break;
			case "u": // 수정기능
				editBody();
				break;
			case "c": // 입력기능
				writeBoard();
				break;
			case "d": // 삭제기능
				delBoard();
				break;
			case "q": // 종료기능
				break loop;
			}
		}
	}
	// 조회기능 메뉴 함수
	public void selectFunc() {
		loop:
		while(true) {
			// 메세지 출력
			System.out.println("------- 조회기능 -------");
			System.out.print("a : 전체 리스트 조회\nd : 글 상세보기\nq : 이전메뉴이동\n기능을 선택하세요! : ");
			// 입력 받고
			String selCode = sc.nextLine();
			// 입력값에 따라서 처리하고
			switch(selCode) { 
			case "a": // 전체리스트 조회
				getList();
				break; 
			case "d": // 글 상세보기
				getBnoDetail();
				break; // switch 문 탈출
			case "q": // 이전메뉴이동
				break loop;
			}
		}
	}
	// 글 번호를 입력받아서 해당 글의 상세정보를 출력해주는 함수
	public void getBnoDetail() {
		// 할일
		while(true) {
			// 글번호 리스트 출력
			ArrayList<Integer> list = bDao.getBnoList();
			if(list.size() == 0) {
				System.out.println("@@@@@@@@@@@ 작성한 글이 없습니다. @@@@@@@@@@@@@");
				return;
			}else {
			System.out.println("---------- 글번호 리스트 ----------");
			for(int no : list) {
				System.out.printf("[ %6d ]", no);
			}
			System.out.println();
			System.out.println("------------------------------------");
			System.out.println();
			// 메세지 출력 
			System.out.print("조회할 글 번호를 입력하세요. : ");
			}
			// 조회할 글 번호 입력받고
			int bno = 0;
			
			try {
				bno = sc.nextInt();
				sc.nextLine();
				// 글 번호를 Dao에 전달하면서 데이터베이스 작업을 처리해달라고 요청
				// 결과로 글 한개를 저장한 객체 BoardVo를 반환받는다.
				int cnt = bDao.addViews(bno);
				if(cnt != 1 ) {
					// 이 경우는 데이터베이스 작업에 문제가 있는 경우
					// 다시 입력받아서 처리해준다.
					continue;
				}
				// 내용 꺼내오고
				bodyDetail(bno);
				break;
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue; // 반복문 다시 실행
			}
		}
		
	}
	public void bodyDetail(int bno) {
		BoardVO vo = bDao.getDetail(bno);
		// 필요한 데이터가 준비되었으니 출력한다.
		System.out.println("------------------------------- 게시글 내용 --------------------------------------");
		System.out.printf("글번호 : %6d\n글제목 : %s\n작성자 : %10s\n작성일 : %s\n조회수 : %d\n글내용 : %s\n", 
						vo.getBno(), vo.getTitle(), vo.getId(), vo.getSdate(), vo.getViews(), vo.getBody());
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
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
	
	// 작성글 수정기능
	public void editBody() {
		int bno = 0;
		// 할일
		// 작성 글번호 리스트 조회
		ArrayList<Integer> list = bDao.getMineBnoList(mno);
		if(list.size() == 0) {
			System.out.println("@@@@@@@@@@@ 작성한 글이 없습니다. @@@@@@@@@@@@@");
			return;
		}else {
			for(int no : list) {
				System.out.printf("[ %6d ]\n", no);
			}
			// 수정 글번호 입력
			System.out.print("수정할 글 번호를 입력 : ");
		}
		while(true) {
			try {
				bno = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				// 여기를 실행하는 경우는 정수를 입력해주지 않은 경우
				// 입력을 다시 받는다.
				System.out.println("다시 입력하세요.");
				continue;
			}
			break;
		}
		// 수정글 원본 내용 출력
		String body = bDao.getBody(bno);
		System.out.println();
		System.out.println("########## [ " + bno + "] 글내용");
		System.out.println();
		System.out.println(body);
		// 수정 내용을입력
		System.out.println("-----------------------------------------------------");
		// 메세지출력
		System.out.println("수정 내용 입력 : ");
		// 입력받고
		String rebody = sc.nextLine(); 
		// 입력된 내용 데이터베이스에 입력
		int cnt = bDao.editBody(bno, rebody);
		if(cnt == 1) {
		// 결과 출력
			bodyDetail(bno);
		}else {
			System.out.println("수정작업이 실패했습니다.");
		}
	}
	// 게시글 삭제 요청 전담 처리함수
	public void delBoard() {
		int bno = 0;
		// 할 일
		// 내가 작성한 글 번호 리스트 출력
		ArrayList<Integer> list = bDao.getMineBnoList(mno);
		if(list.size() == 0) {
			System.out.println("@@@@@@@@@@@ 작성한 글이 없습니다. @@@@@@@@@@@@@");
		}else {
			for(int no : list) {
				System.out.printf("[ %6d ]\n", no);
			}
			// 삭제글번호 입력받고
			// 메시지
			while(true) {
				System.out.print("삭제할 글번호를 입력하세요 : ");
				String tmp = sc.nextLine();
				try {
					if(tmp.equals("q")) {
						return;
					} else {
						bno = Integer.parseInt(tmp);
					}
				}catch(Exception e) {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
				break;
			}
			// 글 삭제하고
			int cnt = bDao.delBno(bno);
			// ==> 작업이 성공하면 1, 실패하면 0
			
			// 결과 출력
			if(cnt != 1) {
				System.out.println("삭제작업이 실패했습니다.");
			} else {
				System.out.println("게시글 삭제 완료");
			}
		}
	}
	// 게시글 작성 기능 전담 함수
	public void writeBoard() {
		// 할일
		// 변수 준비
		String title = "";
		String body = "";
		while(true) {
			// 1. 제목 입력 메세지 출력
			System.out.print("제목 입력 : ");
			// 2. 제목 입력받고
			title = sc.nextLine();
			if(title == null || title.length() == 0) continue;
			break;
		}
		while(true) {
			// 3. 본문 입력 메세지
			System.out.println("본문 내용 입력 : ");
			// 4. 본문 입력
			body = sc.nextLine();
			if(body == null || body.length() == 0) continue;
			break;
		}
		// 5. 데이터베이스 작업하고 결과받고
		int cnt = bDao.addBoard(title, body, mno);
		// 6. 결과 출력해주고
		if(cnt == 1) {
			// 입력 작업에 성공한 경우
			System.out.println("게시글 업로드 완료");
		}else {
			// 입력 작업에 실패한 경우
			System.out.println("업로드 실패");
		}
		// 7. 종료
	}
	
	public static void main(String[] args) {
		new BoardController();
	}
}
