package study.practice;

import java.util.Scanner;

public class Practice07 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int old;
//		boolean chk = true;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("출생년도를 입력하세요 : ");
//		int birth_year = scanner.nextInt();
//		if(birth_year>2025) {
//			System.out.println("출생년도 잘못 입력!!");
//			return;
//		}
//		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
//		int sex_num = scanner.nextInt();
//		if(birth_year<2000) {
//			if(sex_num!=1&&sex_num!=2) {
//				chk = false;
//			}
//		}
//		else {
//			if(sex_num!=3&&sex_num!=4){
//				chk = false;
//			}
//		}
//		old = 2025-birth_year+1;
//		if(sex_num==1||sex_num==3) {
//			if(chk) {
//				System.out.println("결과 : "+old+"살 남자입니다.");
//			}
//			else {
//				System.out.println("뒷 자리 첫번쨰 숫자 잘못 입력!!");
//			}
//		}
//		else if(sex_num==2||sex_num==4) {
//			if(chk) {
//				System.out.println("결과 : "+old+"살 여자입니다.");
//			}
//			else {
//				System.out.println("뒷 자리 첫번쨰 숫자 잘못 입력!!");
//			}
//		}
//		else {
//			System.out.println("뒷 자리 첫번쨰 숫자 잘못 입력!!");
//		}
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		
		//비교 연산 ~ 로직 ~
		
		//	2000년생 26살
		//	2025 - 2000 = 25 + 1 = 26
		//	나이계산 기준년도(2025)	- 입력한년도(2000) + 1 =>	나이
		//		2026 - 입력한년도 => 나이
		
		//int age = 2026 - year;	//2025년도기준 나이계산
		int age = 2025 - year + 1;	//2025년도기준 한국나이계산(+1)
		
		//년도 + 뒷자리가 잘못된 케이스는 구별하지 못하는 상태
//		if(number == 1) {
//			System.out.println(age+"살 남자");
//		}
//		else if(number==2) {
//			System.out.println(age+"살 여자");
//		}
//		else if(number==3) {
//			System.out.println(age+"살 남자");
//		}
//		else if(number == 4) {							//1 2 3 4 전제조건 확정!	-> else
//			System.out.println(age+"살 여자");
//		}
//		else {
//			System.out.println("잘못된 입력");
//		}
		//결과 출력
		if(number == 1 && year < 2000) {
			System.out.println(age+"살 남자");
		}
		else if(number==2 && year < 2000) {
			System.out.println(age+"살 여자");
		}
		else if(number==3 && year >= 2000) {
			System.out.println(age+"살 남자");
		}
		else if(number == 4 && year >= 2000) {							//1 2 3 4 전제조건 확정!	-> else
			System.out.println(age+"살 여자");
		}
		else {
			System.out.println("잘못된 입력");
		}
		
		if((number==1&&year<2000) || (number==2&&year<2000)
				|| (number==3&&year>=2000) || (number==4&&year>=2000)) {
			
		}
		else {
			System.out.println("잘못된 입력");
		}
		
		if(((number==1||number==2)&&year<2000) || ((number==3||number==4)&&year>=2000)) {
			//입력은 정상이다! 확정!
			if(number==1||number==3) {
				System.out.println(age + "살 남자");
			}
			if(number==2||number==4) {
				System.out.println(age + "살 여자");
			}
			
			//number 1 2 3 4
			if(number==1||number==3) {
				System.out.println(age + "살 남자");
			}
			else {	//2 4
				System.out.println(age + "살 여자");
			}
		}
		else {
			System.out.println("잘못된 입력");
		}
	}

}
