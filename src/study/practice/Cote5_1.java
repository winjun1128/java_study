package study.practice;

public class Cote5_1 {

	public static void main(String[] args) {
		 	int price = 123456;

	        int method1 = price - (int)(price * 0.2);             // 할인액 먼저 버림
	        int method2 = (int)(price - (price * 0.2));           // 전체 결과를 나중에 버림

	        System.out.println("Method 1: " + method1); // 98765
	        System.out.println("Method 2: " + method2); // 98764
	}

}
