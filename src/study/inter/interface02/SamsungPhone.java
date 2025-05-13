package study.inter.interface02;

public class SamsungPhone implements Callable, Connectable {
	//필드변수
	int callStatus; //전화상태
	
	@Override
	public void call() {
		System.out.println("삼성폰 전화통화");
		//this.CALL_ON = 3; //불가(상속이 아니라서)
		callStatus = Callable.CALL_ON;
	}

	@Override
	public void connect() {
		System.out.println("삼성폰 블루투스 연결");
	}

	@Override
	public void disconnect() {
		System.out.println("삼성폰 블루트슷 연결종료");
		
	}

}
