package study.cls.cls03.pack3;

public class Point {
	int lang;
	int eng;
	int math;
	String name;
	
//	public Point() {
//		
//	}
	
//	private Point() {
//		
//	}
	
	//getter 값 가져오기(반환)
	//get필드명
	//setter 값 세팅(저장)
	//set필드명
	public int getLang() {
		return lang;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public void setLang(int lang) {
		//실행코드
		//잘못된 값 필터
		if(lang<0)
			lang = 0;
		if(lang>100)
			lang = 100;
		if(lang<0||lang>100) {
			System.out.println("범위를 벗어남, 저장 불가");
			return;
		}
		this.lang = lang;
	}
	public void setEng(int eng) {
		if(eng>100)
			eng = 100;
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
}
