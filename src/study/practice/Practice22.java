package study.practice;

import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
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
			if(isNone==false&&floor<finalfloor){
				floor++;	
			}
			else if(isNone==true&&floor<finalfloor) {
				floor--;
				if(floor<1)break;
			}
			if(isNone==false) {
				for(int i=0;i<peoplefloors.length;i++) {
					if(peoplefloors[i]==floor) {
						System.out.println(floor+"층에 사람이 내립니다.");
					}
				}
			}
			if(floor==finalfloor) {
				isNone = true;
				floor--;
			}
		}

	}

}
