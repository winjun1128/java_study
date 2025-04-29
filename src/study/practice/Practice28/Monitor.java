package study.practice.Practice28;

public class Monitor {
	int inch;
	String company;
	String modelName;
	Monitor(int inch,String company,String modelName){
		this.inch = inch;
		this.company = company;
		this.modelName = modelName;
	}
	public void printInfo() {
		System.out.println("제조사:"+company+" "+"모델명:"+modelName+" "+"인치:"+inch+"인치");
	}
}
