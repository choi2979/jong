package ex04controlstatement;
/*����1] ���ϸ� : Qu_01.java
����ڷκ��� �� ���ڸ� �Է¹޾� 
�����̸� "����",  ���ĺ�(�빮�� Ȥ�� �ҹ���)�̸� "���ĺ�"�� ����ϰ�, ���� �Ѵ� �ƴ϶�� "�躸��"�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
��, �ƽ�Ű�ڵ尪�� �𸥴ٰ� �����Ѵ�. 
*/
import java.io.IOException;

public class Qu_01 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���:");
		int ascii = System.in.read();//char ascii = (char)System.in.read();
		
		/*
		if(ascii >= '0' && ascii <= '9') {
			System.out.println("����");
		}
		else if(ascii >= 'a' && ascii <= 'z' || ascii >= 'A' && ascii <= 'Z') {
			System.out.println("���ĺ�");
		 */
		boolean isNumber = (ascii >= '0' && ascii <= '9');
		
		boolean s_alphabet = (ascii >= 'a' && ascii <= 'z');
		
		boolean b_alphabet = (ascii >= 'A' && ascii <= 'Z');
		
		if(isNumber) {
			System.out.println("����");
		}
		else if(s_alphabet) {
			System.out.println("���ĺ�");
		}
		else if(b_alphabet) {
			System.out.println("���ĺ�");
		}
		else {
			System.out.println("�躸��");
		}

	}

}
