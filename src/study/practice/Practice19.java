package study.practice;

public class Practice19 {

//	public static void main(String[] args) {
//		//2차원 배열과 인덱스 조정하기.
//		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
//		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
//		//아래와 같이 4*4 형태로 출력하시오.
//		prac1();
//		prac2();
//		prac3();
//		prac4();
//	}
//
//
//
//
//	public static void prac1() {
////		1.
////		1 2   3   4
////		5 6   7   8
////		9 10 11 12
////		13 14 15 16
///
//		int[][]ar = new int[4][4];
//		int count =1;
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				ar[i][j]=count++;
//			}
//		}
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				System.out.printf("%3d",ar[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("1---------------");
//	}
//	public static void prac2() {
////		2.
////		1 5  9  13
////		2 6 10 14
////		3 7 11 15
////		4 8 12 16
///	출력은 한줄을 채우고 다음 줄로 넘어감
//		int[][]ar2 = new int[4][4];
//		int count2 =1;
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				ar2[j][i]=count2++;
//			}
//		}
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				System.out.printf("%3d",ar2[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("2---------------");
//	}
//	public static void prac3() {
////		3.
////		16 15 14 13
////		12 11 10 9
////		8   7   6  5
////		4   3   2  1
//		int[][]ar3 = new int[4][4];
//		int count3 =1;
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				ar3[4-i-1][4-j-1]=count3++;
//			}
//		}
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				System.out.printf("%3d",ar3[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("3---------------");
//	}
//	public static void prac4() {
////		4.
////		16 12 8 4
////		15 11 7 3
////		14 10 6 2
////		13 9  5  1
//		int[][]ar4 = new int[4][4];
//		int count4 =1;
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				ar4[4-j-1][4-i-1]=count4++;
//			}
//		}
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				System.out.printf("%3d",ar4[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("4---------------");
//	}
	public static void main(String[] args) {
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.
		int[][] arr = new int[4][4];
		
		int num=1;
//		1.
//		1 2   3   4
//		5 6   7   8
//		9 10 11 12
//		13 14 15 16
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//arr[i][j]=num++;
				//num++;
				arr[i][j] = (4*i)+(j+1);
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
//		2.
//		1 5  9  13			
//		2 6 10 14
//		3 7 11 15
//		4 8 12 16
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=0;
			}
		}
		System.out.println();
		num=1;
		for(int i=0;i<arr.length;i++) {				//i:0
			for(int j=0;j<arr[i].length;j++) {		//j:0 1 2 3
				arr[j][i]=num++;
				System.out.printf("%3d",arr[j][i]);
			}
			System.out.println();
		}
		System.out.println();
//		정답처럼 안나오는 이유:줄바꿈을 하지 않아서 다음값이 현재줄에 나타냄
		
//		for(int i=0;i<arr.length;i++) {				//i:0
//			for(int j=0;j<arr[i].length;j++) {		//j:0 1 2 3
//				arr[i][j]=(i+1)+(j*4);
//			}
//		}
//		for(int j=0;j<arr.length;j++) {				//j:0
//			for(int i=0;i<arr[j].length;i++) {		//i:0 1 2 3
//				arr[i][j] = num++;
//			}
//		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
//		3.
//		16 15 14 13			16-(i*4)-j
//		12 11 10 9
//		8   7   6  5
//		4   3   2  1
		System.out.println();
//		num=16;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=num--;
//			}
//		}
		num=1;
		for(int i=3;i>=0;i--) {
			for(int j=3;j>=0;j--) {
				arr[i][j]=num++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
//		4.
//		16 12 8 4			(16-i)-(j*4)
//		15 11 7 3
//		14 10 6 2
//		13 9  5  1
		System.out.println();
		num=1;
		for(int i=3;i>=0;i--) {
			for(int j=3;j>=0;j--) {
				arr[j][i]=num++;
			}
		}
		//	(16-i)-(4*j)
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
