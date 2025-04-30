package study.practice.Practice29;

public class Monitor {
	String company;
	int inch;
	int price;
	String color;
	int max_x;
	int max_y;
	Monitor(String company,int inch,int price){
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	public void setXY(int max_x,int max_y) {
		this.max_x = max_x;
		this.max_y = max_y;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void turnOn() {
		System.out.println("전원이 켜졌습니다");
	}
	public int priceUp(int up) {
		price+=up;
		return price;
	}
	public void pr() {
		System.out.printf("제조사:%s 인치:%d 가격:%d 색:%s X:%d Y:%d\n",company,inch,price,color,max_x,max_y);
	}
}
