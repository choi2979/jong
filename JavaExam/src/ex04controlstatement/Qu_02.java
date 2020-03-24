package ex04controlstatement;
/*
 문제2] 파일명 : Qu_02.java
세개의 숫자중 최대값을 구하는 프로그램을 작성하시오
*/
public class Qu_02 {

	public static void main(String[] args) {
		
		int n1= 99, n2 = 150, n3 = 199;
		
		//int maxvalue = n1;
		/*
		if(maxvalue > n2) {
			maxvalue = n2;
			
		if(maxvalue > n3) {
			maxvalue = n3;
		*/
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println(n1);
			}
			else {
				System.out.println(n3);
			}
		}
		else if(n2 > n3) { 
			System.out.println(n2);
		}
		else {
			System.out.println(n3);
		}
		
		int dan = 2;
		while(dan<=9) {
			int su = 1;
			while(su<=9) {
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
				System.out.print(" ");
			su++;
			}
			System.out.println();
		dan++;
		}
	}
}
