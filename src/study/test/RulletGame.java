package study.test;

import java.util.Random;

public class RulletGame {
	int id;
	String storeName;
	int totalPoint;
	int successCount;
	int failCount;
	int lifeCount;
	int gainMoney;
	RulletGame(int id,String storeName){
		this.id = id;
		this.storeName=storeName;
		totalPoint=0;
		successCount=0;
		failCount=0;
		lifeCount=0;
		gainMoney=0;
	}
	public void fillMoney(int money) {
		if(money<1000||money%1000!=0) {
			System.out.println("금액은 1000단위로 입력 가능");
			return;
		}
		lifeCount+=money/500;
		gainMoney+=money;
	}
	public void start() {
		boolean chk = false;
		while(true){
			if(lifeCount>0) {
				chk=true;
				Random random = new Random();
				int rn = random.nextInt(6)+1;
				if(rn<5) {
					successCount++;
					totalPoint+=rn;
					lifeCount--;
					System.out.printf("결과:%s, 점수:%d 잔여횟수:%d\n","성공",rn,lifeCount);
				}
				else{
					failCount++;
					lifeCount--;
					System.out.printf("결과:%s, 점수:%d 잔여횟수:%d\n","실패",rn,lifeCount);
				}
			}
			else{
				if(chk==true)System.out.printf("성공 횟수:%d, 실패 횟수:%d, 총합 점수:%d\n",successCount,failCount,totalPoint);
				else System.out.println("충전된 횟수가 없으면 게임시작 불가");
				break;
			}
		}
		this.id = 0;
		this.storeName=null;
		totalPoint=0;
		successCount=0;
		failCount=0;
		lifeCount=0;
	}
	public void exit() {
		if(lifeCount>0) {
			System.out.println("충전된 횟수가 있으면 마감 불가");
			return;
		}
		System.out.printf("매출액:%d원\n",gainMoney);
	}
}
