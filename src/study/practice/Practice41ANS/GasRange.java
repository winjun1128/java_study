package study.practice.Practice41ANS;

public class GasRange {
//	가스렌지
//	- 화구가 몇인지
//	- 어디 브랜드인지
//	- 가격이 얼마인지
//	- 불을 켠다
//	- 불을 끈다
//	- 불세기르 조절한다.
	int craterCount;	//화구갯수
	String brand;
	int price;
	
	int currentFireLevel; //현재 불세기 단계(0~10)
	
	//불은켠다
	public void fireOn() {
		
	}
	//불을끈다.
	public void fireOff() {
		//isPowerOn = false;
		currentFireLevel = 0;
	}
	public void setCurrentFireLevel(int currentFireLevel) {
		this.currentFireLevel = currentFireLevel;
	}
}
