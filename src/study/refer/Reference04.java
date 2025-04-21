package study.refer;

public class Reference04 {

	public static void main(String[] args) {
		
		//배열은 각자 공간을 가짐(값이 같다고 같은 공간을 가르키는게 아님)
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr22 = arr2;
		
		System.out.println(arr1==arr2);
		System.out.println(arr1[1]==arr2[1]);
		
		String[] arr3 = {"A","B","C"};
		String[] arr4 = {"A","B","C"};
		System.out.println(arr3==arr4);
		//System.out.println(arr3[0]==arr4[0]);
		System.out.println(arr3[0].equals(arr4[0]));
	}

}
