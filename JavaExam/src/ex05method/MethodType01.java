package ex05method;

/*
Method(�޼ҵ�) : ��ü���� ���α׷����� �ൿ �Ǵ� ������ �ǹ��Ѵ�.
	�� ����� ó���ϴ� �ϳ��� ���(�μ�ǰ)�̶� �����Ҽ� �ִ�.
	-�޼ҵ�� �ݵ�� class�ȿ� �����ؾ��Ѵ�.
	-�޼ҵ�ȿ� �ٸ� �޼ҵ带 ������ �� ����.
	-�����Ҷ� �ݵ�� ��ȯŸ���� ����ؾ� �Ѵ�. ���� ��ȯ���� ���ٸ�
	void�� �����Ѵ�.
	-�̸��� ��Ģ�� ������� �����ϴ�. �ҹ��ڷ� �����ϴ� ������
	camel case�� ����Ѵ�. (Ex : simpleFunc(), addCalculate() ��)
	
	JAVA������ Naming Rule(�̸���Ģ)
	-Ŭ������ : SimpleFunc -> �빮�ڷ� �����ϴ� Camel case
	-�޼ҵ�� Ȥ�� ������ : simpleFunc() simpleFunc
	-��� : SIMPLE_FUNC -> ��ü�� �빮�ڷ� �ۼ�
	-��Ű���� : simplefunc -> ��ü�� �ҹ��ڷ� �ۼ�
 */

public class MethodType01 {
	/*
	[�޼ҵ� ����1] �Ű������� ���� ��ȯ���� ���� ���
	: �ش� ������ �ַ� ����� ����ϴ� ��� ���ȴ�.
	��ȯŸ���� �ݵ�� void�� ����ؾ� �Ѵ�.
	 */
	static void noParamNoReturn() {
		System.out.println("==�޴��� �����ϼ���==");
		System.out.println("1.����, 2.����ϱ�, 3.����");
		System.out.println("======================");
	}
	/*
	���� Ŭ���������� �޼ҵ���� �ߺ��� �Ұ����Ѵ�.
	��, �޼ҵ���� �����ϳ� �Ű������� ���� Ȥ�� Ÿ���� �޸��Ͽ�
	�ߺ��� ����ϴ� ������ "�޼ҵ� �����ε�(Overloading)"�̶�
	�Ѵ�. �� ������ �Ȱ��� ������ ���Ǵ� �Ұ����ϴ�.
	 */
	static void noParamNoReturn2() {
		
	}
	
	static void noParamNoReturn2(int a) {
		//������ �̸��� �Լ��� ����Ǿ���. �� �Ű������� ������ �ٸ�.
	}
	
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Return�� ����]");
		
		//return;
		/*
		���Ͱ��� �Լ� �߰��� return�� ���ԵǸ� �Լ��� ����(�Ҹ�)��
		�ǹ��ϹǷ� �� �Ʒ� ������ ������� �ʴ� �ڵ尡 �ȴ�.
		���� ������ �߻��ϹǷ� �Ʒ��� ���� ���ǿ� ���� ��������
		�޶����� �ִ� ���·� �ۼ��ؾ� �Ѵ�.
		 */
		
		if(returnValue%2==0) {
			System.out.println(returnValue +"�� ¦��");
			return;
		}
		
		System.out.println(returnValue +"�� Ȧ��");
		System.out.println("[return�� ����]");
	}

	public static void main(String[] args) {
		
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
		

	}

}
