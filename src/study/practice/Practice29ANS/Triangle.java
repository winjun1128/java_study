package study.practice.Practice29ANS;

public class Triangle {
	int width;
	int height;
	
	void setSize(int width,int height) {
		this.width = width;
		this.height = height;
	}
	double getArea() {
		return width * height / 2.0;
	}
}
