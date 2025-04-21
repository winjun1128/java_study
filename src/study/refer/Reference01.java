package study.refer;

import java.util.Scanner;

public class Reference01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조변수
		
		Scanner scanner = new Scanner(System.in);
		
		//참조타입일때 문자 리터럴값이 같으면 같은 공간을 가리킴(자바에서 string 변수 일때만 매우 특수한 케이스)
		//배열은 참조타입이지만 문자 리터럴값이 아니면 서로 다른 공간
		String str1 = "아침";
		String str2 = "아침";
		//스캐너객체를 동적할당해서 새로운 공간을 가리킴
		String str3 = scanner.nextLine();
		
		//참조변수에서 == 비교는 값 비교가 아니라 참조하는 주소가 같은지 비교 하는 것
		System.out.println(str1==str2);		
		System.out.println(str2==str3);
		System.out.println(str3.equals(str2));
		
		//String 값을 비교할때는 equals 를 쓰자
		
//		String[] strar1= {"안녕","잘가"};	
//		String[] strar2= {"안녕","잘가"};
//		System.out.println(strar1==strar2);
//		//배열은 왜 안되지?->서로 다른 배열이므로
		
		//null
		int num;
		int sum=0;
		//num = num + 10;
		sum = sum + 10;
		
		//System.out.println(num);
		System.out.println(sum);
		
		String s1;
		String s2 = null;	//참조하는게 없다! = null
		String s3 = "글자";
		
		//System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		if(s2 != null)
			System.out.println(s2.equals("글자"));
	}

}
