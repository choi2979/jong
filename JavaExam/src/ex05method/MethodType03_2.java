package ex05method;

import java.util.Scanner;

/*
��������] ����ڷκ��� 2~9������ ������ 2���� �Է¹޾�
�׿� �ش��ϴ� �������� ����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
������ ù��° �Է¹޴¼��� �۾ƾ��Ѵ�. 
�Է¿�]
	ù��°���� : 3
	�ι�°���� : 6
	3*1=3 3*2=6........
	........
	...................6*9=54
�޼ҵ�� : inputGugudan(int sNum, int eNum)
 */
public class MethodType03_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ����:");
		int s = scan.nextInt();
		System.out.println("�ι�° ����:");
		int e = scan.nextInt();
		inputGugudan(s, e);
	}
	
	static void inputGugudan(int sNum, int eNum) {

		for(int su = 1 ; su<=9 ; su++) {
			for(int dan =sNum ; dan<=eNum ; dan++) {
				System.out.print(dan +"*"+ su +"="+(dan*su)+" ");
				
			}
			//���� ��� �� �ٹٲ� ó��
			System.out.println();
		}
	}


}
