package ex03operator;

public class LogicOperator {

	public static void main(String[] args) {
		/*
		��������
			&& : ��And. ���ʸ�ΰ� true�϶��� true,
				�������� false�� ��ȯ�Ѵ�.
			|| : ��Or. ���ʸ� true�̸� true�� ��ȯ�ϰ�,
				���� ��� false�϶��� false�� ��ȯ�Ѵ�.
			! :�� Not. �ݴ��� ������ ��ȯ�Ѵ�.
		 */
		int num1 = 10, num2=20;
		
		boolean result1 = (num1==100 && num2==20);//f && t => false
		boolean result2 = (num1<12 || num2>=30);//t || f => true
		
		System.out.println("result1�� ���:"+ result1);//false��ȯ
		System.out.println("result2�� ���:"+ result2);//true��ȯ
		//num1�� num2�� �ٸ��� if ������ ����ȴ�.
		if(!(num1==num2)) {
			System.out.println("num1�� num2�� �ٸ���.");
		}
		else {
			System.out.println("num1�� num2�� ����.");
		}
	}

}
