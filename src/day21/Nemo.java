package day21;

public class Nemo implements Figure {
	int width, height;
	double area;
	
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public void setArea() {
		area = width * height;
	}

	@Override
	public String toString() {
		return "*** Nemo\n\t" +
				"가로 : " + width + 
				"\n\t세로 : " + height +
				"\n\t넓이 : " + area;
	}
}
