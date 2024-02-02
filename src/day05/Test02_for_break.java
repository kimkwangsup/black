package day05;

public class Test02_for_break {

	public static void main(String[] args) {
		/*
		 	반복문 제어 명령
		 	: 반복문의 반복작업을 제어 할 목적으로 만들어진 명령들..
		 	
		 		1. break : switch - case 에서도 사용
		 			: 이 명령을 만나면 실행되고 있는 반복문을 즉시 종료하세요.
		 			
		 			주의 ]
		 				이 명령은 바로 위의 반복문만 제어한다.
		 				
		 				예 ]
		 					
		 					for(int i = 0 ; i < 10 ; i++){ // 1
		 						for(;;){				   // 2
		 							if(){
		 								break;
		 							}
		 						}	
		 					}
		 					의 경우 여기의 break 명령은 2번 반복문에만 적용이 된다.
		 
		 		2. continue
		 		: 실행되는 반복문의 다음 회차로 즉시 진행하세요.
		 		
		 			for(int i = 0 ; i < 5 ; i++){
		 				if(i == 3){
		 					continue;
		 				}
		 				System.out.println("^^");
		 			}
		 */
		for(int i = 0 ; i < 5 ; i++){
				if(i == 3){
					System.out.println(i + " : ㅠㅠ");
					continue;
				}
				System.out.println(i + " : ^^");			
		}
	}
}
