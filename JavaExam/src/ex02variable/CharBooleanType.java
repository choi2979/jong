package ex02variable;

public class CharBooleanType {
	/*
	�ƽ�Ű�ڵ� : 1byte�� ǥ���Ҽ� �ִ� ����(����, ����)��
		�������ڵ�� �����Ѱ��� ���Ѵ�.
		Ex) A => 65�� ǥ��
			a => 97�� ǥ��
			
	�����ڵ� : 1byte�� ǥ���� �ȵǴ� ����(�ѱ�, ���� ��)��
		2byte�� �ʿ��ϰ�, �̸� 16������ �����Ѱ��� ���Ѵ�.
	 */
	public static void main(String[] args) {
		/*
		char�� : �ϳ��� ���ڸ� �����Ҽ� �ִ� �ڷ������� ���� �����Ҷ�
			'(Single Quotation)���� ���μ� ǥ���Ѵ�.
			���� "(Double Quotation)���� ���θ� ���ڿ��� �ν��ϹǷ�
			String������ �����ؾ� �Ѵ�.
		 */
		//char chStr = '�����ٶ�';[�����߻�]���ڿ��̹Ƿ� char�� ���ԺҰ���
		String chStr = "�����ٶ�";
//		System.out.println("ch1="+ ch1);
		System.out.println("chStr="+ chStr);
		/*
		char�� ������ ���������� ����ɶ� �ƽ�Ű�ڵ带 ���� ����ǹǷ�
		�Ʒ��� ���� ������ �����ϴ�.
		 */
		char ch2 = 'A';
		int num1 = 2;
		int num2 = ch2 + num1;//65+2=67
		System.out.println("num2="+ num2);//��� : 67
		
		char ch3 = (char) (ch2+num1);//A + 2
		System.out.println("ch3(�������)=>"+ ch3);//���:C
		System.out.println("ch3(�ƽ�Ű�ڵ����)=>"+ (int)ch3);//�ⷰ:67
		
		char ch4 = '1';//���ڰ� �ƴ϶� ����1�̹Ƿ� 49�� ����ȴ�.
		char ch4_1 = 49;
		System.out.println("ch4="+ ch4+", ch4_1:"+ch4_1);
		/*
		bloolean�� : true Ȥ�� false �ΰ����� ���� ������ �ִ�
			������������ �������(+,-,*,/)�̳� �񱳿���(<,>,<=��)��
			����� �Ұ����ϴ�. �� �������� �����ϴ�.(���� é�Ϳ��� �н�)
		 */
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1="+ bn1 +", bn2="+ bn2);
		/*
		&& : �� And�������� ���� ��� ���϶� ���� ��ȯ�Ѵ�.
			�������� ������ ��ȯ�Ѵ�.
			
		|| : �� Or�������� ���� �ϳ��� ���̸� ���� ��ȯ�Ѵ�.
			�׸��� �Ѵ� �����϶� ������ ��ȯ�Ѵ�.
		 */
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3"+ bn3);
		
//		bn3 = '��' > 30000;//��=> �����ڵ� 44032 �̹Ƿ� true��ȯ��
		System.out.println("bn3="+ bn3);
		
		
	}

}
