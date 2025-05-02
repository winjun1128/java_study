package study.practice.Practice33;

public class SalaryMan {
	int salary;
	SalaryMan(){
		salary = 1000000;
	}
	SalaryMan(int sal){
		salary = sal;
	}
	public int getAnnualGross() {
		return salary*12+salary*5;
	}
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());

	}

}
