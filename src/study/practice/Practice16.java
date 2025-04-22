package study.practice;

import java.util.Scanner;

public class Practice16 {

//	public static void main(String[] args) {
//		//1)
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("5. 종료");
//		System.out.print("메뉴 번호를 입력하세요 : ");
//		int sel = scanner.nextInt();
//		switch(sel) {
//		case 1:
//			System.out.println("입력 메뉴입니다.");
//			break;
//		case 2:
//			System.out.println("수정 메뉴입니다.");
//			break;
//		case 3:
//			System.out.println("조회 메뉴입니다.");
//			break;
//		case 4:
//			System.out.println("삭제 메뉴입니다.");
//			break;
//		case 5:
//			System.out.println("프로그램이 종료됩니다.");
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다");
//			break;
//		}
//		System.out.println("1--------------------");
//		//2)
//		//#퀴즈
//
//		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
//		//규칙 찾아보기.
//		int[][]numar = new int[5][5];
//		for(int i=0;i<numar.length;i++) {
//			for(int j=0;j<numar[i].length;j++) {
//				if(i<j)numar[i][j]=2;
//				else if(i==j)numar[i][j]=1;
//				else if(i>j)numar[i][j]=3;
//			}
//		}
//		for(int i=0;i<numar.length;i++) {
//			for(int j=0;j<numar[i].length;j++) {
//				System.out.print(numar[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("2--------------------");
//	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("5. 종료");
		
		String[] menuArr = {"입력","수정","조회","삭제","종료"};
		
		for(int i=0;i<menuArr.length;i++) {	//i: 0 1 2 3 4
			System.out.println((i+1)+". "+menuArr[i]);
			//	i:0		 		0+1.		menuArr[0]
			//					1. 입력
			//					2. 수정
		}
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = scanner.nextInt();
		
		if(menu>=1 && menu <=4) {
			System.out.println(menuArr[menu-1]+" 메뉴입니다.");
		}
		else if(menu ==5) {
			System.out.println("프로그램이 종료됩니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
//		if(menu==1)
//			System.out.println("입력 메뉴입니다.");
//		else if(menu==2)
//			System.out.println("수정 메뉴입니다.");
//		else if(menu == 3)
//			System.out.println("조회 메뉴입니다.");
//		else if(menu == 4)
//			System.out.println("삭제 메뉴입니다.");
//		else if(menu == 5)
//			System.out.println("프로그램이 종료됩니다.");
//		else
//			System.out.println("잘못입력하셨습니다.");
//		if(menu>=1&&menu<=5) {
//			if(menu==1)
//				System.out.println("입력 메뉴입니다.");
//			if(menu==2)
//				System.out.println("수정 메뉴입니다.");
//
//			if(menu==3)
//				System.out.println("조회 메뉴입니다.");
//
//			if(menu==4)
//				System.out.println("삭제 메뉴입니다.");
//
//			if(menu==5)
//				System.out.println("프로그램이 종료됩니다.");
//		}
//		else {
//			System.out.println("잘못입력하셨습니다.");
//		}
//		switch(menu) {
//		case 1:
//			System.out.println("입력 메뉴입니다.");
//			break;
//		case 2:
//			System.out.println("수정 메뉴입니다.");
//			break;
//		case 3:
//			System.out.println("조회 메뉴입니다.");
//			break;
//		case 4:
//			System.out.println("삭제 메뉴입니다.");
//			break;
//		case 5:
//			System.out.println("프로그램이 종료됩니다.");
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다");
//			break;
//		}
//		//2)
//		//#퀴즈
//
//		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
//		//규칙 찾아보기.
		/*
		 	1 2 2 2 2
		 	3 1 2 2 2
		 	3 3 1 2 2
		 	3 3 3 1 2
		 	3 3 3 3 1
		 */
		
		//int[][] arr = {{1,2,2,2,2},{3,1,2,2,2},{3,3,1,2,2},{3,3,3,1,2},{3,3,3,3,1}}
		int[][]arr =  new int[5][5]; //초기화 0
		//1 or 2 or 3
		//
		//				5
		for(int i=0;i<arr.length;i++) {			//i: 0 1 2 3 4
			for(int j=0;j<arr[i].length;j++) {	//j:0 1 2 3 4
				if(i>j) {
					arr[i][j]=3;
				}
				else if(i<j) {
					arr[i][j] = 2;
				}
				else {
					arr[i][j] = 1;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {			//i: 0 1 2 3 4
			for(int j=0;j<arr[i].length;j++) {	//j:0 1 2 3 4
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
