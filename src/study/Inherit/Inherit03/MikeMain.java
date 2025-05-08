package study.Inherit.Inherit03;

public class MikeMain {

	public static void main(String[] args) {
	//자식에 부모 성분이 있으면 부모에 담기 가능
	//타입: 설게도 / 생성자: 몸통
	//설계도만큼 몸통을 이용가능
	//생성자가 호출되면 객체 만들어짐
		Mike m1 = new Mike();
		m1.volumeUp();
		WirelessMike wm1 = new WirelessMike();
		wm1.volumeUp();
		BluetoothMike bm1 = new BluetoothMike();
		bm1.volumeUp();
		bm1.volumeUp(5);
		
		Mike m2 = new WirelessMike();
		Mike m3 = new BluetoothMike();//부모가 자식을 담아줌
		
		m2.volumeUp();
		m3.volumeUp();//마이크라고 할지라도 재정의를 호출
		
		//m3.connect();//설계도가 마이크라서 불가
		m3.check();
		
		bm1.check();
		
		//BluetoothMike bm2 = new WirelessMike();
		//BluetoothMike bm2 = new Mike();
	}

}
