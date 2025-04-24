package study.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice21 {
	public static void main(String[] args) {
		//prac3v2();
		prac1();
		prac2();
		prac3();
		prac4();
	}
	public static void prac3() {
////	우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
////	반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
////	각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
////	(*가능한 효율적인 구조를 생각해보세요)
////
////	ex)
////	1반 : 10 10 10 10 10
////	2반 : 20 20 20 20 20
////	3반 : 30 30 30 30 30
////
////	1반 평균 : 10
////	2반 평균 : 20
////	3반 평균 : 30
////	전체 평균 : 20
	Scanner scanner = new Scanner(System.in);
	int[][]scoreArr = new int[3][5];
	for(int i=0;i<scoreArr.length;i++) {
		System.out.print(i+1+"반 : ");
		for(int j=0;j<scoreArr[i].length;j++) {
			scoreArr[i][j] = scanner.nextInt();
		}
	}
	int[] sumClass = new int[3];
	for(int i=0;i<scoreArr.length;i++) {
		for(int j=0;j<scoreArr[i].length;j++) {
			sumClass[i]+=scoreArr[i][j];
		}
	}
	double[] avgClass = new double[3];
	for(int i=0;i<avgClass.length;i++) {
		avgClass[i]=sumClass[i]/5.0;
	}
	double totalavg=0;
	for(int i=0;i<avgClass.length;i++) {
		System.out.println(i+1+"반 평균 : "+avgClass[i]);
		totalavg+=avgClass[i];
	}
	totalavg = totalavg / 3.0;
	System.out.printf("전체 평균 : %.2f\n",totalavg);
	System.out.println("3---------------------");
	}
	public static void prac3v1() {
////	우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
////	반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
////	각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
////	(*가능한 효율적인 구조를 생각해보세요)
////
////	ex)
////	1반 : 10 10 10 10 10
////	2반 : 20 20 20 20 20
////	3반 : 30 30 30 30 30
////
////	1반 평균 : 10
////	2반 평균 : 20
////	3반 평균 : 30
////	전체 평균 : 20
		Scanner scanner = new Scanner(System.in);
		int[][] scores = new int[3][5];
		// ㅁㅁㅁㅁㅁ
		// ㅁㅁㅁㅁㅁ
		// ㅁㅁㅁㅁㅁ
		int[] scores1 = new int[5];
		int[] scores2 = new int[5];
		int[] scores3 = new int[5];
		System.out.print("1반 : ");
		for(int i=0;i<scores1.length;i++) {
			scores1[i] = scanner.nextInt();
		}
		System.out.print("2반 : ");
		for(int i=0;i<scores2.length;i++) {
			scores2[i] = scanner.nextInt();
		}
		System.out.print("3반 : ");
		for(int i=0;i<scores3.length;i++) {
			scores3[i] = scanner.nextInt();
		}
		//1반평균	5명점수합/5
		//2반평균	5명점수합/5
		//3반평균 5명점수합/5
		//전체 평균 15점수합/15 	1반평균+2반평균+3반평균/3
		
		int[] totals = new int[3];
		//0 : 1반
		//1 : 2반
		//2 : 3반
		for(int i=0;i<scores1.length;i++) {
			totals[0]=totals[0]+scores1[i];
		}
		for(int i=0;i<scores2.length;i++) {
			totals[1]=totals[1]+scores2[i];
		}
		for(int i=0;i<scores3.length;i++) {
			totals[2]=totals[2]+scores3[i];
		}
		
//		for(int i=0;i<5;i++) {
//			totals[0] = totals[0]+scores1[i];
//			totals[1] = totals[1] + scores2[i];
//			totals[2] = totals[2] + scores3[i];
//		}
		System.out.printf("1반 평균 : %.2f\n",totals[0]/5.0);
		System.out.printf("1반 평균 : %.2f\n",totals[1]/5.0);
		System.out.printf("1반 평균 : %.2f\n",totals[2]/5.0);
		System.out.printf("전체 평균 : %.2f\n",(totals[0]+totals[1]+totals[2])/15.0);
		//int total1
		//int total2
		//int total3
	}
	public static void prac3v2() {
////	우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
////	반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
////	각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
////	(*가능한 효율적인 구조를 생각해보세요)
////
////	ex)
////	1반 : 10 10 10 10 10
////	2반 : 20 20 20 20 20
////	3반 : 30 30 30 30 30
////
////	1반 평균 : 10
////	2반 평균 : 20
////	3반 평균 : 30
////	전체 평균 : 20
		Scanner scanner = new Scanner(System.in);
		int[][] scores = new int[3][5];
		//	01234
		//0 ㅁㅁㅁㅁㅁ
		//1 ㅁㅁㅁㅁㅁ
		//2 ㅁㅁㅁㅁㅁ
		for(int i=0;i<scores.length;i++) {				//i: 0 1 2
			System.out.print(i+1+"반 : ");
			for(int j=0;j<scores[i].length;j++) {		//j: 0 1 2 3 4
				scores[i][j] = scanner.nextInt();
			}
		}
	
		//1반평균	5명점수합/5
		//2반평균	5명점수합/5
		//3반평균 5명점수합/5
		//전체 평균 15점수합/15 	1반평균+2반평균+3반평균/3
		
		int total = 0; //전체 총합
		int classTotal  = 0;	//한 반의 총합
		for(int i=0;i<scores.length;i++) {				//i: 0 1 2
			
			classTotal=0;
			
			for(int j=0;j<scores[i].length;j++) {		//j: 0 1 2 3 4
				classTotal = classTotal + scores[i][j]; 
			}
			System.out.printf("%d반 평균 : %.2f\n",(i+1),classTotal/5.0);
			total += classTotal;
		}
		System.out.printf("전체 평균 : %.2f\n",total/15.0);
	
	}
	public static void prac1() {
//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		System.out.println("모든 경우의 수 : ");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((i+j)==6) {
					System.out.print(i+" , "+j);
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("1---------------------");
	}
	public static void prac2() {
//		2.
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용
//
		Random random = new Random();
		//1 ~ 6 (int)(Math.random()*6)+1;
		//	(int)(Math.random() * 숫자의 갯수)+시작숫자
		int[] lotto = new int[6];
		int[] chk = new int [6];
		int chki = 0;
		boolean chktrue = false;
		int temp;
		for(int i=0;i<lotto.length;i++) {
			chktrue = false;
			temp = (int)(Math.random()*45) + 1;
			if(chki>0) {
				for(int j=0;j<chki;j++) {
					if(chk[j]==temp) {
						chktrue = true;
					}
				}
				if(chktrue==true) {
					i--;
					continue;		//continue를 하면 다음 번호로 넘어가고 위로 감
				}
			}
			lotto[i] = temp;
			chk[chki++] = temp;
		}
		System.out.print("로또번호: ");
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		System.out.println("2---------------------");
	}
	public static void prac4() {
//		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
//
//		ex)
//		int[][] arr =
//		{
//		{10, 20, 30},
//		{20, 30, 40},
//		{30, 40, 50}
//		};
//		이 주어지는 경우 최종 결과는
//		10 20 30 60
//		20 30 40 90
//		30 40 50 120
//		60 90 120 270
		int[][] arr =
				{
				{10, 20, 30},
				{20, 30, 40},
				{30, 40, 50}
				};
		int[][] resarr = new int[4][4];
		int totalsum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				resarr[i][j] = arr[i][j];
				totalsum+=arr[i][j];
			}
		}
		int rowsum=0,colsum=0;
		for(int i=0;i<arr.length;i++) {
			rowsum=0;
			for(int j=0;j<arr[i].length;j++) {
				rowsum+=arr[i][j];
			}
			resarr[i][resarr[i].length-1] = rowsum;
		}
		for(int i=0;i<3;i++) {
			colsum=0;
			for(int j=0;j<arr.length;j++) {
				colsum+=arr[j][i];
			}
			resarr[resarr.length-1][i] = colsum;
		}
		resarr[resarr.length-1][3] = totalsum;
		System.out.println("합계 배열:");
		for(int i=0;i<resarr.length;i++) {
			for(int j=0;j<resarr[i].length;j++) {
				System.out.print(resarr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("4---------------------");
	}

}
