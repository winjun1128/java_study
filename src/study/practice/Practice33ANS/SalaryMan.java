package study.practice.Practice33ANS;

public class SalaryMan {	
	int salary;
	
	public SalaryMan() {
		salary = 1000000;
	}
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		//연봉 계산해서 리턴
		//월급 1년치 + 상여금(보너스 월급 500%) 로 계산
		int annualGross = salary * 12 + salary * 5;
		return annualGross;
	}
}

/*
//2. 
다음을 만족하는 클래스 SalaryMan 을 작성하시오.
· 필드 salary 는 월 급여액를 저장하며, int 형으로 초기 값으로 1000000
저장
· 메소드 getAnnualGross()는 연봉을 반환하는 메소드
연봉 : 월급 1년치 + 상여금(보너스 월급 500%) 로 계산

· 기본 생성자에서 필드 salary 의 초기 값을 사용하며, 정수형 인자인
생성자에서 인자가 월 급여액으로 지정
· 다음과 같이 객체를 생성하여 메소드 getAnnualGrass()를 호출하여
출력
System.out.println(new SalaryMan().getAnnualGross());
System.out.println(new SalaryMan(2000000).getAnnualGross());
*/