package ex03operator;

public class BitOperator {
	/*
	��Ʈ������  : �ڷḦ bit������ �� �����Ѵ�.
		& :And. �¿찡 �Ѵ� 1�϶��� 1�� ��ȯ. �������� 0
		| :Or. �¿� ���� �ϳ��� 1�̸� 1�� ��ȯ, �Ѵ�0�϶� 0��ȯ.
		^ :���� ������ 0, �ٸ��� 1�� ��ȯ
		~ :������ ���� ��ȯ. 1�̸�0, 0�̸� 1��ȯ
	 */

	public static void main(String[] args) {
		
		int num1 =  5;//00000000 00000000 00000000 00000101
		int num2 =  3;//00000000 00000000 00000000 00000011
		int num3 = -1;//11111111 11111111 11111111 11111111
					// -1�� ���Ͱ��� ������ 1�� �������� 0�̵Ǳ� �����̴�.
		
		System.out.println("��ƮAND:"+ (num1 & num2));//��� 1
		System.out.println("��ƮOR:"+ (num1 | num2));//��� 7
		System.out.println("��ƮXOR:"+ (num1 ^ num2));//��� 6
		System.out.println("��ƮNot:"+ (~num3));//��� 0

	}

}
