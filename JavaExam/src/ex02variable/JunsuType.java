package ex02variable;

public class JunsuType {

	public static void main(String[] args) {
		/*
		�����ڷ���
		-byte, short, int, long Ÿ��(��)�� �ִ�.
		-�� �ڷ����� ǥ�������� ������ �����Ѵ�.
		-�Ϲ������� CPU(�߾�ó����ġ)�� ������ ������ �Ҷ� int���� ����
		������ ó���Ѵ�.
		-�� ������ ������ ��κ� int���� ����Ѵ�.
		 */
		int int1 = 100;
		int int2 = 200;
		int result1 = int1 + int2;
		System.out.println("int1 + int2 = "+ result1);//���:300
		// ctrl + alt + ��
		result1 = int1 / int2;
		System.out.println("int1 / int2 = "+ result1);//���:0
		/*
		-int���� �����ڷ����� �����ϸ� Ŀ�¤��Ϸ��� int������ �ڵ�����ȯ�Ѵ�.
		-byte, short�� ����ĳ������ �������� ǥ���̳� ������������ �����Ҷ�
		����Ѵ�.
		 */
		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2;//byte��+byte�� = int��
		System.out.println("byte1 + byte2 = "+ result2);
		
		short short1 = 60, short2 = 70;
		int result3 = short1 + short2;//short��+short�� = int��
		System.out.println("short1 + short2 = "+ result3);
		/*
		-�����ڷ��������� ������ �����ڷ����� �Ǵ°��� �⺻ ��Ģ�̴�.
		-ū�ڷ����� �����ڷ����� �����ϸ� ū �ڷ������� �ڵ�����ȯ�ȴ�.(��������
		�ս��� �ֱ� ����)
		-�� byte�� short�� �������� ��Ȳ���� �����ϸ� �ȴ�. 
		 */
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1;//int��+ long�� = long������ ��ȯ
		System.out.println("int1 + long1 = "+ result4);
		
		result4 = long1 + long2;//long�������� ������ �⺻��Ģ�� ������.
		System.out.println("long1 + long2 = "+ result4);
		
		//long long3 = 2200000000;[�����߻�]out of range
		long long3 = 2200000000L;
		/*
			�ڹ������Ϸ�(CPU)�� ����������� �⺻������ int������
			�����ϱ� ������ ���Ͱ��� ���� ���̻�(l or L)��
			�ٿ��� ,int���� �ƴ� long���̶�°��� �����Ϸ�����
			�˷���� ������ �߻����� �ʴ´�.
			�̿Ͱ��� ������ ���� �Է��ϴ� ���ڵ� �ڷ����� �������
			�޸𸮰����� ����ȴ�. �̸� ������ '���ͷ�'�̶�� �Ѵ�.
		*/
	}

}
