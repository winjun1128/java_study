package study.practice;

import java.util.Scanner;

public class Practice20 {
//	nextLine->다음 엔터까지 문자열 한줄
//	nextInt->다음 정수
//	nextLine->다음 엔터까지 문자열 한줄
//	public static void main(String[] args) {
//		int ordermoney = 0;
//		int[] pricelist = new int[3];
//		pricelist[0] = 3500;
//		pricelist[1] = 4100;
//		pricelist[2] = 4300;
//		int[] countar = new int[3];
//		String[] menunames = {"아메리카노","카페라떼","바닐라라떼"};
//		int[] menuprices = new int[3];
//		ordermoney = 0;
//		
//		while(true) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("======== 메뉴 ========");
//			System.out.printf("1.아메리카노\t\t3500원\n");
//			System.out.printf("2.카페라떼\t\t\t4100원\n");
//			System.out.printf("3.바닐라라떼\t\t4300원\n");
//			System.out.println("====================");
//			System.out.print("메뉴 선택 : ");
//			int m = scanner.nextInt();
//			if(!(m>=1&&m<=3)) {
//				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
//				continue;
//			}
//			System.out.print("수량 선택 : ");
//			int c = scanner.nextInt();
//			System.out.print("추가 주문하시겠습니까?(y/n) : ");
//			scanner.nextLine();	//기존에 남아있는 \n 엔터 청소용 \n	(숫자 다음 문자 입력할때 문제상황)
//			String addorder = scanner.nextLine();
//			if(addorder.equals("y")==false&&addorder.equals("n")==false) {
//				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//				continue;
//			}
//			ordermoney+=pricelist[m-1]*c;
//			countar[m-1]+=c;
//			if(addorder.equals("n")) {
//				System.out.println("====================");
//				for(int i=0;i<3;i++) {
//					if(countar[i]!=0) {
//						menuprices[i] = pricelist[i]*countar[i];
//						System.out.println(menunames[i]+" "+countar[i]+"잔 : "+menuprices[i]+"원");
//					}
//				}
//				System.out.println("====================");
//				System.out.println("총액 : "+ordermoney+"원");
//				break;
//			}
//		}
//	}
	public static void main(String[] args) {
		//prac1();
		prac2();
	}
	public static void prac1() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("문자 입력 : ");
//		String s1 = scanner.nextLine();
//		
//		System.out.print("숫자 입력 : ");	//123
//		int i1 = scanner.nextInt();
//		
//		scanner.nextLine();			//기존에 남아있는 \n 엔터 청소용
//		
//		System.out.print("문자 입력 : ");
//		String s2 = scanner.nextLine();
		Scanner scanner = new Scanner(System.in);
//		String addOrder = "y";
//		
//		while(!addOrder.equals("n")) {
//			
//		}
		
		int menu1Count = 0;		//각 메뉴 몇잔 시켰는는지 갯수
		int menu2Count = 0;
		int menu3Count = 0;
		while(true) {
			System.out.println("========메뉴========");
//			System.out.println("1. 아메리카노 3500원");
//			System.out.println("2. 카페라떼 4100원");
//			System.out.println("3. 바닐라라떼 4300원");
			System.out.printf("1. %-8s %5d원\n","아메리카노",3500);
			System.out.printf("2. %-8s %5d원\n","카페라떼",4100);
			System.out.printf("3. %-8s %5d원\n","바닐라라떼",4300);
			System.out.println("====================");
			//메뉴 입력
			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();
			// menu < 1 || menu > 3		잘못된 범위면~?
			if(!(menu>=1&&menu<=3)) {	//정상범위가 아니면!
				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
				continue; 	//이 코드 이후로 현재턴 실행 생략 -> 다음 턴
			}
			//수량 입력
			System.out.print("수량 선택 : ");
			int count = scanner.nextInt();
			
			//기록!! 무슨 메뉴를 몇잔 시켰냐?
			//무슨메뉴? -> menu
			//몇잔? -> count
			
			if(menu==1)
				menu1Count += count;
			else if(menu==2)
				menu2Count += count;
			else
				menu3Count += count;
			scanner.nextLine(); // clear
			
			String addOrder;
			while(true) {
				System.out.print("추가주문 하시겠습니까? (y/n) : ");
				addOrder = scanner.nextLine();
				
				//y/n 정상ㅇ입력 여부 체크
				if(!(addOrder.equals("y")||addOrder.equals("n"))) {
					System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
				}
				else {	//정상입력!! y n
					break;
				}
			}
		
			if(addOrder.equals("n")) {
				//최종 주문한 메뉴 목록 보여주고
				//총금액이 얼마다~
				int total = 0;
				System.out.println("==============================");
				if(menu1Count>0) {
					System.out.printf("아메리카노 %d잔 : %d원\n",menu1Count,menu1Count * 3500);
					total = total + menu1Count * 3500;
				}
				if(menu2Count>0) {
					System.out.printf("카페라떼 %d잔 : %d원\n",menu2Count,menu2Count * 4100);
					total = total + menu2Count * 4100;
				}
				if(menu3Count>0) {
					System.out.printf("바닐라라떼 %d잔 : %d원\n",menu3Count,menu3Count * 4300);
					total = total + menu3Count * 4300;
				}
				System.out.println("==============================");
				//System.out.printf("총액 : %d원\n",menu1Count*3500+menu2Count*4100+menu3Count*4300);
				System.out.printf("총액 : %d원\n",total);
				break;
			}
			
//			//정상 메뉴 선택 여부! 1,2,3
//			if(menu>=1&&menu<=3) {
//				//수량 입력
//				System.out.print("수량 선택 : ");
//				int count = scanner.nextInt();
//				
//				scanner.nextLine(); // clear
//				
//				System.out.print("추가주문 하시겠습니까? (y/n) : ");
//				String addOrder = scanner.nextLine();
//				if(addOrder.equals("n")) {
//					
//					break;
//				}
//			}
//			else {
//				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
//			}
			
		}
		
		
		//End
	}
