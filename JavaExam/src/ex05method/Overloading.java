package ex05method;
/*
�޼ҵ� �����ε�(Method Overloading)
	: ������ �̸��� �޼ҵ带 �ΰ��̻� �����ϴ°��� ���Ѵ�.
	-�Ű������� ������ �ٸ��ų�, �ڷ���(Ÿ��)�� �ٸ��� �����Ѵ�.
	-�Ű������� ������ �ڷ����� �����ϰ�, ��ȯŸ�Ը� �ٸ� ����
	�������� �ʴ´�.(����)
	-�����Ϸ��� �޼ҵ� ȣ��� �����ϴ� �Ķ���͸� ���� ȣ����
	�޼ҵ鸦 �����Ѵ�.
 */
public class Overloading {
	
	static void person(int juminNum, int milNum) {
		
		System.out.println("������ �̽ñ���");
		System.out.println("�ֹι�ȣ:"+ juminNum);
		System.out.println("����"+ milNum);
	}
	static void person(int juminNum) {
		System.out.println("�������̰ų� �����̽ñ���");
		System.out.println("�ֹι�ȣ:"+ juminNum);
	}
	/*
	�̿Ͱ��� ��ȯŸ�Ը� �ٸ� ���´� �����ε��� �������� �ʴ´�.
	 */
//	static int person(int juminNum) {
//		System.out.println("�������̰ų� �����̽ñ���");
//		System.out.println("�ֹι�ȣ:"+ juminNum);
//		
//		return 1;
//	}

	public static void main(String[] args) {
		person(123456, 7890123);
		System.out.println("=====================");
		person(987654);
		

	}

}
