package study.practice;

import java.util.Scanner;

public class Practice20prac {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] menuName = {"아메리카노","카페라떼","바닐라라떼"};
		int[] priceMenu = {3500,4100,4300};
		int[] countMenu = new int [3];
		int totalmoney = 0;
		while(true) {
			System.out.println("======== 메뉴 ========");
			for(int i=0;i<3;i++) {
				System.out.printf("%d. %s\t%d원\n",i+1,menuName[i],priceMenu[i]);
			}
			System.out.println("=========================");
			System.out.print("메뉴 선택 : ");
			int selmenu = scanner.nextInt();
			if(!(selmenu>=1&&selmenu<=menuName.length)) {
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}
			System.out.print("수량 선택 : ");
			int selcount = scanner.nextInt();
			scanner.nextLine();	//버퍼비우기
			String addorder;
			while(true) {
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				addorder = scanner.nextLine();
				if(addorder.equals("y")==true||addorder.equals("n")==true){
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
			countMenu[selmenu-1]+=selcount;
			if(addorder.equals("n")) {
				System.out.println("=========================");
				for(int i=0;i<countMenu.length;i++) {
					if(countMenu[i]!=0) {
						System.out.println(menuName[i]+" "+countMenu[i]+"잔 : "+(priceMenu[i]*countMenu[i])+"원");
						totalmoney+=(priceMenu[i]*countMenu[i]);
					}
				}
				System.out.println("=========================");
				System.out.println("총액 : "+totalmoney+"원");
				break;
			}
		}
	}

}
