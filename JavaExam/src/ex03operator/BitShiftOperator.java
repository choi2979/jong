package ex03operator;

public class BitShiftOperator {
	
	/*
	��Ʈ�̵�������(Bit Shift Operator)
		: �ڷ��� ��Ʈ�� ���� Ȥ�� �������� �̵���ī�� ������
		�������� shift��Ű�� 2�辿 ����
		�������� shift��Ű�� 2�辿 �����Ѵ�.
	 */

	public static void main(String[] args) {
		
		/*
		00000000 00000000 00000000 00000010 => 2
		00000000 00000000 00000000 00000100 => 2 << 1 = 4(2������)
		00000000 00000000 00000000 00001000 => 2 << 2 = 8(4������)
		 */
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		
		int num = 8;
		int sh1 =1, sh2 =2, sh3 =3;
		System.out.println(num >> sh1);//4
		System.out.println(num >> sh2);//2
		System.out.println(num >> sh3);//1
	}

}
