package study.practice.Practice40;

class Square extends Shape {
	int length; //한 변의 길이
	
	/* 1. 정사각형 넓이를 구하도록 area()를 재정의하세요. */
	public double area() {
		return (double)length*length;
	}
}
