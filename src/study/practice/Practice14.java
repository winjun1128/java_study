package study.practice;

import java.util.Scanner;

public class Practice14 {

//	public static void main(String[] args) {
//
////		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
////
////		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
////
////		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
////
////		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
////		ex) 입력 : 10
////		결과 : **********
////
////		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
////		ex) 1 - 2 + 3 - 4 .....
////
////		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
////		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
////
////		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
////		ex) 입력 3
////		3 * 1 = 3
////		3 * 2 = 6
////		3 * 3 = 9
////		...
////		3 * 9 = 27
//		
//		Scanner scanner = new Scanner(System.in);
//		//1.
//		System.out.print("정수를 입력 : ");
//		int num = scanner.nextInt();
//		if(num%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
//		System.out.println("1=====================");
//		//2.
//		System.out.print("정수를 입력 : ");
//		int num2 = scanner.nextInt();
//		if(num2%7==0) {
//			System.out.println("7의 배수입니다");
//		}
//		else {
//			System.out.println("아닙니다");
//		}
//		System.out.println("2=====================");
//		//3.
//		int sum =0;
//		for(int i=1;i<=1000;i++) {
//			if(i%5==0) {
//				sum+=i;
//			}
//		}
//		System.out.println("5의 배수의 합은 : "+sum);
//		System.out.println("3=====================");
//		//4.
//		System.out.print("입력 : ");
//		int num4 = scanner.nextInt();
//		for(int i=0;i<num4;i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		System.out.println("4=====================");
//		//5
//		int res=0;
//		for(int i=1;i<=10;i++) {
//			if(i%2==0) {
//				res-=i;
//			}
//			else {
//				res+=i;
//			}
//		}
//		System.out.println(" 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행결과 : "+res);
//		System.out.println("5=====================");
//		//6
//		int sum_6=0;
//		int i_6 = 1;
//		while(sum_6<=1000) {
//			sum_6+=i_6;
//			System.out.println("누적합계 : "+sum_6);
//			i_6++;
//		}
//		System.out.println("6=====================");
//		//7
//		System.out.print("입력 ");
//		int input_dan = scanner.nextInt();
//		for(int i=1;i<=9;i++) {
//			System.out.println(input_dan + " * " +i+ " = "+(input_dan*i));
//		}
//		System.out.println("7=====================");
//	}
	public static void main(String[] args) {
		prac1();
		prac2();
		prac3();
		prac4();
		prac5();
		prac6();
		prac7();
	}
	public static void prac1() {
		//1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		
		if(num%2==0) {	//짝수
			System.out.println("even");
		}
		else {	//홀수
			System.out.println("odd");
		}
		System.out.println((num%2==0)?"even":"odd");
		//case 0:
		//case 1:
		//default:
	}
	public static void prac2() {
		//2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		if(num%7==0) {	//7의 배수
			System.out.println("7의 배수입니다");
		}
		else {	//아니다
			System.out.println("아닙니다");
		}
		System.out.println((num%7==0)?"7의 배수입니다":"아닙니다");
	}
	public static void prac3() {
		//1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		//5 10 15 20 25 30 ....
		//%5 == 0
		int sum = 0;
		for(int i=1;i<=1000;i++) { //1~1000
			if(i%5==0) {	//5의 배수다!!
				//5의 배수를 누적 합 계산 +++++
				sum = sum + i;
			}
		}
		System.out.println("1~1000까지 5의 배수의 합 :"+sum);
		
		sum = 0;
		for(int i=5;i<=1000;i=i+5) {
			sum = sum+i;
		}
		System.out.println("1~1000까지 5의 배수의 합 :"+sum);
	}
	public static void prac4() {
////	4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
////	ex) 입력 : 10
////	결과 : **********
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~50 까지의 수를 입력 : ");
		int num = scanner.nextInt();
		
		//for(초기화; 조건식; 증감식)
			//실행문
		if(num>=1&&num<=50) {
			for(int i=1;i<=num;i++) {
				System.out.print("*");
			}
		}
//		switch(num) {
//		case 1:
//			System.out.println("*");
//		case 2:
//			System.out.println("**");
//			//...
//		case 50:
//			System.out.println("****************************");
//		}
	}
	public static void prac5() {
////	5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
////	ex) 1 - 2 + 3 - 4 .....
		int sum = 0;
		for(int i=1;i<=10;i++) {	//1~10
			if(i%2==0) {//짝수
				sum = sum - i;
			}
			else {	//홀수
				sum = sum+i;	
			}
		}
		System.out.println("계산 결과 = "+sum);
	}
	public static void prac6() {
////	6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
////	1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
//// 1+2+3+4+5....누적합 < 1000 계속 더하기
		//for(int i=1;i<=1000;i++)
		int i=1;
		int sum = 0;
		while(sum<1000) {
			//더하기
			//sum = sum+i;
			//i++;
			sum = sum + i++;
		}
		System.out.println("1000이 넘는 누적 합 : "+sum);
		
		i=1;
		sum = 0;
		while(true) {
			sum = sum+i;
			i++;
			if(sum>=1000) {
				break;
			}
		}
		System.out.println("1000이 넘는 누적 합 : "+sum);
	}
	public static void prac7() {
////	7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
////	ex) 입력 3
////	3 * 1 = 3
////	3 * 2 = 6
////	3 * 3 = 9
////	...
////	3 * 9 = 27
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단(1~9) 몇단? : ");
		int num = scanner.nextInt();
		
		if(num>=1&&num<=9) {
			for(int i=1;i<=9;i++) {
				System.out.printf("%d * %d = %d\n",num,i,num*i);
			}
		}
//		System.out.printf("*1 = %d",num*1);
//		System.out.printf("*2 = %d",num*2);
//		System.out.printf("*3 = %d",num*3);
	}

}
