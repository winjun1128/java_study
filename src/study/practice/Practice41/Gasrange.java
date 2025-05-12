package study.practice.Practice41;

public class Gasrange extends Common {
	String brand;
	int price;
	Gasrange(int size,int ci,boolean isOn,String brand,int price){
		super(size,ci,isOn);
		this.brand=brand;
		this.price=price;
	}
	public void changeState() {
		isOn = !isOn;
		if(isOn)System.out.println("블이 켜졌습니다.");
		else System.out.println("블이 꺼졌습니다.");
	}
	public void changeCi(int f) {
		ci = f;
	}
}
