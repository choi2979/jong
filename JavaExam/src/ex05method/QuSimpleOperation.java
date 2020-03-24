package ex05method;

import java.util.Scanner;

/*
문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
메소드명 : arithmetic()
실행예 :
---------- java ----------
덧셈결과 -> 177
뺄셈결과 -> 23
곱셈결과 -> 7700
나눗셈 몫 -> 1
나눗셈 나머지 -> 23
--------------------------
 */

public class QuSimpleOperation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수1:");
		int num1 = scan.nextInt();
		System.out.print("정수2:");
		int num2 = scan.nextInt();
		arithmetic(num1, num2);

	}
	
	static void arithmetic(int numo, int numt) {
		
		int p= numo+numt;
		int m= numo-numt;
		int g= numo*numt;
		int n= numo/numt;
		int z= numo%numt;
		
        System.out.println("덧셈결과->"+ p); //(a+b)
        System.out.println("뺄셈결과->"+ m); //(a-b)
        System.out.println("곱셈결과->"+ g);
        System.out.println("나눗셈 몫->"+ n);
        System.out.println("나눗샘 나머지->"+ z); //printf( % = %%
	}
		
		
	

}
