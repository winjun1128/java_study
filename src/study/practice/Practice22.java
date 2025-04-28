package study.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
		//prac1();
		//level1();
		level2();
	}
	public static void prac1() {
//		엘리베이터
//
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )
//
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)
//
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
//		1층에 5명 탔고 1층에서 동시에 5 10 15 25 11
		int floor = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("탑승인원을 입력하세요 : ");
		int peopleCount = scanner.nextInt();
		int[] peoplefloors = new int[peopleCount];
		System.out.print("사람들이 내릴 층을 각각 입력하세요 : ");
		for(int i=0;i<peoplefloors.length;i++) {
			peoplefloors[i] = scanner.nextInt();
		}
		for(int i=0;i<peoplefloors.length;i++) {
			for(int j=0;j<peoplefloors.length;j++) {
				if(peoplefloors[i]<peoplefloors[j]) {
					int temp = peoplefloors[i];
					peoplefloors[i] = peoplefloors[j];
					peoplefloors[j] = temp;
				}
			}
		}
//		System.out.print("사람들의 층 : ");
//		for(int i=0;i<peoplefloors.length;i++) {
//			System.out.print(peoplefloors[i]+" ");
//		}
//		System.out.println();
		boolean isNone = false;
		int finalfloor = peoplefloors[peoplefloors.length-1];
		while(true) {
			System.out.println("현재 "+floor+"층입니다.");
			if(isNone==false) {
				for(int i=0;i<peoplefloors.length;i++) {
					if(peoplefloors[i]==floor) {
						System.out.println(floor+"층에 사람이 내립니다.");
					}
				}
			}
			if(floor==finalfloor) {
				isNone = true;
			}
			if(isNone==false&&floor<finalfloor){
				floor++;	
			}
			else if(isNone==true&&floor<=finalfloor) {
				floor--;
				if(floor<1)break;
			}
		}

	}
	public static void level1() {
//		엘리베이터
//
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )
//
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)
//
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
//		1층에 5명 탔고 1층에서 동시에 5 10 15 25 11
		
//		- 레벨 1
//		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
//		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
//		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
//		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
//
//		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다.
		
		int floor = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("탑승인원을 입력하세요 : ");
		int peopleCount = scanner.nextInt();
		int[] peoplefloors = new int[peopleCount];
		System.out.print("사람들이 내릴 층을 각각 입력하세요 : ");
		for(int i=0;i<peoplefloors.length;i++) {
			peoplefloors[i] = scanner.nextInt();
		}
		for(int i=0;i<peoplefloors.length;i++) {
			for(int j=0;j<peoplefloors.length;j++) {
				if(peoplefloors[i]<peoplefloors[j]) {
					int temp = peoplefloors[i];
					peoplefloors[i] = peoplefloors[j];
					peoplefloors[j] = temp;
				}
			}
		}
//		System.out.print("사람들의 층 : ");
//		for(int i=0;i<peoplefloors.length;i++) {
//			System.out.print(peoplefloors[i]+" ");
//		}
//		System.out.println();
		boolean isNone = false;
		int finalfloor = peoplefloors[peoplefloors.length-1];
		
		int stopcount = 0;
		System.out.print("횟수 제한 입력 : ");
		int stoplimit = scanner.nextInt();
		System.out.println("====올라갑니다=====");
		while(true) {
			System.out.println("현재 "+floor+"층입니다.");
			if(isNone==false) {
				for(int i=0;i<peoplefloors.length;i++) {
					if(peoplefloors[i]==floor) {
						System.out.println(floor+"층에 사람이 내립니다.");
						stopcount++;
					}
				}
			}
			if(stoplimit>0&&stoplimit<peoplefloors.length) {
				if(stopcount==stoplimit) {
					System.out.println("점검 중");
					break;
				}
			}
			if(floor==finalfloor) {
				isNone = true;
				System.out.println("====내려갑니다=====");
			}
			if(isNone==false&&floor<finalfloor){
				floor++;	
			}
			else if(isNone==true&&floor<=finalfloor) {
				floor--;
				if(floor<1)break;
			}
		}

	}
	public static void level2() {
//		엘리베이터
//
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )
//
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)
//
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
//		1층에 5명 탔고 1층에서 동시에 5 10 15 25 11
		
