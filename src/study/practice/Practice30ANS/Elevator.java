package study.practice.Practice30ANS;

public class Elevator {

	public static void main(String[] args) {
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));

	}
	public static String guide(int floor) {
		/* 메소드를 완성하시오. */
		//엘리베이터 버튼 1 ~ 20
		
		//1~10 저층
		//11~20 고층
//		if(floor<=10)
//			return "저층";
//		else
//			return "고층";
		
//		if(floor <=10 && floor>=1) {
//			return "저층";
//		}
//		else if(floor<=20 && floor>=11) {
//			return "고층";
//		}
//		else {
//			return "확인 불가";
//		}
		if(floor>1||floor>20) {
			return "확인 불가";
		}
		if(floor<=10)
			return "저층";
		else
			return "고층";
		//return "?";
	}
}
