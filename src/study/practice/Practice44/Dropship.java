package study.practice.Practice44;

public class Dropship extends Unit {
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("날기");
	} //지정된 위치로 이동
	void load() {System.out.println("태운다.");} //선택된 대상을 태운다
	void unload() {System.out.println("내린다.");} //선택된 대상을 내린다
}
