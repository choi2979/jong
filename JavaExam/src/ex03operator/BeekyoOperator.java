package ex03operator;

public class BeekyoOperator {
	/*
	�񱳿�����
		: �¿������� ���� ũ�ų�, ���ų� ���� ���ϴ� ������
	 */
	public static void main(String[] args) {
		
		int num1 =10, num2=20;
		/*
		num1�� Ŭ�� true(��)�� ��ȯ�Ѵ�. ���� ������ �����̹Ƿ�
		else ������ ���ڵȴ�.
		 */
		if(num1 > num2) {
			System.out.println("num1�� �� Ů�ϴ�.");
		}
		else {
			System.out.println("num2�� �� Ů�ϴ�.");
		}
		/*
		num1�� num2�� �ٸ��� true�� ��ȯ�ϹǷ� if������ ����ȴ�.
		 */
		if(num1 != num2) {
			System.out.println("num1�� num2�� �ٸ���.");
		}
		else {
			System.out.println("num1�� num2�� ����.");
		}
	}

}
