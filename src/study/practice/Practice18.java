package study.practice;

import java.util.Scanner;

public class Practice18 {

	public static void main(String[] args) {
		prac1();
		prac2();
		prac3();
		prac4();
		prac5();
		prac6();
	}
	public static void prac1() {
//		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*****
//		****
//		***
//		**
//		*
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("1----------------");
	}
	public static void prac2() {
//		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*
//		**
//		***
//		****
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(j<=i)System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("2----------------");
	}
	public static void prac3() {
//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scanner.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i*j==num) {
					System.out.print(i+" ");
				}
			}
		}
		System.out.println();
		System.out.println("3----------------");
	}
	public static void prac4() {
//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
//
//		입력 : 3
//
//		*
//		**
//		***
//		**
//		*
//
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int inputn = scanner.nextInt();
		for(int i=0;i<inputn;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<inputn-1;i++) {
			for(int j=0;j<inputn-i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("4----------------");
	}
	public static void prac5() {
//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		int sum=0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum+=j;
			}
		}
		System.out.println("1~10의 누적 합 결과 : "+sum);
		System.out.println("5----------------");
	}
	public static void prac6() {
//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.	
		int ssum=0;
		int ssumi=1;
		while(ssum<100) {
			if(ssumi%2!=0)ssum+=ssumi;
			else ssum-=ssumi;
			if(ssum<100)ssumi++;		//반복문 안에서도 조건 검사해주기
		}
		System.out.println("마지막 더한 값 : "+ssumi);
		System.out.println("6----------------");
	}


}
