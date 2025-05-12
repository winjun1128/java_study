package study.practice.Practice41;

public class TrashBox extends Common {
	String Color;
	TrashBox(int size,int ci,boolean isOn,String Color){
		super(size,ci,isOn);
		this.Color=Color;
	}
	public int isCapacityRate() {
		return ci/size;
	}
	public void plusCapacity(int c) {
		ci+=c;
	}
	public void minusCapacity(int c) {
		ci-=c;
	}
	public void chagneState() {
		isOn = !isOn;
		if(isOn)System.out.println("통이 열렸습니다.");
		else System.out.println("통이 닫혔습니다.");
	}
}
