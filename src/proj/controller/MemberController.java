package proj.controller;

import java.util.*;
import java.util.Date;
import java.sql.*;
import proj.dao.*;
import proj.vo.*;

public class MemberController {
	// 1. 아이디만 모두 조회하는 기능
	// 2. 모든 회원의 회원번호, 이름, 아이디, 메일, 전화번호, 가입일, 성별 조회기능
	// 3. 회원 추가기능
	private MemberDao mDao;
	private Scanner sc;
	
	
	public MemberController() {
		mDao = new MemberDao();
		sc = new Scanner(System.in);
		menu();
		
	}
	public void menu() {
		// 할 일
		loop:
		while(true) {
			// 메세지 출력
			System.out.print("id : 모든아이디조회\nall : 모든정보조회\ncre : 회원추가기능\nq : 프로그램 종료 \n메뉴를 선택하세요. : ");
			// 입력받고
			String scode = sc.nextLine();
			// 입력값 비교
			switch(scode) {
			case "id": // 아이디조회
				break;
			case "all" : // 모든회원정보조회
				
				break;
			case "cre": // 회원추가기능
				
				break;
			case "q": // 종료기능
				break loop;
				
			}
		}
	}
	

	public static void main(String[] args) {
		new MemberController();
	}

}
