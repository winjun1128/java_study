package study.practice.Practice38;
/* 1. Wizard 클래스를 Novice 클래스로부터 확장하세요. */
//class Wizard {
/* 2. mp 필드를 추가하세요. */

/* 3. fireball() 메소드를 만드세요. */

class Wizard extends Novice {
	int mp;
	public void fireball() {
		System.out.printf("[%s]의 파이어볼@@\n",name);
	}
}
