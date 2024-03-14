package tmp;

public class Prac02 {

	public static void main(String[] args) {
		int n = 12312347;
		double pi = 3.14;
		String s = String.format("%d" , n);
		System.out.println(s);
		System.out.println(s.length());
		char a = 'a';
		String p = String.format("%s" , a);
		System.out.println(p);
		System.out.println(p + s);
	}

}
