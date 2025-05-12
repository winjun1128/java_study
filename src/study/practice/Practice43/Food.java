package study.practice.Practice43;

public class Food {
 String name;
 int price;
 int stock;
 	Food(String name,int price,int stock){
 		this.name = name;
 		this.price = price;
 		this.stock = stock;
 	}
 	public void setStock(int stock) {
 		this.stock = stock;
 	}
 	public void pr() {
 		System.out.printf("주문 메뉴:%s, 주문 메뉴 가격:%d원, 주문가능한 재고:%d\n",name,price,stock);
 	}
}
