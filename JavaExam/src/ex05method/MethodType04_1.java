package ex05method;

import java.util.Scanner;
/*
[�޼ҵ�����4]
	�Ű������� �ְ�, ��ȯŸ�Ե� �ִ� �޼ҵ�.
	4���� ������ ���� Ȱ��󵵰� ����.
 */
public class MethodType04_1 {
	/*
	 �ó�����] �ο����� �Ű������� ���޹޾� �ο��� ��ŭ ���̸�
	 �Է¹޾� �� ������ ���� ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		
		//4���� ���̸� �Է¹����� �ֵ��� �Ű����� ����
		int sumOfAge = getTotalAge(4);//��
		System.out.println("�Է¹��� ������ ����?"+ sumOfAge);
	}
	
	static int getTotalAge(int personCnt) {
		
		Scanner scanner = new Scanner(System.in);
		int sumAge = 0;// ������ ���� ������ ����
		
		//����� ����ŭ �ݺ��ϸ鼭 ���̸� �Է¹���
		for(int i=1 ; i<=personCnt ; i++) {
			System.out.print(i+"��° ����� ����:");
			int age =scanner.nextInt();
			sumAge += age;
		}
		
		return sumAge;
	}

}
