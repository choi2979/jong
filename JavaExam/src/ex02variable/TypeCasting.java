package ex02variable;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		�ڵ�����ȯ : ���������� �����͸� ū���ڿ� ��������
			�ڵ����� ����ȯ�� �Ͼ��.
		 */
		byte b1 = 65;
		short s1;
		s1 = b1;// ���� byte���� ū short������ �ڵ���ȯ��.
		System.out.printf("b1�� %d, s1�� %d%n", b1, s1);
		
		/*
		�Ʒ��ڵ�� �ڵ�����ȯ�� �ƴ�. CPU�� int���� ���� �ڷ����� int��
		�����ϰ� ������ �����ϸ�, ����� int�� ��ȯ�Ѵ�.
		CPU�� Ư���̶� ��������.
		 */
		int num1 = b1 + s1;
		int num2 = num1;
		System.out.println("num1�� "+ num1);
		/*
		char��(����Ÿ��)�� byte��(����Ÿ��)�� �ٷ� �����Ҽ� ����.
		������ ���� �ٸ��Ƿ� ����� �� ��ȯ �� �����ؾ� �Ѵ�.
		 */
		//char ch1 = b1;[�����߻�]
		char ch2 = (char)b1;
		System.out.println("b1="+ b1 +", ch2="+ ch2);
		
		/*
		���������ȯ: ū������ �ڷḦ ���������� �ڷ����� ��ƾ� �Ҷ�
			����Ѵ�. ��, �̶��� �������� �ս��� ������ �����Ƿ�
			���Ǹ� ���Ѵ�.
		 */
		short s2 = 100;
		byte b2 = (byte)s2;//100�� byte�� ǥ�������ȿ� �����Ƿ� �սǵ��� ����.
		System.out.printf("�����͹̼ս�:b2=%d, s2=%d\n", b2, s2);
		/*
		�Ҽ��� �Ʒ��κ��� �������Ƿ� ������ �սǵ�. ���� Ư����
		��찡 �ƴ϶�� ����� �����ϴ°��� ����.
		 */
		int num3;
		double d1 = 3.14;
		num3 = (int)d1;
		System.out.printf("�����ͼս�:num3=%d, d1=%.2f %n", num3, d1);
		
		
		char ch3 ='A', ch4;
		int num4 =2;
		/*
		char�� int�� �����ϸ� ����� int�̹Ƿ� �Ʒ������� ������
		�߻��ȴ�. ���⼭�� ������ ��ü�� char������ ��ȯ��
		�����ؾ� �Ѵ�.
		 */
		//ch4 = ch3 + num4; �����߻�
		ch4 = (char)(ch3 + num4);
		System.out.println("ch4="+ ch4);

	}

}
