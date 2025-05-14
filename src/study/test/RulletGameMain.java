package study.test;

import java.util.Scanner;

public class RulletGameMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RulletGame rg = new RulletGame(10,"천안");
		while(true) {
			System.out.println("1.충전, 2.게임시작, 3.마감");
			System.out.print("입력>>");
			int sel = scanner.nextInt();
			switch(sel) {
			case 1:
				if(rg.lifeCount==0) {
					System.out.print("충전할 금액:");
					int fm = scanner.nextInt();
					rg.fillMoney(fm);
				}
				else System.out.println("충전된 횟수가 있으면 추가 충전 불가");
				break;
			case 2:
				rg.start();
				break;
			case 3:
				rg.exit();
				break;
			default:
				System.out.println("잘못 입력!!");
				break;
			}
			if(sel==3&&rg.lifeCount<=0) {
				System.out.println("마감!!!");
				break;
			}
		}
	}

}
