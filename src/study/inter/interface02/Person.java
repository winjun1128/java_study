package study.inter.interface02;

public class Person {
 //SamsungPhone s;
 //ApplePhone a;
 //부모클래스 
 //Phone p;
	//멤버로 인터페이스 가짐
	Callable c;
	
	//사람이 전화를 거는 기능
	public void call(String phoneNumber) {
		c.call();  //전화기를 사용해서 전화걸기
	}
}
