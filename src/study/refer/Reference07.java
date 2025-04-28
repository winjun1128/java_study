package study.refer;

import java.util.Scanner;

public class Reference07 {

	public static void main(String[] args) {
		String day1 = "MONDAY";
		String day2 = "FRIDAY";
		
		String today = "";	//사용자가 입력한 값
							//Friday
							//FRODAY
		
		if(today.equals(day1)){
			System.out.println("출근");
		}
		if(today.equals(day2)) {
			System.out.println("퇴근");
		}
		//boolean true false "medium"XX
		//붕어빵 토핑 : ppat, sucream, kimchi, pizza
		String topping = "ppaet";
		Week day3 = Week.MON;
		Week day4 = Week.FRI;
		
		if(day4==Week.FRI) {
			System.out.println("금요일이구나~");
		}
//		if(Week.FRI.equals("FRI")) {							//열거형은 문자열이 아님
//			System.out.println("금요일이구나~");
//		}
		Topping tp1 = Topping.SUCREAM;
		
		//String str = Week.FRI;									//열거형을 문자열로 넣기 바로 불가
		String str = Week.FRI.toString();							//toString()으로
		System.out.println(str);
		
		//열거형의 용도는?->값이 정해져있을때 입력 실수하지 않기 위해
	}

}
