package study.practice.Practice29ANS;

public class Rectangle {
	int width;	//밑변
	int height;	//높이
	
	Rectangle(int width,int height){
		this.width = width;
		this.height = height;
	}
	double getArea() {
		return width * height;
	}
}
