package day08;

public class Test10_toCharArray {

	public static void main(String[] args) {
		String jennie = "jennie";
		char[] name = jennie.toCharArray();
		for(char c : name) {
			System.out.print("[" + c + "]");
		}
		System.out.println();
		System.out.println(jennie.indexOf('n'));
		String blackPink = "Black Pink";
		System.out.println(blackPink.indexOf("ink"));
	}

}
