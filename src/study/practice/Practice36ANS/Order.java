package study.practice.Practice36ANS;

import java.util.ArrayList;

class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	//Menu[] menus;
	ArrayList<Menu>menuList;
	// 생성자
	public Order(int i, ArrayList<Menu>menuList) {
		orderNum = i;
		this.menuList = menuList;
	}
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		int sum=0;
		for(int i=0;i<menuList.size();i++) {
			sum+=menuList.get(i).price;
		}
		return sum;
	}
}
