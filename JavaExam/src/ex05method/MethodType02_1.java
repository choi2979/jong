package ex05method;

/*
[�޼ҵ� ����2] �Ű������� ���� ��ȯ���� �ִ� ���
	: ����ڷκ��� �Է°��� ���� �� ������ �����ϰ� �����
	��ȯ�Ҷ��� ������ �����ϴ� ��� �ַ� ���ȴ�.
 */
public class MethodType02_1 {
	
	//1~10������ ���� ���ϴ� �޼ҵ�
	static int noParamYesReturn() {
		
		int sum = 0;
		for(int i=1 ; i<=10 ; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("1~10������ ��:"+ noParamYesReturn());
		
		int sum10= noParamYesReturn();
		System.out.printf("1����100������ ���� %d�Դϴ�", sum10);
		

	}

}
