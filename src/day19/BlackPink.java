package day19;

public class BlackPink {
	private String name;
	private int kor, eng, math, total, rank;
	private double avg;
	
	public BlackPink() {}
	public BlackPink(String name) {
		this.name = name;
	}
	public BlackPink(String name, int kor, int eng, int math) {
		this(name);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
		setAvg();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {
		total = kor + eng + math;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setAvg() {
		avg = total / 3.0;
	}
	@Override
	public String toString() {
		return "*** 이름 : " + name + "\n\t국어 : " + kor + "\n\t영어 : " + eng + "\n\t수학 : " + math + "\n\t종합 : "+ total + "\n\t평균 : " + avg + "\n\t순위 : " + rank;
	}
	
}
