package study.practice.Practice44;

public class Unit {
	int x, y; // 현재 위치
	void move(int x, int y) {
		this.x=x;
		this.y=y;
	} //지정된 위치로 이동
	void stop() { System.out.println("정지"); } //현재 위치에 정지
}
