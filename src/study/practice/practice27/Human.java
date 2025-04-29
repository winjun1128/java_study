package study.practice.practice27;

public class Human {
	String name;
	char sex;
	int old;
	int height;
	int weight;
	String job;
	String blood;
	boolean isHealthy;
	boolean isSleeping;
	Human(){
		this("홍길동",'M',20,170,70,"백수","A",true,false);
	}
	Human(String name,char sex,int old,int height,int weight,String job,String blood,boolean isHealthy,boolean isSleeping){
		this.name = name;
		this.sex = sex;
		this.old = old;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.blood = blood;
		this.isHealthy = isHealthy;
		this.isSleeping = isSleeping;
	}
	public void pr() {
		System.out.printf("이름:%s, 성별:%c, 나이:%d, 키:%d, 몸무게:%d, 직업:%s, 혈액형:%s, ",name,sex,old,height,weight,job,blood);
		System.out.println("건강상태:"+isHealthy+" "+"수면중여부:"+isSleeping);
	}
}
