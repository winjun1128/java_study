package study.practice.Practice41;

public class Refrigerator extends Common{
	String brand;
	int doorcount;
	IceTray icetray;	//냉장고에 아이스 트레이가 있다.
	Refrigerator(int size,int ci,boolean isOn,String brand,int doorcount,IceTray icetray){
		super(size,ci,isOn);
		this.brand=brand;
		this.doorcount=doorcount;
		this.icetray = icetray;
	}
	public void changeState() {
		isOn = !isOn;
		if(isOn)System.out.println("전원이 켜졌습니다.");
		else System.out.println("전원이 꺼졌습니다.");
	}
	public void changeCi(int t) {
		ci = t;
	}
}
