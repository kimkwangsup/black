package day06;

/*
	1부터 n 까지 합한 결과 중
	몇까지 더해야 100이 넘어서는지
	n을 찾아서 출력하세요. 합도 같이 출력하세요.
 */
public class Ex02 {
	public static void main(String[] args) {
		
		int i = 1;
		int sum =0;
		
		while (true) {
			sum += i;
			if (sum > 100) {
				
				break;
			}
			i++;
		}
		System.out.println(i);
		
	}

}
