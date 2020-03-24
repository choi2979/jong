package ex05method;
/*
��������(Local Variable)
-������ ������(Scope)�� ������ �ְ�, �ش�������������
��� �����Ѵ�.
-�ش� ������ ����� ��� �޸𸮿��� �Ҹ�ȴ�.
-�⺻�ڷ����� ����(Stack)�̶�� �޸� ������ ����Ѵ�.
-������ CPU�� �޸��� ���� �� �Ҹ��� �ְ��Ѵ�.
 */
public class LocalVariable {

	public static void main(String[] args) {
		
		boolean scope = true;
		
		/*
		main �������� num�� �����ϰ� �Ǹ� �׺��� ���� if����
		���������� ���� �̸��� ������ ����� �� ���� �ȴ�.
		ū �������� �̹� �����Ͽ� �޸𸮻� �����ϰ� �ֱ�
		������ �׺��� �������������� ����
		 */
		//int num = 9;//[�����߻�]
		
		if(scope) {
			int num = 1;
			num++;
			System.out.println("ù��° if�� ����:"+ num);
		}
		else {
			int num = 5;
			System.out.println("ù��° if���� else����:"+ num);
		}
		/*
		if���� ������ ����� ���� num�� �ش� ���� �����
		�޸𸮿��� �Ҹ�ȴ�. ���� �Ʒ��� ���� num�� ������ �� �ִ�.
		 */
		int num = 100;
		System.out.println("main�޼ҵ�����:"+ num);
		
		simpleFunc();//�޼ҵ� ȣ��
		
		System.out.println("main�޼ҵ� ��");

	}
	
	static void simpleFunc() {
		/*
		main���� ������ ���� num�� ���� �޸𸮻� ����������
		simpleFunc() �޼ҵ�� ���� ������ ���� �ٸ� �����̹Ƿ�
		���� �̸��� ������ �����ϴ°��� �����ϴ�.
		 */
		int num = 1000;
		System.out.println("simple�޼ҵ�����:"+ num);
	}

}
