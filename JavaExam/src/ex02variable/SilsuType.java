package ex02variable;

public class SilsuType {

	public static void main(String[] args) {
		
		/*
		-���������ٴ� �Ǽ����� �� ū �ڷ����̴�. (0�� 1���̿� ������
		�Ǽ��� �����ϱ� ����)
		-���� long�� float�� �������� float���� �ȴ�.
		 */
		
		long long1 = 100;
		float float1 = 200;
		float result1 = long1 + float1;
		System.out.println("long1 + float1 = "+ result1);
		/*
		float�� long�� �������� long���� �ް�ʹٸ�
		1. float�� long���� ����ȯ�� �����ϰų�
		2. ����� ��ü�� long���� �����(����)����ȯ�̴�.
		 */
		long result2 = long1 + (long)float1;
		System.out.println("����ȯ�� ����="+ result2);
		long result3 = (long)(long1 + float1);
		System.out.println("����� ����ȯ="+ result3);
		/*
		-�Ǽ������� �⺻���� double�̴�.
		-�Ҽ����� �մ� �����ʹ� ������double������ �νĵȴ�.
		��, �Ҽ����� ���� �����ʹ� float�� ������ �� �ִ�.
		-�Ҽ����� �ִ� �����͸� �����Ϸ����� float�� �ν��ϰ� �Ϸ���
		���̻�(F or f)�� ����ؾ��Ѵ�.
		-����ȯ�� ���������� Java������ �������� �ʴ´�.
		 */
		float f3 = 100;
		
		//float f4 = 3.14[�����߻�]3.14��ü�� double�� �ν�
		float f4 = (float)3.14;//����ȯ�� ����(��������� �ƴ�)
		System.out.println("f4="+ f4);
		
		float f5 = 3.14F;//�ڹٿ����� ���̻� ����� ������.
		System.out.println("f5="+ f5);
		

	}

}
