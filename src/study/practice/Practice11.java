package study.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor=scanner.nextInt();
		System.out.print("수학점수 : ");
		int math=scanner.nextInt();
		System.out.print("영어점수 : ");
		int eng=scanner.nextInt();
		if(practice3(kor,math,eng)) {
			System.out.println("국어 : "+kor);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			System.out.println("합계 : "+(kor+math+eng));
			System.out.printf("평균 : %.1f\n",(kor+math+eng)/3.0);
			System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}

	}
	public static boolean practice3(int kor,int math,int eng) {
		if((kor>=40&&math>=40&&eng>=40)&&(kor+math+eng)/3.0>=60){
			return true;
		}
		else {
			return false;
		}
	}

}
