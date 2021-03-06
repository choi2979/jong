package ex04controlstatement;
/*
while문 : 반복의 횟수가 정해져있지 않을 때 주로 사용하는 반복문이다.
	반복의 횟수가 명확할때는 주로 for문을 사용한다.
	형식
		반복을 위한 변수의 초기값;
		while(반복의 조건) {
			조건이 true일때 실행문장;
			증감식; <= 반복문을 탈출하기 위해
				++ 혹은 --와 같은 연산을 진행함/
		}
		반복의 조건이 false일때 while문 탈출...
 */
public class While {

	public static void main(String[] args) {
		
		//누적합을 저장하기 위한 변수선언. 증가하는 i를 누적해서 더함.
		int sum = 0;
		//실제 반복을 위한 변수 선언 및 초기화
		int i=1;
		while(i<=10) {//반복의 조건 설정(10이하일때까지 반복함)
			//증가되는 i를 sum에 누적해서 더함(1+2+3....)
			sum += i;
			//증가식. while문을 탈출하기 위한 조건을 위해 증가연산.
			i++;
		}
		System.out.println("1~10까지의합은:"+ sum);
		System.out.println("=========================");
		
		/*
		시나리오] 1부터 100까지의 정수중 3의 배수이거나 5의
		배수인 수의 합을 구햐여 출력하는 프로그램을 작성하시오.
		단, while문을 사용해야 한다.
		 */
		//1~100까지 반복하는 while문을 작성
		int total =0;
		int j = 1;
		while(j<=100) {
			//3의 배수이거나 5의배수가 되는 j를 찾음.
			if(j%3==0 || j%5==0) {
				
				//디버깅용 출력문장
				System.out.println("j="+ j);
				
				//찾은 j를 total에 누적해서 더함.
				total += j;
			}
			j++;
		}
		System.out.println("1~100사이 3or5의 배수합:"+ total);
		
		int dan = 2;//단
		while(dan<=9) {//단은 2~9까지 증가함
			int su = 1;//수(하나의 단을 출력한후 단이 증가하면 수는 1로 초기화됨)
			while(su<=9) {//수는 1~9까지 증가함
			//System.out.print(dan+"*"+su+"="+(dan*su));
			//서식에 맞춰서 출력할때는 printf문이 훨씬 더 편리함.
			System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
			System.out.print(" ");
			su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n============================\n");
		
		/*
		시나리오] 아래와같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		int m=1;
		while(m<=4) {
			int n=1;
			while(n<=4) {
				if(m==n)
					System.out.print("1 ");
				else
					System.out.print("0 ");
				n++;
			}
			System.out.println();
			m++;
		}
	}
}