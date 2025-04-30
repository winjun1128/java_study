package study.cls.cls02;

public class Ipad {
	String owner; //주인 소유자
	static String brand = "Apple";
//	Ipad(){
//		brand = "Apple";
//	}
	void powerOn() {
		System.out.println("아이패드 전원 켜짐");
		System.out.println(owner+"의 아이패드~");
		//System.out.println(brand + "에서 만든 아이패드");
		//check();
	}
	static void check() {
		System.out.println(brand + "에서 만든 아이패드");
		//this.owner = "dsf";	static은 주체 기준이 없이 호출 -> this 특정 주체를 나타낼수 없다
		//System.out.println(owner+"의 아이패드~");			//static -> 인스턴스 접근 X
		//System.out.println(Ipad.brand + "에서 만든 아이패드");
		//powerOn();
		
	}
}
//전자기기
//어디회사
//모델명
//종류