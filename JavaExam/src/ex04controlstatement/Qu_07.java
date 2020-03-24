package ex04controlstatement;
/*
문제1] 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
파일명 : Qu_07.java
출력]
	*
	* *
	* * *
	* * * *
	* * * * *
*/

public class Qu_07 {

	public static void main(String[] args) {
		int m = 1;//'층'에 해당하는 변수
		while(m <= 5) {
			int n = 1;//'*' 출력에 해당하는 변수
			while(n <= 5) {
				//n은 m의 갯수만큼*를 출력한다.
				if(n <= m) {
					System.out.print("* ");
				}
				/* 필요없음
				 	else {
					System.out.print("  ");
				}*/
			n++;
			}
		System.out.println();//n의 반복이 끝난후 줄바꿈
		m++;
		}
		/*
		연습문제] 위 문제를 for문으로 변경하시오.
		 */

	}

}
