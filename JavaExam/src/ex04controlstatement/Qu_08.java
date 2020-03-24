package ex04controlstatement;
/*
문제2] 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 작성하시오. 
	단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 
	출력의결과는 누적되는 모든 수를 콘솔에 print한다.
파일명 : Qu_08.java
 */

public class Qu_08 {

	public static void main(String[] args) {
		
		int total = 0;
		int n = 1;
		while(n<=100) {
	
			if(n%3==0 || n%7==0) {
				if(n%21 !=0) {
					total += n;
					System.out.print("n="+ n+" ");
		/*for (int i=1 ; i<=100 ; i++) { 반복횟수가 정해져 있기 때문에 for문 사용
		
			if(i%3==0 || i%7==0) {
				3과 7의 공통배수는 제외...
				if(i%(3*7)!=0) {
					sum += i;
					System.out.println("i="+ i);
				}
			}
		}
		System.out.println("결과:"+ sum);
		*/
				}
			}
			
			
			n++;		
		}
		System.out.println("="+ total);
		

	}

}
