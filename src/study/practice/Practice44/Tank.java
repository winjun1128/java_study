package study.practice.Practice44;

public class Tank extends Unit {
	void move(int x, int y) { 
		this.x=x;
		this.y=y;
		System.out.println("바퀴구르기");
	} //지정된 위치로 이동
	void changeMode() {System.out.println("공격모드를 변환한다.");} //공격모드를 변환한다
}
