package study.practice.Practice41ANS;

public class Sink {
//	싱크대
//	- 가로, 세로, 깊이 사이즈
//	- 색상
//	- 재질
	int width;				//500 mm
	int height;				//400 mm
	int depth;				//350 mm
	String color;
	String material;
	
	public int getWidth() {			//기본 getter
		return width;				//그상태그대로 mm 단위
	}
	public int getWidthAsCm() {	//width cm 단위로 반환하는 메소드(getter)
		return width/10;
	}
	public double getwidthAsMeter() {	//width m 단위로 리턴
		return width/1000.0;
	}
	
}
