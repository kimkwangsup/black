package day05;

/*
 1. 
 *
 **
 ***
 ****
 *****
 	
 2.
 *****
 ****
 ***
 **
 *
 
 3.
     *
    **
   ***
  ****
 *****
 4.
     *
    ***
   *****
  *******
 *********
 
 5.
 
 11111
 22222
 33333
 44444
 55555
 
 6.
 01234
 12345
 23456
 34567
 45678
 
 7.
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 
 8. 
 5  4  3  2  1
 10 9  8  7  6
 15 14 13 12 11
 20 19 18 17 16
 25 24 23 22 21
 
 9.
 
  1 
  2  3
  4  5  6
  7  8  9 10
 11 12 13 14 15
 */
public class Ex01_star {
	public static void main(String[] args) {
		// 1번
		System.out.println("1. ");
		for(int i = 0; i<5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		/*
		 	(0,0)(0,1)(0,2)(0,3)(0,4)
		 	(1,0)(1,1)(1,2)(1,3)(1,4)
		 	(2,0)(2,1)(2,2)(2,3)(2,4)
		 	(3,0)(3,1)(3,2)(3,3)(3,4)
		 	(4,0)(4,1)(4,2)(4,3)(4,4)
		 	
		 */
		
		
		/*
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0 ; j < 5; j++) {
				if(i >= j) {
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
				System.out.println();		
		
		}
		System.out.println("");
		*/
		
		// 2번
		System.out.println("2. ");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		for(int i = 5; i > 0 ; i--) {
			for(int j = 0 ; j < 5; j++) {
				if(i > j) {
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
				System.out.println();
		}
		*/
		// 3번
		
		System.out.println("3. ");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				char ch = ' ';
				if(j >= 4 - i) {
					ch = '*';
				}
				System.out.print(ch);
			}
			System.out.println("");
		}
		
		
		/*
		for(int i = 5; i >= 0 ; i--) {
			for(int j = 0 ; j < 5; j++) {
				if(i > j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
				System.out.println();
		}
		*/
		System.out.println("");
		
		// 4번
		
		
		System.out.println("4. ");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 9 ; j++) {
				if(i < 1) {
					if(j == 4) {
						System.out.print("*");
					}else { 
						System.out.print(" ");
					}
				}else if(i < 2) {
					if(j >= 3 & j <= 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}else if(i < 3) {
					if(j >= 2 & j <= 6) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else if(i < 4) {
					if(j >= 1 & j <= 7) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else if(i < 5) {
					if(j >= 0 & j <= 8) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
		
		
		System.out.println("5. ");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("[%2d]", i + 1);
			}
			System.out.println("");
			
		}
		System.out.println("5-1. ");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("[%2d]",j);
				// System.out.print(j);
			}
			System.out.println();
			
		}
		
		
		System.out.println("6. ");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("[%2d]",i + j);
				// System.out.print(i + j);
			}
			System.out.println();
			
		}
		
		
		System.out.println("7. ");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("[%2d]",(i * 5) + j + 1);
			
			}
			System.out.println();	
			
		}
		System.out.println("8. ");
		
				
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("[%2d]", (5 * (i + 1)) - j);
				
			}
			System.out.println();
			
		}
		
		System.out.println("9. ");
		/*
		int num;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; ++j) {
				num = (i + 1) + j;
				if(i >= j) {
					if(i > 1) {
						num = num + 1;
					} if( i > 2) {
						num = num + 2;
					} if( i > 3) {
						num = num + 3;
					}
					System.out.printf("[%2d]", num);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; ++j) {
				if(i >= j) {
					if(i == 4) {
						System.out.printf("[%2d]" , i + j + 7);
					}else if(i == 3) {
						System.out.printf("[%2d]" , i + j + 4);
					}else if(i == 2) {
						System.out.printf("[%2d]" , i + j + 2);
					}else if(i == 1) {
						System.out.printf("[%2d]" , i + j + 1);
					}else if(i == 0) {
						System.out.printf("[%2d]" , i + j + 1);
					}
				} else {
					System.out.print(" ");
				}
			}
			
				
			System.out.println();
		}		
		
	}
}
