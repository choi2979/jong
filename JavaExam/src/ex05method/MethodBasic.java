package ex05method;

import java.util.Scanner;

public class MethodBasic {
	
	/*
	�޼ҵ� ����1 : �Ű�����O, ��ȯ��O ���·� ����
	- �ΰ��� ������ �Է¹޾� ���� ����� ��ȯ�Ѵ�.
	 */
	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
	}
	/*
	�޼ҵ�����2 : �Ű�����X, ��ȯ��X ���·� ����
	-�Ű����� ���� �̸��� �Է¹����� namePrint()�Լ��� ȣ����.
	-��ȯŸ���� ���� ������ �� ��� void��� �ݵ�� ����ؾ� �Ѵ�.
	 */
	public static void menuPrint() {
		System.out.println("����� �̸��� �����ΰ���?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		namePrint(name);//��
		
	}
	/*
	�޼ҵ�����3 : �Ű�����O, ��ȯ��X
	-��ȯ���� ���� ��쿡�� ������ �Ϸ�� �� ȣ���ߴ� ��������
	�ٽ� ���ư���.
	 */
	public static void namePrint(String n) {
		System.out.println("�� �̸��� "+ n +"�Դϴ�.");
	}
	/*
	��Ģ
	-JAVA������ main�޼ҵ�� ������ public static void�� �����ϱ��
	��ӵǾ��ִ�.
	-static���� ����� �޼ҵ忡�� �ٸ� �޼ҵ带 ȣ���ϱ� ���ؼ��� ȣ��Ǵ�
	�޼ҵ嵵 static���� ����Ǿ�� �Ѵ�.
	-�޼ҵ� ȣ���� ��ȯ���� �׻� ȣ���� ��ġ�� ��ȯ�ô�. �̶� ȣ��� �޼ҵ��
	�޸𸮿��� �Ҹ�ȴ�. ��ȯ���� ���� ��쿡�� �Լ��� ������ �Ϸ�Ǹ� ȣ����
	��ġ�� ���ƿ´�.
	 */
	public static void main(String[] args) {
		
		/*
		�޼ҵ带 ȣ���Ҷ��� �Լ��� ������ �״�� ���ָ� �ȴ�.
		�Ű������� �ִٸ� ������ŭ ���Խ����ش�.
		 */
		int result = simpleFunc(1, 2);
		System.out.println("1��2�� ������ ���:"+ result);
		System.out.println("10��20�� ������ ���:"+ simpleFunc(10, 20));
		
		menuPrint();
		
		

	}

}
