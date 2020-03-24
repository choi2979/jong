package ex04controlstatement;

import java.io.IOException;

/*
문제3] 파일명 : Qu_03.java
하나의 문자를 입력받아 사용자가 입력한 값이 숫자인지 판단하여 숫자라면 2의배수인지를 다시 판단하여서 2의배수인 경우에만 "2의 배수 입니다"라고 출력하시오. 
그 외에는 "2의 배수가 아닙니다" 라고 출력한다.
힌트] '0'의 아스키코드값은 48 입니다. 
(System.in.read()를 사용하세요)
 */
public class Qu_03 {

	public static void main(String[] args) throws IOException{
		
		System.out.print("문자 하나를 입력하세요:");
		int ascii = System.in.read();
		
		boolean number = (ascii >= '0' && ascii <= '9');
		
		boolean e_number = (ascii%2 == 0 && ascii>48);
		
		/*if(number == true)
		 if((ascii-'0')%2==0) { '1'=49 '0'=48 49-48= 1
		 */
		if(number) {
			if(e_number) {
				System.out.println("2의 배수입니다");
			}
			else {
				System.out.println("2의 배수가 아닙니다");
			}
		}
		else {
			System.out.println("2의 배수가 아닙니다");// "숫자가 아닙니다."
		}

	}

}
