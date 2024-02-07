package day07;

public class Prac01 {
	public static void main(String[] args) {
        double e = Math.E;
        double pi = Math.PI;
        double result = Math.pow(e, pi * Math.sqrt(-1)) + 1;
        System.out.println("e^iπ + 1 = " + result);
    }
}
