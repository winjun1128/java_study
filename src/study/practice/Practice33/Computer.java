package study.practice.Practice33;

public class Computer {
	public static final String[]osType= {"윈도우10","애플 OS X","안드로이드"};
	public String os;
	public int memorySize;
	Computer(int osi,int memorySize){
		os = osType[osi];
		this.memorySize = memorySize;
	}
	public void print() {
		System.out.printf("운영체제: %s, 메인메모리: %d\n",os,memorySize);
	}
	public static void main(String[] args) {
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();
	}

}
