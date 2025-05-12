package study.practice.Practice43;

import java.util.ArrayList;
import java.util.List;

public class FoodTruck {
	List<Food>menuList;
	int profit;
	int sales;
	int discard;
	FoodTruck(){
		menuList = new ArrayList<Food>();	//리스트를 생성
		menuList.add(new Food("김밥",1000,0));
		profit=0;
		sales=0;
		discard=0;
	}
	public void Order(String name,int count) {
		boolean chk = false;
		for(int i=0;i<menuList.size();i++) {
			if(menuList.get(i).name.equals(name)&&menuList.get(i).stock>=count) {
				chk = true;
				menuList.get(i).stock-=count;
				profit+=menuList.get(i).price*count;
				sales+=menuList.get(i).price*count;
			}
		}
		if(chk==false) {
			System.out.println("주문불가");
		}
	}
	public void setMenuStock(String name,int upstock) {
		boolean chk = false;
		//System.out.println(menuList.size());
		//System.out.println(menuList.get(0).name.equals(name));
		for(int i=0;i<menuList.size();i++) {
			if(menuList.get(i).name.equals(name)&&upstock>0) {
				chk = true;
				int setMenuStock = menuList.get(i).stock+upstock;
				menuList.get(i).setStock(setMenuStock);
			}
		}
		if(chk==false) {
			System.out.println("재고추가불가");
		}
	}
	public void prMenu(String name) {
		boolean chk = false;
		for(int i=0;i<menuList.size();i++) {
			if(menuList.get(i).name.equals(name)) {
				chk = true;
				menuList.get(i).pr();
			}
		}
		if(chk==false) {
			System.out.println("해당 메뉴 없음");
		}
	}
	public void exit() {
		for(int i=0;i<menuList.size();i++) {
			if(menuList.get(i).stock>0) {
				profit-=(menuList.get(i).price*0.3)*menuList.get(i).stock;
				discard+=(menuList.get(i).price*0.3)*menuList.get(i).stock;
			}
		}
		System.out.printf("매출 %d원 - 폐기손해%d원 최종수익 %d원\n",sales,discard,profit);
	}
}
