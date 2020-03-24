package ex04controlstatement;
/*문제1] 파일명 : Qu_01.java
사용자로부터 한 문자를 입력받아 
숫자이면 "숫자",  알파벳(대문자 혹은 소문자)이면 "알파벳"을 출력하고, 만약 둘다 아니라면 "듣보잡"을 출력하는 프로그램을 작성하시오.
단, 아스키코드값을 모른다고 가정한다. 
*/
import java.io.IOException;

public class Qu_01 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("문자를 하나 입력하세요:");
		int ascii = System.in.read();//char ascii = (char)System.in.read();
		
		/*
		if(ascii >= '0' && ascii <= '9') {
			System.out.println("숫자");
		}
		else if(ascii >= 'a' && ascii <= 'z' || ascii >= 'A' && ascii <= 'Z') {
			System.out.println("알파벳");
		 */
		boolean isNumber = (ascii >= '0' && ascii <= '9');
		
		boolean s_alphabet = (ascii >= 'a' && ascii <= 'z');
		
		boolean b_alphabet = (ascii >= 'A' && ascii <= 'Z');
		
		if(isNumber) {
			System.out.println("숫자");
		}
		else if(s_alphabet) {
			System.out.println("알파벳");
		}
		else if(b_alphabet) {
			System.out.println("알파벳");
		}
		else {
			System.out.println("듣보잡");
		}

	}

}
