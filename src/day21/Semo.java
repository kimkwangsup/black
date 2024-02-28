package day21;

public class Semo implements Figure{
	int width, height;
	double area;
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public void setArea() {
		area = width * height * 0.5;
	}
	@Override
	public String toString() {
		return "*** Semo\n\t" +
				"밑변 : " + width + 
				"\n\t높이 : " + height +
				"\n\t넓이 : " + area;
	}

}
