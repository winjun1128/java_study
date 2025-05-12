package study.practice.Practice40;

class Circle extends Shape {
	int radius;	//반지름
	/* 3. 원의 넓이를 구하도록 area()를 재정의하세요. */
	public double area() {
		return 3.141592*radius*radius;
	}
}
