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
		
		//bm1.model;
		//bm1.getModel();
		//bm1.printInfo();
		//BluetoothMike bm2 = new WirelessMike();
		//BluetoothMike bm2 = new Mike();
		
		BluetoothMike bm2 = new BluetoothMike();
		bm2.isConnect = true;
		bm2.model = "성능굿마이크";
		bm2.price = 5000;
		bm2.type = "핀마이크";
		
		String str2 = bm2.toString();
		System.out.println(str2 + " 이런 정보있는 마이크 샀음");
		//System.out.println(str2);
		//System.out.println(" 이런 정보있는 마이크 샀음");
		
		//Mike m3 = new  BluetoothMike();
		m3.check();
		System.out.println(m3.toString());
		
		//Mike m2 = new WirelessMike();
		System.out.println(m2.toString());
		
		//Mike m1 = new Mike();
		m1.model = "일반마이크";
		System.out.println(m1.model);
		System.out.println(m1);
		//객체 자체를 출력 -> toString() 결과를 출력
		
		Object o1 = m1;
		o1 = m2;
		o1 = m3;
		o1 = bm2;
		o1 = bm1;
	}

}
