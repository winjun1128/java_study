package study.cls.cls01;

public class Calculator {
//계산기

//필드
	String brand;
//생성자
//메소드(동작/기능)
	
/*
 	리턴		매개변수
 	O		O
 	O 		X
 	X		O
 	X		X
 	
 	리턴X : void
 	리턴O : 리턴할 타입
 */
	//리턴X 매개변수X
	//계산기 전원켜는 메소드
	void powerOn() {
		System.out.println("Power On!!");
		return;
	}
	
	//리턴X 매개변수O
	//원하는 밝기 수치를 받아서 밝기 조절기능 메소드
	void setBrightness(int bright) {
		System.out.println("밝기수치 "+bright+"로 조정합니다.");
	}
	
	//리턴O 매개변수X
	String getInfo() {
		//메소드 실행후 반환(return)할 값을 작성
		//return "전자계산기";
		String s = "전자계산기";
		return s;
		//String s = "전자계산기"
	}
	
	//리턴O 매개변수O
	//숫자 2개를 받아서 두 숫자의 합을 반환
	int sum(int x,int y) {
		int result = x + y;
		return result;
	}
	String sum22(int x,int y) {
		int result = x + y;
		return result+"";
	}
	
	int sum(double x, double y) {
		return (int)(x + y);
	}
	
	int sumArr(int[] arr) {
		//powerOn();		//클래스안에선 이름만으로 호출가능
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
