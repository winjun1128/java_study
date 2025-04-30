package study.practice.Practice29;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m = new Monitor("삼성",27,150000);
		m.setColor("검은색");
		Monitor m2 = new Monitor("LG",32,330000);
		m.setXY(1080,780);
		m2.setColor("흰색");
		m2.setXY(4096,2048);
		m.pr();
		m2.pr();
		m2.priceUp(70000);
		m.pr();
		m2.pr();
	}

}
