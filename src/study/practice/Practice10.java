package study.practice;

public class Practice10 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//1)
//		for(int i=0;i<11;i++) {
//			System.out.println(i);
//		}
//		System.out.println("1============");
//		//2)
//		for(int i=1;i<10;i++) {
//			System.out.println(i);
//		}
//		System.out.println("2============");
//		//3)
//		for(int i=10;i<=100;i+=10) {
//			System.out.println(i);
//		}
//		System.out.println("3============");
//		//4)
//		for(int i=25;i<=100;i+=25) {
//			System.out.println(i);
//		}
//		System.out.println("4============");
//		//5)
//		int i = 50;
//		while(i<56) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("5============");
//		//6)
//		i = 10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
//		System.out.println("6============");
//		//7)
//		i = 30;
//		while(i>=0) {
//			System.out.println(i);
//			i-=5;
//		}
//		System.out.println("7============");
//		//8)
//		i=30;
//		while(i>=5) {
//			System.out.println(i);
//			i-=5;
//		}
//		System.out.println("8============");
//		//9)
//		i=25;
//		while(i>=0) {
//			System.out.println(i);
//			i-=5;
//		}
//		System.out.println("9============");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복

		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
		// 1) i가 0~10으로 11번 반복
		for(int i=0;i<11;i++) {	//i:0 1 2 ...
			System.out.print(i+" ");
		}
		System.out.println();
		// 2) i가 1~9로 9번 반복
		for(int i=1;i<=9;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		// 3) i가 10 ~ 100으로 10번 반복
		for(int i=10;i<=100;i+=10) {
			//i: 10 20 30 40 50 60 70 80 90 100
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 4) i가 25 50 75 100 해서 4번 반복
		for(int i=25; i<=100;i+=25) {
			System.out.print(i+" ");
		}
		System.out.println();
		// 5) i가 50 ~ 55로 6번 반복
		int i=50;
		while(i<=55) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		//6) i가 10 ~ 1로 10번 반복
		i = 10;
		while(i>=1) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
		
		i=10;
		while(true) {
			System.out.print(i+" ");
			i--;
			if(i<1)	//i==0 i<1	// 3 1 -1 -2 -3
				break;
		}
		//7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		i=30;
		while(i>=0) {
			System.out.print(i+" ");
			i=i-=5;
		}
		System.out.println();
		//8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		i=30;
		while(i>=5) {
			System.out.print(i+" ");
			i=i-5;
		}
		System.out.println();
		//9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		i=25;
		while(i>=0) {
			System.out.print(i+" ");
			i=i-5;
		}
		System.out.println();
	}

}
