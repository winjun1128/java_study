package study.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		//basic();
		//level1();
		//level2();
		level3();
	}
	public static void basic() {
//		퀴즈
//
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int throwball;
		int hitball;
		int outcount=0;
		System.out.println("1~10");
		System.out.printf("투수\t사용자입력\n");
		while(true) {
			throwball = random.nextInt(10)+1;
			System.out.printf("%d\t",throwball);
			hitball = scanner.nextInt();
			if(throwball==hitball) {
				System.out.println("안타");
			}
			else {
				System.out.println(++outcount+"아웃");
			}
			if(outcount==3) {
				System.out.println("게임 종료");
				break;
			}
		}
	}
	public static void level1() {
//		퀴즈
//
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int throwball;
		int hitball;
		int outcount=0;
		System.out.println("1~10");
		System.out.printf("투수\t사용자입력\n");
		for(int i=0;i<3;i++) {
			System.out.println(i+1+"회");
			outcount=0;
			while(true) {
				throwball = random.nextInt(10)+1;
				System.out.printf("%d\t",throwball);
				hitball = scanner.nextInt();
				if(throwball==hitball) {
					System.out.println("안타");
				}
				else {
					System.out.println(++outcount+"아웃");
				}
				if(outcount==3) {
					System.out.println(i+1+"회 종료");
					break;
				}
			}
		}
	}
	public static void level2() {
//		퀴즈
//
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		String[] hitternames = {"1번","2번","3번","4번","5번","6번","7번","8번","9번"};
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int throwball;
		int hitball;
		int outcount=0;
		System.out.println("1~10");
		System.out.printf("투수\t사용자입력\n");
		int inning = 1;
		int nexthitter = 0;
		while(true) {
			System.out.println(inning+"회 시작");
			outcount=0;
				while(true) {
					System.out.println(nexthitter+1+"번타자 : "+hitternames[nexthitter]);
					throwball = random.nextInt(10)+1;
					System.out.printf("%d\t",throwball);
					hitball = scanner.nextInt();
					if(throwball==hitball) {
						System.out.println("안타");
					}
					else {
						System.out.println(++outcount+"아웃");
					}
					if(nexthitter==8)nexthitter=0;
					else nexthitter++;
					if(outcount==3) {
						break;
					}
				}
			
			System.out.println(inning+"회 종료");
			inning++;
			if(inning==13)break;
		}
	}
	public static void level3() {
//		퀴즈
//
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		
		String[] hitternames = {"1번","2번","3번","4번","5번","6번","7번","8번","9번"};
		int[] entercounts = new int[9];
		int[] hitcounts = new int[9];
		double[] hitrates = new double[9];
		for(int i=0;i<9;i++) {
			hitrates[i]=0;
		}
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int throwball;
		int hitball;
		int outcount=0;
		System.out.println("1~10");
		System.out.printf("투수\t사용자입력\n");
		int inning = 1;
		int nexthitter = 0;
		while(true) {
			System.out.println(inning+"회 시작");
			outcount=0;
			while(true) {
				entercounts[nexthitter]++;
				System.out.printf("%d번타자 : %s 타율 : %.3f\n",nexthitter+1,hitternames[nexthitter],hitrates[nexthitter]);
				throwball = random.nextInt(10)+1;
				System.out.printf("%d\t",throwball);
				hitball = scanner.nextInt();
				if(throwball==hitball) {
					System.out.println("안타");
					hitcounts[nexthitter]++;
					hitrates[nexthitter]=(double)hitcounts[nexthitter]/entercounts[nexthitter];
				}
				else {
					System.out.println(++outcount+"아웃");
					hitrates[nexthitter]=(double)hitcounts[nexthitter]/entercounts[nexthitter];
				}
				if(nexthitter==8)nexthitter=0;
				else nexthitter++;
				if(outcount==3) {
					break;
				}
			}
			System.out.println(inning+"회 종료");
			inning++;
			if(inning==13)break;
		}
	}

}
