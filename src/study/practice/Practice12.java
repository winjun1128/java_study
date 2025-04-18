package study.practice;

public class Practice12 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		////1.
//		//1)
//		for(int i=1;i<=5;i++) {
//			System.out.print(i+"");
//		}
//		System.out.println();
//		
//		for(int i=1;i<=5;i++) {
//			System.out.print(i+"");
//		}
//		System.out.println();
//		
//		for(int i=1;i<=5;i++) {
//			System.out.print(i+"");
//		}
//		System.out.println();
//		
//		for(int i=1;i<=5;i++) {
//			System.out.print(i+"");
//		}
//		System.out.println();
//		
//		for(int i=1;i<=5;i++) {
//			System.out.print(i+"");
//		}
//		System.out.println();
//		System.out.println("1)============");
//		//2)
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(j+"");
//			}
//			System.out.println();
//		}
//		System.out.println("2)============");
//		////2.
//		//1)
//		int i=1;
//		int count=0;
//		while(count<5) {
//			System.out.print(i+"");
//			count++;
//		}
//		System.out.println();
//		
//		i=2;
//		count=0;
//		while(count<5) {
//			System.out.print(i+"");
//			count++;
//		}
//		System.out.println();
//		
//		i=3;
//		count=0;
//		while(count<5) {
//			System.out.print(i+"");
//			count++;
//		}
//		System.out.println();
//		
//		i=4;
//		count=0;
//		while(count<5) {
//			System.out.print(i+"");
//			count++;
//		}
//		System.out.println();
//		
//		i=5;
//		count=0;
//		while(count<5) {
//			System.out.print(i+"");
//			count++;
//		}
//		System.out.println();
//		
//		System.out.println("1)============");
//		//2)
//		i=1;
//		while(i<=5) {
//			int j=1;
//			while(j<=5) {
//				System.out.print(i+"");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		System.out.println("2)============");
//	}
	public static void main(String[] args) {
//		※규칙을 찾아보고 작성
//		1) 반복문 1개로 결과 만들기
//		2)반복문 2개 중첩해서 결과만들기
//
//		//아래와 같은 결과가 출력되도록 코드를 작성하시오
//		//1.
//		12345
//		12345
//		12345
//		12345
//		12345
//
//		//2.
//		11111
//		22222
//		33333
//		44444
//		55555
		for(int i=1; i<=5;i++) {		//5회반복
			System.out.println("12345");
		}
		for(int i=1; i<=5;i++) {		//5회반복
			System.out.print(""+i+i+i+i+i);
		}
		for(int i=1;i<=5;i++) {			//5회반복
			System.out.println(11111*i);
		}
		for(int i=11111;i<=55555;i=i+11111) {	//5회반복
			System.out.println(i);
		}	
		
		//1.2)
		for(int i=1;i<=5;i++) {	//5회 반복	(5줄 행)
			for(int j=1;j<=5;j++) {	// j가 출력에 참여
				System.out.print(j);	
			}
			System.out.println();
		}
		/*
		 	i: 1
		 	j: 1 2 3 4 5
		 	
		 	i: 2
		 	j: 1 2 3 4 5
		 	
		 	i: 3
		 	j: 1 2 3 4 5
		 	
		 	i: 4
		 	j: 1 2 3 4 5
		 	
		 	i: 5
		 	j: 1 2 3 4 5
		 */
		//2.2)
		for(int i=1;i<=5;i++) {	//i가 출력에 참여
			for(int j=1;j<=5;j++) {		//5회 반복
				System.out.print(i);
			}
			System.out.println();
		}
		/*
	 	i: 1 1 1 1 1
	 	j: 1 2 3 4 5
	 	
	 	i: 2 2 2 2 2
	 	j: 1 2 3 4 5
	 	
	 	i: 3 3 3 3 3
	 	j: 1 2 3 4 5
	 	
	 	i: 4 4 4 4 4
	 	j: 1 2 3 4 5
	 	
	 	i: 5 5 5 5 5
	 	j: 1 2 3 4 5
	 */
	}
}
