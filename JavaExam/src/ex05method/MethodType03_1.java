package ex05method;

import java.util.Scanner;
/*
[�޼ҵ�����3]
	�Ű������� ������ ��ȯ���� ���°��.
	�޼ҵ� ������ ���� ���� ���޹����� ������ ����� ��ȯ���� �ʰ�
	�ֿܼ� ��� ����ϴ� ������ ���α׷��� �ַ� ����.
 */

public class MethodType03_1 {
	/*
	�ó�����] ����ڰ� �Է���2���� ���۰��� �������̿� �ִ� 
	���� ��� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		��°��]
			���۰� : 5
			���ᰪ : 9
			��� : 5+6+7+8+9=???
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���۰�:");
		int s = scanner.nextInt();
		System.out.println("���ᰪ:");
		int e = scanner.nextInt();
		yesParamNoReturn(s, e);
	}
	
	static void yesParamNoReturn(int startNum, int endNum) {
		
		/*
		1���� 10���� ���ϴ� ���ε工�� ���۰��� ���ᰪ��
		������ �����Ͽ�, �ش� ������ ���� ���ϴ� ���α׷����� ������Ʈ.
		 */
		
		int sum = 0;
		for(int i=startNum ; i<=endNum ; i++) {
			sum += i;
		}
		System.out.printf("%d~%d������ ����:%d", startNum, endNum, sum);
	}

}
