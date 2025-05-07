package study.practice.Practice36;

import java.util.ArrayList;

class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	//Menu[] menus;
	ArrayList<Menu>menuslist;
	// 생성자
	public Order(int i, ArrayList<Menu>arr) {
		orderNum = i;
		menuslist = arr;
	}
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		int sum=0;
		for(int i=0;i<menuslist.size();i++) {
			sum+=menuslist.get(i).price;
		}
		return sum;
	}
}
