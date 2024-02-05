package day06;

/*
 0.
 *****
 *****
 *****
 *****
 *****
 
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
 
 
 5.
 11111
 22222
 33333
 44444
 55555


 */

public class Ex01_while_star {
	public static void main(String[] args) {
		
		// 0.
		System.out.println("0.");
		int ga1 = 0;
		while(ga1 < 5) {
			int se1 = 0;
			while(se1 < 5) {
				System.out.printf("%s", "*");
				se1++;
			}
			System.out.println();
			ga1++;
		}
		
		// 1.
		System.out.println("1.");
		
		
		
//		System.out.println("1. ");
//		for(int i = 0; i<5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			
//		}
	
	}
}
