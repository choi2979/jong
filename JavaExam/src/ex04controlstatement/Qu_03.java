package ex04controlstatement;

import java.io.IOException;

/*
����3] ���ϸ� : Qu_03.java
�ϳ��� ���ڸ� �Է¹޾� ����ڰ� �Է��� ���� �������� �Ǵ��Ͽ� ���ڶ�� 2�ǹ�������� �ٽ� �Ǵ��Ͽ��� 2�ǹ���� ��쿡�� "2�� ��� �Դϴ�"��� ����Ͻÿ�. 
�� �ܿ��� "2�� ����� �ƴմϴ�" ��� ����Ѵ�.
��Ʈ] '0'�� �ƽ�Ű�ڵ尪�� 48 �Դϴ�. 
(System.in.read()�� ����ϼ���)
 */
public class Qu_03 {

	public static void main(String[] args) throws IOException{
		
		System.out.print("���� �ϳ��� �Է��ϼ���:");
		int ascii = System.in.read();
		
		boolean number = (ascii >= '0' && ascii <= '9');
		
		boolean e_number = (ascii%2 == 0 && ascii>48);
		
		/*if(number == true)
		 if((ascii-'0')%2==0) { '1'=49 '0'=48 49-48= 1
		 */
		if(number) {
			if(e_number) {
				System.out.println("2�� ����Դϴ�");
			}
			else {
				System.out.println("2�� ����� �ƴմϴ�");
			}
		}
		else {
			System.out.println("2�� ����� �ƴմϴ�");// "���ڰ� �ƴմϴ�."
		}

	}

}
