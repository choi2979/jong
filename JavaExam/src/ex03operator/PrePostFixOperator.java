package ex03operator;

public class PrePostFixOperator {
	/*
	����/���� ������ : +1 Ȥ�� -1 �Ѱͱ� ���� ����� ��ȯ�Ѵ�.
	
	prefix(�������� Ȥ�� ����) : �����ڰ� ���� �տ� �ִ� ����
		1. ������ ���� ���� �����Ѵ�.
		2. ������ ���� �������� Ȥ�� �ٸ� �ڵ尡 ����ȴ�.
	postfix(�������� Ȥ�� ����) : �����ڰ� ���� �ڿ� �ִ� ����
		1. ������ ���� �������� Ȥ�� �ٸ� �ڵ尡 ���� ����ȴ�.
		2. ����� ���� ������ ���� ����ȴ�.
	 */

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2, num3;
		
		num2 = ++num1;/*
						1. num1�� ���� ���� 1������
						2. 1������ num1�� ���� num2�� ���Ե�.
						��� : num1=8, num2=8
		*/
		num3 = --num1;/*
						1.num1�� ���� ���� 1���ҵ�
						2. 1������ num1�� ���� num3�� ���Ե�.
						��� : num1=7, num3=7
						������� : 7, 8, 7
		*/
		System.out.println("��������/���ҽ�");
		System.out.printf("num1=%d, num2=%d, num3=%d %n%n", num1, num2, num3);
		
		
		num1 = 7;
		
		num2 = num1++;/*
						1. num1�� ���� num2�� ���� �Ҵ��.
						2. num1�� ���� ���Ŀ� ������.
		*/
		num3 = num1--;/*
						1. num1�� ���� 8�� num3�� �Ҵ��.
						2. num1�� ���� 1 ������
						
						�������: 7, 7, 8
		*/
		System.out.println("��������/���ҽ�");
		System.out.printf("num1=%d, num2=%d, num3=%d", num1, num2, num3);

	}

}
