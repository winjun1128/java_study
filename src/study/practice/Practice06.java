package study.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		//1번답
//		System.out.print("밑변을 입력하세요:");
//		int width=scanner.nextInt();
//		System.out.print("높이를 입력하세요:");
//		int height=scanner.nextInt();
//		double area = width * height / 2;
//		System.out.println("삼각형 넓이는 :"+area);
		//Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형 밑변 입력하세요 : ");
		int base3 = scanner.nextInt();//킽변
		System.out.println("삼각형 높이 입력하세요 : ");
		int height3 = scanner.nextInt();//높이
		//정수 변수들 연산으로 실수로 저장하고자 할때 요소를 실수화해서 넣기
		double area3 = base3 * height3 / 2.0;
		System.out.printf("삼각형의 넓이는 %.2f 입니다.\n",area3);
		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		//2번답
//		System.out.print("밑변을 입력하세요:");
//		int width2=scanner.nextInt();
//		System.out.print("높이를 입력하세요:");
//		int height2=scanner.nextInt();
//		double area2 = (width2+height2)*height2/2.0;
//		System.out.println("사다리꼴 넓이는 :"+area2);
		//Scanner scanner = new Scanner(System.in);
		System.out.print("사다리꼴 윗변 입력하세요 : ");
		int top = scanner.nextInt();
		
		System.out.print("사다리꼴 밑변 입력하세요 : ");
		int base = scanner.nextInt();
		
		System.out.println("시다리꼴 높이 입력하세요 : ");
		int height = scanner.nextInt();
		
		double area = (top+base) * height /2.0;
		System.out.printf("사다리꼴의 넓이는 %.2f 입니다.\n",area);
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		//3번답
		System.out.println("인당 갯수:"+100/24+" 나머지 갯수:"+100%24);

		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		//4번답
//		System.out.print("세자리 정수 입력:");
//		int num=scanner.nextInt();
//		System.out.println("백의자리 :"+num/100);
//		System.out.println("십의자리 :"+(num-(num/100)*100)/10);
//		int temp =(num-(num/100)*100)/10;
//		System.out.println("일의자리 :"+(num-num/100*100-temp*10));
		//Scanner scanner = new Scanner(System.in);
		System.out.println("세자리의 정수를 입력 : ");
		int num = scanner.nextInt();
		
		System.out.println("백의자리 : "+(num/100));
		System.out.println("십의자리 : "+(num/10%10));
		System.out.println("일의자리 : "+(num%10));
		
		/*
		 158 / 100 = 1
		 158 / 10 = 15 % 10 = 5
		 
		 158 % 100 = 58 / 10 = 5
		 158 % 10 = 8
		 */
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		//x와 y를 바꾼 작업
		//
		//
		//5번답
		int t;
		t = x;
		x = y;
		y = t;
		System.out.println("x="+x+ " y="+y);
	}

}