//	public static void prac2() {
//		Scanner scanner = new Scanner(System.in);
//		String[] menuArr = {"아메리카노","카페라떼","바닐라라떼"};
//		int[] priceArr = {3500,4100,4300};
//		int[] countArr = new int[3];	//0 초기화
//		
//		//menuArr[2] priceArr[2] countArr[2]
//		while(true) {
//			System.out.println("========메뉴========");
//			System.out.printf("1. %-8s %5d원\n","아메리카노",3500);
//			System.out.printf("2. %-8s %5d원\n","카페라떼",4100);
//			System.out.printf("3. %-8s %5d원\n","바닐라라떼",4300);
//			System.out.println("====================");
//			System.out.print("메뉴 선택 : ");
//			int menu = scanner.nextInt();
//			if(!(menu>=1&&menu<=3)) {
//				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!");
//				continue;
//			}
//			System.out.print("수량 선택 : ");
//			int count = scanner.nextInt();
//			
//			scanner.nextLine();
//			String addOrder;
//			while(true) {
//				System.out.print("추가주문 하시겠습니까? (y/n) : ");
//				addOrder = scanner.nextLine();
//				if(addOrder.equals("y")||addOrder.equals("n")) {
//					break;
//				}
//				else {
//					System.out.println("잘못입력하셨습니다. 다시 입력하세요!!");
//				}
//			}
//			countArr[menu-1]+=count;
//			if(addOrder.equals("n")) {
//				int total = 0;
//				System.out.println("====================");
//				for(int i=0;i<countArr.length;i++) {
//					if(countArr[i]!=0) {
//						System.out.println(menuArr[i]+" "+countArr[i]+"잔 : "+(countArr[i]*priceArr[i])+"원");
//						total+=countArr[i]*priceArr[i];
//					}
//				}
//				System.out.println("====================");
//				System.out.println("총액 : "+total+"원");
//				break;
//			}
//		}
//	}
	public static void prac2() {
		//리팩토링
		Scanner scanner = new Scanner(System.in);
		String[] menuArr = {"아메리카노","카페라떼","바닐라라떼"};
		int[] priceArr = {3500,4100,4300};
		int[] countArr = new int[3];	//0 초기화
		
		//menuArr[2] priceArr[2] countArr[2]
		while(true) {
			System.out.println("========메뉴========");
			for(int i=0;i<menuArr.length;i++) {
				//i: 0 1 2
				//No: 1 2 3
				System.out.printf("%d.%-8s %5d원\n",i+1,menuArr[i],priceArr[i]);
			}
			System.out.println("====================");
			//메뉴 입력
			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();
			if(!(menu>=1&&menu<=menuArr.length)) {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!");
				continue;
			}
			//수량 입력
			System.out.print("수량 선택 : ");
			int count = scanner.nextInt();
			//기록!! 무슨 메뉴를 몇잔 시켰냐?
			//무슨 메뉴? -> menu 1 2 3 -> menuArr[0 1 2]
			//				배열에 접근하는 index : menu - 1
			//몇잔? -> count
			//	countArr 접근하는 index : menu -1
			
			countArr[menu-1] += count;	//모든 메뉴에대해 수량 처리하는 코드가 공통 적용
			scanner.nextLine();
			String addOrder;
			while(true) {
				System.out.print("추가주문 하시겠습니까? (y/n) : ");
				addOrder = scanner.nextLine();
				
				//y/n 정상ㅇ입력 여부 체크
				if(!(addOrder.equals("y")||addOrder.equals("n"))) {
					System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
				}
				else {	//정상입력!! y n
					break;
				}
			}
			if(addOrder.equals("n")) {
				int total = 0;
				System.out.println("====================");
				for(int i=0;i<menuArr.length;i++) {
					if(countArr[i]>0) {
						System.out.printf("%-8s %d잔 : %d원\n",menuArr[i],countArr[i],countArr[i]*priceArr[i]);
						total+=countArr[i]*priceArr[i];
					}
				}
				System.out.println("====================");
				System.out.println("총액 : "+total+"원");
				break;
			}
		}
	}

}
