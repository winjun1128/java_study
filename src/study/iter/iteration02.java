package study.iter;

public class iteration02 {

	public static void main(String[] args) {
		// 반복문 while
		
		/*
		 	while(조건식){
		 		실행문
		 	}
		 */
		//i: 1 2 3 4 5
		for(int i=1;i<=5;i++) {
			System.out.println("피곤하다~");
		}
		int i=1;		//초기화
		while(i<=5) {	//조건식
			//i: 1 2 3 4 5
			System.out.println("졸리다~"); //실행문
			
			i++;	//증감식
			
			//i=i*2;
			//i=i-50;
		}
		System.out.println("==========");
		
		//i:6
		
		//1~5 출력
		i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		i=0;
		while(i<5) {	// 5<5
			i++;		//i:1 2 3 4 5
			System.out.println(i);
		}
		
		//i:5
		i=6;
		while(i<5) {
			System.out.println("i<5");
		}
		do {
			System.out.println("do while i<5");
		}while(i<5);	//do while은 while 뒤에 ; 필요함
	}

}
