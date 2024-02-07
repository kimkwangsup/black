package day08;

public class Test03_label {

	public static void main(String[] args) {
		loop:
		for(int i = 0 ; i < 10 ; i++) {
			l1:
			for(int j = 0 ; j < 5 ; j++) {
				if(j == 3) {
					continue loop;
				}
				
				for(int k = 0 ; k < 10 ; k++) {
					if(k == 4) {
						continue loop;
					} else {
						continue l1;
					}
				}
			}
			for(int j = 0 ; i < 10 ; j++) {
				if(j == 7) {
//					continue l1; // ===>  X : 감싸는 반복문이 아니기 때문에 안된다.
				}
			}
			
		}
	}

}
