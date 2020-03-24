package ex05method;

import java.util.Scanner;

/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다. 
입력예]
	첫번째숫자 : 3
	두번째숫자 : 6
	3*1=3 3*2=6........
	........
	...................6*9=54
메소드명 : inputGugudan(int sNum, int eNum)
 */
public class MethodType03_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자:");
		int s = scan.nextInt();
		System.out.println("두번째 숫자:");
		int e = scan.nextInt();
		inputGugudan(s, e);
	}
	
	static void inputGugudan(int sNum, int eNum) {

		for(int su = 1 ; su<=9 ; su++) {
			for(int dan =sNum ; dan<=eNum ; dan++) {
				System.out.print(dan +"*"+ su +"="+(dan*su)+" ");
				
			}
			//한줄 출력 후 줄바꿈 처리
			System.out.println();
		}
	}


}
