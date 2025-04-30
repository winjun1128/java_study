package study.practice.Practice29;

public class TV {
	String company;
	int year;
	int inch;
	TV(String c,int y,int i){
		company = c;
		year = y;
		inch = i;
	}
	public void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV\n",company,year,inch);
	}
}
