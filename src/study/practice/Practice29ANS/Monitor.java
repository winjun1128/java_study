package study.practice.Practice29ANS;

public class Monitor {
	String company;
	int inch;
	int price;
	String color;
	int maxResolutionX;
	int maxResolutionY;
	
	Monitor(String company,int inch,int price){
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	void setXY(int maxResolutionX, int maxResolutionY) {
		this.maxResolutionX = maxResolutionX;
		this.maxResolutionY = maxResolutionY;
	}
	void setColor(String color) {
		this.color = color;
		//입력 -> 수행할 코드 -> 출력
		//매개변수 -> 코드 -> return
	}
	void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}
	int addPrice(int addPriceValue){	//매개변수로 증가할 금액 입력
		//금액인상 실행코드
		this.price+=addPriceValue;
		
		//출력/반환/return 인상된 금액
		return this.price;
	}
	void printInfo() {
		System.out.printf("%s %d인치 %s 모니터 가격:%d원 해상도:%d * %d \n",company,inch,color,price,maxResolutionX,maxResolutionY);
	}
}
