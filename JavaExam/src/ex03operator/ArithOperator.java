package ex03operator;

public class ArithOperator {
	/*
	���������(Arithmatic Operator)
		: ��Ģ���翡 ���õ� +, -���� �����ڰ� �ִ�.
		��, �����⸦ �Ҷ��� /�� ����, %�� �������� ���ϴ� �������̴�.
	 */

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("����:"+(num1+num2));
		System.out.println("����:"+(num1-num2));
		System.out.println("����:"+(num1*num2));
		System.out.println("������(��):"+(num1/num2));
		System.out.println("������(������):"+(num1%num2));
		
		int result = 3 * 2 + 5 % 2 - 6 / 3 * 5;
		System.out.println("�����?"+ result);// -3

	}

}
