package ex01start;

public class SystemOutPrintln {

	public static void main(String[] args) {
		
		int num1 = 100;
		/*
		System.out.println() : ������ ����� �� �ڵ����� �ٹٲ� ó���� �Ѵ�.
		System.out.print() : ����� �ٹٲ�ó���� �����ʴ´�. �̶�
			�ٹٲ��� �ϰ�ʹٸ�\n�� �߰��Ѵ�.
		System.out.printf() : ��³����� ���Ŀ� ���缭 ����Ҷ� ����ϸ�,
			��ü���� �ٹٲޱ���� ����. printf�������� �ٹٲ��� ����\n ��%n
			�ΰ����� ����� �� �ִ�.
		 */
		System.out.println("num1="+ num1);
		
		System.out.print("num1="+ num1 +"\n");
		
		System.out.printf("num1=%d%n", num1);
		
		/*
		print()������+ ��ȣ�� ����
		-���ڳ����� ���� ���������� �����Ѵ�.
		-���ڿ�, ����, ���� �� ���� ������ �ٸ� ��ü������ �����ؼ� ����Ѵ�.
		 */
		//����(���� or �Ǽ�)�� �ν��ؼ� �ش� ���ڸ� ���
		System.out.println(7);
		System.out.println(3.14);
		
		//���ڿ� ���ڷ� �ν��Ͽ� ���� ���������� ����� ���
		System.out.println(3 + 5);
		System.out.println(3.5 + 5.1);
		
		//���ڿ��� �����̹Ƿ� �ܼ��� ���Ḹ�ؼ� ���
		System.out.println("3+5="+ 8);
		System.out.println(3.15 +"�� �Ǽ��Դϴ�.");
		
		//������ ������ ���ڿ������� ������ ����� �ƴϹǷ� �����ؼ� ���
		System.out.println("3+5" + "�� �������� 8�Դϴ�.");
		
		//������ ���ڿ��� �����ؼ� ���
		System.out.println("num1�� "+ num1 +" �Դϴ�.");
		
	}

}
