package study.practice.Practice43;

import java.util.Scanner;

public class FoodTruckMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FoodTruck ft = new FoodTruck();
		String selMenu;
		while(true) {
			System.out.println("1.메뉴보기");
			System.out.println("2.주문하기");
			System.out.println("3.재고관리(메뉴 재고 추가)");
			System.out.println("4.마감하기");
			System.out.print("선택>>");
			int sel = scanner.nextInt();
			switch(sel) {
			case 1:
				System.out.print("메뉴입력:");
				scanner.nextLine();
				selMenu = scanner.nextLine();
				ft.prMenu(selMenu);
				break;
			case 2:
				System.out.print("메뉴입력:");
				scanner.nextLine();
				selMenu = scanner.nextLine();
				System.out.print("주문수량 입력:");
				int count = scanner.nextInt();
				ft.Order(selMenu, count);
				break;
			case 3:
				System.out.print("메뉴입력:");
				scanner.nextLine();					//버퍼 비우기 위해 필요
				selMenu = scanner.nextLine();		//nextLine()하면 김밥\n이 되는지?
				System.out.print("재고추가수량 입력:");
				int upStock = scanner.nextInt();
				ft.setMenuStock(selMenu, upStock);
				break;
			case 4:
				ft.exit();
				break;
			default:
				System.out.println("잘못 입력!!");
				break;
			}
			if(sel==4)break;
		}
	}

}
