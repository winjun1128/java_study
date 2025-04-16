package study.cond;

public class Conditional02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice =5;
		if(dice ==1) {//5==1 -> false
			System.out.println("한칸 전진");
		}
		if(dice==1) {
			System.out.println("한칸 전진");
		}
		else {
			System.out.println("1이 아닐때 할 행동1");
			System.out.println("1이 아닐때 할 행동2");
			System.out.println("1이 아닐때 할 행동3");
		}
		if(dice==1)
			System.out.println("한칸 전진");
		else
			System.out.println("1이 아닐때 할 행동1");
		System.out.println("1이 아닐때 할 행동2");
		System.out.println("1이 아닐때 할 행동3");
		
		/*
		 if()
		 if()
		 if()
		 
		 if()
		 else
		 
		 if()
		 else if()
		 else if()
		 else if()
		 else
		 
		 else		X
		 
		 else if()		X
		*/
		if(dice == 1) {
			
		} else if(dice==2) {
			
		} else if(dice ==3) {
			
		}
		
		if(dice == 1) {
			
		} else if(dice==2) {
			
		} else if(dice ==3) {
			
		} else {
			
		}
		
		if(dice ==1) {
			
		}
		if(dice ==2) {
	
		}
		if(dice==3) {
		}
	
		//독학_조건문에 변수가 여러가지일때
		//독학
//		int num=10,num2=100;
//		if(num>10) {
//			System.out.println("num이 10초과");
//		}
//		else if(num2>=100) {
//			System.out.println("num2이 100이상");
//		}
//		if(num==10) {
//			System.out.println("num은 10");
//		}
		//->num2이 100이상, num은 10 출력
		//독학2
//		int num=10,num2=100;
//		if(num>10) {
//			System.out.println("num이 10초과");
//		}
//		else if(num2>=100) {
//			System.out.println("num2이 100이상");
//		}
//		else if(num==10) {
//			System.out.println("num은 10");
//		}
		//->num2이 100이상 출력	(num은 10은 else if라서 num2이 100이상이 else if여서 안 들어감)
		
		/*
	 	6000원 이하 -> "훌륭"
	 	6000원 초과 ~ 8000원 -> "선방"
	 	8000원 초과 ~ 12000원 -> "눈물"
	 	12000원 초과 -> "물로배채우기"
		 */
		int menuPrice = 5000;
		
		//구분이 제대로 안되는 케이스 - if만 활용한 케이스
		if(menuPrice <= 6000) {
			//훌륭
		}
		if(menuPrice <= 8000) {
			//선방
		}
		//구분이 제대로 안되는 케이스 -> 구분 하도록 -if만 활용한 케이스
		if(menuPrice <= 6000) {
			//훌륭
		}
		if(menuPrice > 6000 && menuPrice <= 8000) {
			//선방
		}
		if(menuPrice>8000 && menuPrice <= 12000) {
			//눈물
		}
		
		if(menuPrice <= 6000) {
			//훌륭
		} else if(menuPrice<=8000) {
			//선방
		} else if(menuPrice<=12000) {
			//눈물
		} else {
			//물배
		}
		
		//로직이 잘못된 케이스
		if(menuPrice > 6000) {				//뒤의 케이스들이 뒤로 안넘어가고 앞에서 잡힘
			//선방
		} else if(menuPrice > 8000) {
			//눈물
		} else if(menuPrice > 12000) {
			//물배
		} else {
			//가격 <= 6000
			//훌륭
		}
		
		//로직이 잘못된 케이스	-> 그나마 결과라도 맞게 나오게(비효율적인 구조/ 잘못된 구조)
		// if 조건문 -> 중첩 사용 가능
		// 밑에 else if문 안 들어감
		if(menuPrice > 6000) {				
			//중첩 if
			if(menuPrice > 12000) {
				//물배
			} else if(menuPrice > 8000) {
				//눈물
			} else {
				//선방
			}
			
			if(menuPrice > 12000) {
				//물배
			}else {
				if(menuPrice>8000) {
					//눈물
				} else {
					//선방
				}
			}
			
			
		} else if(menuPrice > 8000) {
			//눈물
		} else if(menuPrice > 12000) {
			//물배
		} else {
			//가격 <= 6000
			//훌륭
		}
		
		//로직이 맞는 케이스
		if(menuPrice > 12000) {
			//물배
		} else if(menuPrice > 8000) {
			//눈물
		} else if(menuPrice > 6000) {
			//선방
		} else {	//가격 <= 6000
			//훌륭
		}
	}

}
