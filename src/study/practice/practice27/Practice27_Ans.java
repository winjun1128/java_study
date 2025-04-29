//package study.practice.practice27;
//class Person{			->같은 파일에 여러 클래스 가능(public클래스만 하나만) 
//	String name;
//	char sex;
//	int old;
//	int height;
//	int weight;
//	String job;
//	String blood;
//	boolean isHealthy;
//	boolean isSleeping;
//	Person(){
//		this("홍길동",'M',20,170,70,"백수","A",true,false);
//	}
//	Person(String name,char sex,int old,int height,int weight,String job,String blood,boolean isHealthy,boolean isSleeping){
//		this.name = name;
//		this.sex = sex;
//		this.old = old;
//		this.height = height;
//		this.weight = weight;
//		this.job = job;
//		this.blood = blood;
//		this.isHealthy = isHealthy;
//		this.isSleeping = isSleeping;
//	}
//	public void pr() {
//		System.out.printf("이름:%s, 성별:%c, 나이:%d, 키:%d, 몸무게:%d, 직업:%s, 혈액형:%s, ",name,sex,old,height,weight,job,blood);
//		System.out.println("건강상태:"+isHealthy+" "+"수면중여부:"+isSleeping);
//	}
//}
//public class Practice27_Ans {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Person p = new Person("한승준",'M',28,176,83,"백수","O",true,false);
//		p.pr();
//		
//		Person p2 = new Person();
//		p2.pr();
//	}
//
//}
//※클래스는 같은 패키지 끼리는 인식가능
//※메소드는 같은 클래스 끼리는 인식가능
//그냥 클래스: 같은 패키지 안에서만 이 클래스를 사용가능
//퍼블릭 클래스: 다른 패키지에서도 사용가능하지만 파일명과 같아야함
//※다른패키지에서 사용하는 법:	import 사용할패키지.퍼블릭클래스;  // 퍼블릭 클래스를 import 해줘야 함!
package study.practice.practice27;

public class Practice27_Ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_Ans p1 = new Person_Ans();
		
		p1.name = "일이름";
		p1.gender = "남";
		p1.age = 40;
		p1.height = 179.9;
		p1.weight = 91;//91.0
		p1.job = "선생님";
		p1.bloodType = "AB";
		p1.isHealthy = true;
		p1.isSleeping = false;
		
		System.out.println("이름: "+p1.name);
		System.out.println("성별: "+p1.gender);
		System.out.println("나이 : "+p1.age);
		System.out.println("키 : "+p1.height);
		System.out.println("몸무게 : "+p1.weight);
		System.out.println("직업 : "+p1.job);
		System.out.println("혈액형 : "+p1.bloodType);
		System.out.println("건강여부 : "+p1.isHealthy);
		System.out.println("수면중여부 : "+p1.isSleeping);
		System.out.println("수면중여부 : "+(p1.isSleeping?"자는중":"안자는중"));
		System.out.println();
		
		Person_Ans p2 = new Person_Ans("이름이","여",29,162.1,62.1,"학생","O",false,true);
		p2.weight = 55;
		System.out.println("이름: "+p1.name);
		System.out.println("성별: "+p1.gender);
		System.out.println("나이 : "+p1.age);
		System.out.println("키 : "+p1.height);
		System.out.println("몸무게 : "+p1.weight);
		System.out.println("직업 : "+p1.job);
		System.out.println("혈액형 : "+p1.bloodType);
		System.out.println("건강여부 : "+p1.isHealthy);
		System.out.println("수면중여부 : "+p1.isSleeping);
		System.out.println("수면중여부 : "+(p1.isSleeping?"자는중":"안자는중"));
		System.out.println();
		
		p1.printPersonInfo();
		p2.printPersonInfo();
		
		Person_Ans p3 = new Person_Ans();
		p3.printPersonInfo();
	}

}
