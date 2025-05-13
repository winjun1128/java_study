package study.practice.Practice44ANS;

public class Practice44 {

	public static void main(String[] args) {
		Unit[] arr = {new Marine(),new Tank(),new Dropship()};
		for(Unit unit:arr) {
			unit.stop();
			unit.move(150, 150);
		}
		//Unit u = new Unit();
	}

}
abstract class Unit {
	int x,y; //현재위치
	void stop() {
		x=x;
		y=y;
		System.out.println("멈춘다");
	}//정지
	abstract void move(int x,int y);
}
class Marine extends Unit { // 보병
	int x, y; // 현재 위치
	void move(int x, int y) { 
		System.out.println("걸어서 이동");
	} //지정된 위치로 이동
	void stimPack() { /* .*/} //스팀팩을 사용한다
}
class Tank extends Unit { // 탱크
	int x, y; // 현재 위치
	void move(int x, int y) {
		System.out.println("탱크 바퀴 굴러가면서 이동");
	} //지정된 위치로 이동
	void changeMode() { /* . */} //공격모드를 변환한다
}
class Dropship extends Unit { // 수송선
	int x, y; // 현재 위치
	void move(int x, int y) { 
		System.out.println("날아서 이동");
	} //지정된 위치로 이동
	void load() { /* .*/ } //선택된 대상을 태운다
	void unload() { /* .*/ } //선택된 대상을 내린다
}