//		- 레벨 1
//		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
//		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
//		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
//		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
//
//		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다.
//		- 레벨 2
//		엘리베이터는 태울 수 있는 총 중량 또는 정원이 있습니다.
//		탑승 인원을 순서대로 측정하되, 총 무게를 넘거나 정원이 넘으면 그 뒤에 인원을 엘리베이터에 태우지 않습니다.
//		(총 중량이 200kg 일 경우, 탑승 인원 순서대로 80, 120, 40 이면 가장 마지막 사람은 태우지 않음)
//
//		+ 엘리베이터의 총 무게 및 정원은 사용자 입력을 받습니다.
//		+ 탑승 인원 및 각 탑승 인원의 내릴 층은 랜덤으로 추출합니다. (사용자 입력에서 변경)
//		+ 각 탑승 인원의 무게도 랜덤으로 추출합니다. (40 kg ~ 150 kg)
//		#퀴즈
//		int floor = 1;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("탑승인원을 입력하세요 : ");
//		int peopleCount = scanner.nextInt();
//		int[] peoplefloors = new int[peopleCount];
//		System.out.print("사람들이 내릴 층을 각각 입력하세요 : ");
//		for(int i=0;i<peoplefloors.length;i++) {
//			peoplefloors[i] = scanner.nextInt();
//		}
		int floor = 1;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.print("엘리베이터 총 중량과 정원 입력 : ");
		int elevatorWeightLimit = scanner.nextInt();
		int peopleCountLimit = scanner.nextInt();
		int peopleCount = random.nextInt(10)+1;
		int sumpeopleweight=0;
		int chkpeoplei=0;
		int[] peoplefloors = new int[peopleCount];
		int[] peopleWeightArr = new int[peopleCount];
		//정원수가 많으면 인원수를/인원수가 더 많으면 정원수를
		int iMaxCount = (peopleCount>peopleCountLimit)?peopleCountLimit:peopleCount;//변수 추가해서 if-else없애기
		peopleWeightArr = new int[iMaxCount];
		for(int i=0;i<iMaxCount;i++) {
			peopleWeightArr[i] = random.nextInt(111)+40;
		}
		for(int i=0;i<iMaxCount;i++) {
			sumpeopleweight+=peopleWeightArr[i];
			if(sumpeopleweight>elevatorWeightLimit)break;
			chkpeoplei++;
		}
		peoplefloors = new int[iMaxCount];
		for(int i=0;i<chkpeoplei;i++) {
			peoplefloors[i] = random.nextInt(99)+2;
		}
		System.out.println("인원수:"+peopleCount+" "+"정원수:"+peopleCountLimit);
		System.out.println("정원내의 사람들 무게:");
		for(int i=0;i<iMaxCount;i++) {
			System.out.print(peopleWeightArr[i]+ " ");
		}
		System.out.println();
		
		System.out.println("타는 사람들 무게: ");
		for(int i=0;i<chkpeoplei;i++) {
			System.out.print(peopleWeightArr[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0;i<chkpeoplei;i++) {
			for(int j=0;j<chkpeoplei;j++) {
				if(peoplefloors[i]<peoplefloors[j]) {
					int temp2= peoplefloors[i];
					peoplefloors[i] = peoplefloors[j];
					peoplefloors[j] = temp2;
				}
			}
		}
		
		System.out.println("타는 사람들 내릴 층: ");
		for(int i=0;i<chkpeoplei;i++) {
			System.out.print(peoplefloors[i]+" ");
		}
		System.out.println();
//		for(int i=0;i<peoplefloors.length;i++) {
//			for(int j=0;j<peoplefloors.length;j++) {
//				if(peoplefloors[i]<peoplefloors[j]) {
//					int temp = peoplefloors[i];
//					peoplefloors[i] = peoplefloors[j];
//					peoplefloors[j] = temp;
//				}
//			}
//		}
		
//		System.out.print("사람들의 층 : ");
//		for(int i=0;i<peoplefloors.length;i++) {
//			System.out.print(peoplefloors[i]+" ");
//		}
//		System.out.println();
		boolean isNone = false;
		int finalfloor = peoplefloors[chkpeoplei-1];	////chkpeoplei가 탑승인원 배열 길이
		int stopcount = 0;
		System.out.print("횟수 제한 입력 : ");
		int stoplimit = scanner.nextInt();
		System.out.println("====올라갑니다=====");
		while(true) {
			System.out.println("현재 "+floor+"층입니다.");
			if(isNone==false) {
				for(int i=0;i<chkpeoplei;i++) {
					if(peoplefloors[i]==floor) {
						System.out.println(floor+"층에 사람이 내립니다.");
						stopcount++;
					}
				}
			}
			
			if(stoplimit>0&&stoplimit<chkpeoplei) {	//chkpeoplei가 탑승인원 배열 길이
				if(stopcount==stoplimit) {
					System.out.println("점검 중");
					break;
				}
			}
			if(floor==finalfloor) {
				isNone = true;
				System.out.println("====내려갑니다=====");
			}
			if(isNone==false&&floor<finalfloor){
				floor++;	
			}
			else if(isNone==true&&floor<=finalfloor) {
				floor--;
				if(floor<1)break;
			}
		}

	}

}
