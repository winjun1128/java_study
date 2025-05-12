package study.practice.Practice41;

public class Common {
	int size;
	int ci;
	boolean isOn;
	Common(int size,int ci,boolean isOn){
		this.size=size;
		this.ci=ci;
		this.isOn=isOn;
	}
	public void changeState() {
		isOn = !isOn;
		if(isOn)System.out.println("ㅇㅇ이 켜졌습니다.");
		else System.out.println("ㅇㅇ이 꺼졌습니다.");
	}
	public void changeCi(int ci) {
		this.ci = ci;
	}
}
