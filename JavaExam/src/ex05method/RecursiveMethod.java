package ex05method;
/*
����Լ�(Recursive Method)
	: �ϳ��� �Լ����� �ڽ��� �ٽ� ȣ���Ͽ� �۾��� �����ϴ� �������
	������ �ذ��ϴ� �Լ��� ���Ѵ�. ����ȣ���̶�� �Ѵ�.
 */
public class RecursiveMethod {
	
	static int factorial(int number) {
		
		int result;
		
		if(number==1) {
			result = 1;
		}
		else {
			result = number * factorial(number-1);
		}
		System.out.println("������:number="+ number+ ", result="+ result);
		
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("����Լ��� �̿��� ���丮�� ���ϱ�");
		System.out.println("4factorial:"+ factorial(4));
		System.out.println("10factorial:"+ factorial(10));

	}

}
