package study.cls.cls01;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();	//생성자 호출(실행)
		Car car2 = new Car();
		Car car3 = new Car("흰색");
		
		System.out.println(car1.color);
		System.out.println(car3.color);
		
		Car car4 = new Car("검청");
		System.out.println(car4.color);
		
		Car car5 = new Car("파랑",1000000);
		System.out.println(car5.color);
		System.out.println(car5.price);
		
		car5.color = "노랑";
		car5.model = "모닝";
		System.out.println(car5.model);
		System.out.println(car5.color);
		System.out.println(car5.price);
		
		Car car6 = new  Car("소나타",2500000);
		System.out.println(car6.color);
		
		//car1.model
//		int num = 10;
//		for(;;) {
//			num = 20;
//		}
	}

}
