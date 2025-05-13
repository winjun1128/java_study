package study.practice.Practice44;

public class Marine extends Unit {
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("걷는다.");
	} //지정된 위치로 이동
	void stimPack() {System.out.println("스팀팩을 사용한다.");} //스팀팩을 사용한다
}
