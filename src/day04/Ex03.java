package day04;

/*
 	게시판에 게시물을 15개 게시할 수 있다.
 	랜덤하게 게시물 수를 입력받아서(100 이상..)
 	필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하세요.
 		
 	참고 ] 
 		게시물이 없어도 1페이지는 필요하다.
 */
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		// 입력 도구 준비 
		Scanner sc = new Scanner(System.in);
		// 입력 메시지 출력
		System.out.print("게시물 수를 입력하세요 : ");
		// 입력받은 값 기억
		int contents = sc.nextInt();
		// 페이지 수 계산
		int pages = 0;
		
		if(contents % 15 == 0) {
			// 게시물이 없는 경우와 15로 나누어 떨어지는 경우
			if(contents == 0) {
				// 게시물이 없는 경우
				pages = 1;
			}else {
				// 15로 나누어 떨어지는 경우
				pages = contents / 15;
			}
		} else {
			pages = (contents / 15) + 1;
			// 나머지가 0이 아닐때
		}
		// 결과 출력
		
		System.out.printf("입력 된 게시글 수는 %3d개 이고 \n필요한 페이지 수는 %2d개 입니다.\n", contents, pages);
		System.out.println("총 게시물 : " + contents);
		System.out.println("총 페이지 : " + pages);
	
	}
}
