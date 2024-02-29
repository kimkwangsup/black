package day20;

public class Student {
	private String name;
	private int ko, en, mt, sum;
	private double avg;
	public Student() {}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int ko, int en, int mt) {
		this.name = name;
		this.ko = ko;
		this.en = en;
		this.mt = mt;
		setSum();
		setAvg();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getMt() {
		return mt;
	}
	public void setMt(int mt) {
		this.mt = mt;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		sum = ko + en + mt;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		avg = sum / 3.0;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "name :  " + name + 
				"\n\t국어 : " + ko + 
				"\n\t영어 : " + en + 
				"\n\t수학 : " + mt + 
				"\n\t총점 : " + sum +
				"\n\t평균 : " + avg + "\n";
	}
}