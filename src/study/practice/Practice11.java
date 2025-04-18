package study.practice;

import java.util.Scanner;

public class Practice11 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("국어점수 : ");
//		int kor=scanner.nextInt();
//		System.out.print("수학점수 : ");
//		int math=scanner.nextInt();
//		System.out.print("영어점수 : ");
//		int eng=scanner.nextInt();
//		if(practice3(kor,math,eng)) {
//			System.out.println("국어 : "+kor);
//			System.out.println("수학 : "+math);
//			System.out.println("영어 : "+eng);
//			System.out.println("합계 : "+(kor+math+eng));
//			System.out.printf("평균 : %.1f\n",(kor+math+eng)/3.0);
//			System.out.println("축하합니다, 합격입니다!");
//		}
//		else {
//			System.out.println("불합격입니다.");
//		}
//
//	}
//	public static boolean practice3(int kor,int math,int eng) {
//		if((kor>=40&&math>=40&&eng>=40)&&(kor+math+eng)/3.0>=60){
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	public static void main(String[] args) {
		
		int a=10;
		a++;
		a= a + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int lang = scanner.nextInt();
		System.out.println("수학점수 : ");
		int math = scanner.nextInt();
		System.out.println("영어점수 : ");
		int eng = scanner.nextInt();
		
		//점수 총합 / 3 => 평균
		//int avg = (lang + math + eng) /3;
		int total = lang+math+eng; //총합
		double avg = (lang+math+eng)/3.0;
		if(lang >= 40 && math >= 40 && eng >= 40 && avg>=60) {
			//합격
			System.out.println("국어 : "+lang);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			//System.out.println("합계 : " + (lang+math+eng));
			System.out.println("합계 : "+total);
			//System.out.println("평균 : "+avg);
			System.out.printf("평균 : %.2f\n",avg);
			System.out.println("축하합니다. 합격입니다!");
//			if(평균>=60) {
//				//합격
//			}
//			else {
//				//불합격
//			}
		}
		else {
			//불합격
			System.out.println("불합격입니다.");
		}
		// 40 			50    6-     50
		if(lang<40||math<40||eng<40||avg<60) {
			//불합격
		}
		else {
			//합격
		}
	}

}
