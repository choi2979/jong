package ex02variable;

/*
��� : ����� ���� ������ �ƈq�� �޸��� ������
������: final �ڷ��� ������ = �ʱⰪ;
-����� �� �ѹ��� �ʱ�ȭ�Ǹ�, �߰��� ���� �����ϸ� �����߻���
-����� ��ü�� �빮�ڷ� �����ϸ� ����� �ܾ ���� ���
	_(�����)�� ǥ���ȴ�.
-�ַ� ���α׷������� �ڵ��� �������� �����ֱ� ���� Ȱ��ȴ�.
 */
public class ConstantVar {

	public static void main(String[] args) {
		
		//����� �����԰� ���ÿ� �ʱ�ȭ
		final double PI = 3.14;
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER =3;
		
		System.out.println("PI(������)="+ PI);
		
		//����� �ѹ� �ʱ�ȭ�Ǹ� ���� ������ �� ����.
		//PI = 3.141592;
		
		//����� �ʱ�ȭ���� ���� ���¿��� ����ϸ� �����߻���.
		final String NICK_NAME;
		//System.out.println("�츮�� "+ NICK_NAME);
		NICK_NAME = "�ڽ���59��";
		System.out.println("�츮�� "+ NICK_NAME);
		/*
		���������� ������ ���� �����ڴ� �Ʒ��� ���� �����Ͽ���.
		����: 1, ����: 2, ��: 3
		 */
		int computer, user;
		
		/*
		1, 3�� ������ ���θ� �˼��ִ� �����̹Ƿ�, �����̼��� ��������
		�ڵ�� �ۼ��Ǿ���. �� ��������� ���� �ڵ�.
		 */
		computer = 1;
		user = 3;
		System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		/*
		PAPER�� ���� �ܾ�� ���� ������ �˼������Ƿ� �������� ����
		�ڵ�� �ۼ���. �� ������� �ڵ�.
		 */
		computer = SCISSOR;
		user = PAPER;
		System.out.println("Computer Win");
		
		

	}

}
