package ex03operator;

public class ShortCircuitEvaluation {
	/*
	SCE(ShortCircuitEvaluation)
		�ϳ��� ���ǰ˻縸���� ����� �˼��ִ� ��� JAVA�����Ϸ���
		���� ������ �������� �ʰ� �ǳʶٰԵȴ�. �� ��� ������
		���� �ٰ��ϴ� �ڵ尡 �ִٸ� ������� �����Ƿ� �����ؾ��Ѵ�.
	 */

	public static void main(String[] args) {
		
		int num1=0, num2=0;
		boolean result;
		/*
		&& (��And)�� ��� ���� �ϳ��� false�̸� false�� ��ȯ�ϹǷ�
		ù��° ������ false�̸� �ι�° ������ �˻����� �ʴ���.
		 */
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result="+ result);
		System.out.println("num1="+ num1 +", num2="+ num2);
		/*
		||(��Or)�� ��� ���� �ϳ��� true�̸� true�� ��ȯ�ϹǷ�
		ù��° ������ true�̸� �ι�° ������ �������� �ʴ´�.
		 */
		result = (num1+=10)>0 || (num2+=10)>0;
		System.out.println("result="+ result);
		System.out.println("num1="+ num1 +", num2="+ num2);
		/*
		���� num2�� ����� ���α׷��� ������ ��ġ�� �ȴٸ� ������
		ó���� �ʿ��ϹǷ� �ڵ��ۼ��� �����ؾ� �Ѵ�.
		 */
	}

}
