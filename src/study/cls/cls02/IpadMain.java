package study.cls.cls02;

public class IpadMain {

	public static void main(String[] args) {
		Ipad pad1 = new Ipad();
		pad1.owner = "오이영";
		pad1.powerOn();
		
		Ipad pad2 = new Ipad();
		pad2.owner = "구도원";
		pad2.powerOn();
		Ipad.check();
		//pad2.check();	-> Ipad.check();
		System.out.println(Ipad.brand);
		//System.out.println(pad1.brand);	-> Ipad.brand
	}

}
