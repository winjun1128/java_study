package study.practice.Practice39ANS;

public class SuperTest {

	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc = new Orc("오크",80);
		//System.out.println(orc.toString());
		System.out.println(orc);
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior orcwarrior = new OrcWarrior("오크전사",120,3);
		System.out.println(orcwarrior.toString());
	}

}
class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		//return "Orc { name: "+name+", hp: "+hp+" }";
		//return String.format("Orc { name : %s, hp : %d }", name,hp);
		String str = "Orc { name: "+name+", hp: "+hp+" }";
		return str;
	}
}
class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);	//부모클래스 생성자 호출
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		return String.format("Orc { name : %s, hp : %d, armor: %d }", name,hp,amor);
	}
}