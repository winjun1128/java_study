package study.practice;

public class Cote8_2 {

	public static void main(String[] args) {
			int age = 23;
		  	String answer = "";
	        String age_str = Integer.toString(age);
	        char [] ages = new char[age_str.length()];
	        for(int i=0;i<ages.length;i++){
	            ages[i] = (char)(age_str.charAt(i)-'0' + 'a');
	        }
	      
	  
	        for(int i=0;i<ages.length;i++) {
	        	System.out.print(ages[i]+" ");
	        }
	       
	}

}
