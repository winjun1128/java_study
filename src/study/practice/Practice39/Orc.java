package study.practice.Practice39;

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		String str = "Orc { name: "+name+", hp: "+hp+" }";
		return str;
	}
}
