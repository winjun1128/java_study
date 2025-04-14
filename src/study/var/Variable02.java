package study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2, 8, 10, 16 진수 -> 정수형
		int num2 = 0b1010;//2진수 : 10
		int num8 = 012;	  //8진수 : 10
		int num10 = 10;	  //10진수 : 10
		int num16 = 0x30; //16진수: 48
		
		//주의사항 : 전화번호 앞자리
		//int num = 010; 전화번호 010이 아니라 8진수 10으로 인식
		//문자형태 "010"
		
		char ch1 = 123; //정수형 변수 char
		char ch2 = 'B'; //문자 한개 '작은따음표'
		//char ch3 = 'AB'; //두개 사용 불가
		//char ch3 = "A"; //문자 한개 '작은따음표' "큰 따음표 사용 불가"
		
		System.out.println(ch1);			//유니코드표 123이 나타내는 문자 {
		System.out.println(ch2);
		
		String str1= "AB";
		String str2= "C"; //'C'작은따음표 문자하나는 -> char 타입에 사용
		
		String str3 = "한글문자열";
		String str4 = "01012345678";
		String str5 = "010-1234-5678";
		
		System.out.println(str1);
		System.out.println(str3+str5);
		
		String menu = "나는 \"햄버거\"를 좋아한다.";	//나는 "햄버거"를 좋아한다.
		System.out.println(menu);
		
		System.out.println("Hello\tworld!\nWelcome");
	}

}
