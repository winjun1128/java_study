package study.practice;

public class Cote7_1 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,4,3};
		int[][]queries = {{0,4,1},{0,3,2},{0,3,3}};
	    int[] answer = new int[arr.length];
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j>=queries[i][0]&&j<=queries[i][1]&&j%queries[i][2]==0)arr[j]+=1;
            }
            for(int j=0;j<arr.length;j++) {
            	System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            answer[i] = arr[i];
        }
        //return answer;

	}

}
