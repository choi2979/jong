package ex04controlstatement;
/*
문제3] 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
파일명 : Qu_09.java
출력]	
* * * * *
* * * *
* * *
* *
*
 */
public class Qu_09 {

	public static void main(String[] args) {
		
		//final int FLOOR = 5; 층을 나타내는 변수
		
		/*
		해당 모양을 출력하기 위한 일반식
			y = 층 - x + 1
			즉, 층이 증가할때 y는 감소하게 된다.
		 */
		
		for(int n = 1 ; n<=5 ; n++) {//5>>FLOOR
			for(int m =1 ; m<=5 ; m++) {//m<=5 => m<=(FLOOR-n+1)
				if(n+m<=6) {
					System.out.print("* ");
				}
				/*else {
					System.out.print("  ");
				}필요x*/
			}
			System.out.println();
		}
		
	}

	

	
		
}


